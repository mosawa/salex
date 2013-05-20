/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.nanosl.lib.log.Loggings;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;
import salex.ent.ItemType;
import salex.ent.LastCode;
import salex.ent.PriceList;
import salex.ent.Stock;
import salex.ent.Supplier;
import salex.test.FilterComboBox;
import static util.Format.nf2d;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ItemViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField brandTextField;
    @FXML
    private TextField minimunLimitTextField;
    @FXML
    private ComboBox<Supplier> supplierComboBox;
    @FXML
    private ComboBox<ItemType> typeComboBox;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableView<ItemTableItem> itemTable;
    @FXML
    private TableColumn<ItemTableItem, String> hashColumn;
    @FXML
    private TableColumn<ItemTableItem, String> codeColumn;
    @FXML
    private TableColumn<ItemTableItem, String> descriptionColumn;
    @FXML
    private TableColumn<ItemTableItem, String> quantityColumn;
    @FXML
    private TableColumn<ItemTableItem, String> priceColumn;
        private HBox hBox;
    @FXML
    private Insets x1;
    @FXML
    private HBox hBox2;
    @FXML
    private HBox hBox1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         /**
         * ************* FilterComboBox Start ************************
         */
        final FilterComboBox<Item> filterComboBox = new FilterComboBox(getItemTypes());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    descriptionTextField.requestFocus();
                }
            }
        });
        hBox1.getChildren().add(1, filterComboBox);
        hBox1.getChildren().remove(typeComboBox);
        
        
        
        final FilterComboBox<Supplier> filterComboBox1 = new FilterComboBox(getSuppliers());
        filterComboBox1.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    descriptionTextField.requestFocus();
                }
            }
        });
        hBox2.getChildren().add(1, filterComboBox1);
        hBox2.getChildren().remove(supplierComboBox);
        /**
         * ************* FilterComboBox end ************************
         */
        fillSupplierComboBox();
        fillTypeComboBox();
        makeColumns();
        fillTable();
    }
    
     private ObservableList<ItemType> getItemTypes() {
        List<ItemType> itemTypes = manager.find(ItemType.class);
//        Collections.sort(itemTypes);
        return FXCollections.observableList(itemTypes);
     }
    
     
     private ObservableList<Supplier> getSuppliers() {
        List<Supplier> suppliers = manager.find(Supplier.class);
        Collections.sort(suppliers);
        return FXCollections.observableList(suppliers);
     }

    private void makeColumns() {
        hashColumn.setCellValueFactory(
                new PropertyValueFactory<ItemTableItem, String>("row"));
        codeColumn.setCellValueFactory(
                new PropertyValueFactory<ItemTableItem, String>("code"));
        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<ItemTableItem, String>("description"));
        quantityColumn.setCellValueFactory(
                new PropertyValueFactory<ItemTableItem, String>("quantity"));
        priceColumn.setCellValueFactory(
                new PropertyValueFactory<ItemTableItem, String>("amount"));
    }

    @FXML
    private void gotoDescription(ActionEvent event) {
        String code = codeTextField.getText().trim();
        fill(manager.find(Item.class, code));
        descriptionTextField.requestFocus();
    }

    @FXML
    private void gotoBrand(ActionEvent event) {
        brandTextField.requestFocus();
    }

    @FXML
    private void gotoSupplier(ActionEvent event) {
        supplierComboBox.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String description = descriptionTextField.getText().trim();
        String brand = brandTextField.getText().trim();
        Supplier supplier = supplierComboBox.getSelectionModel().getSelectedItem();

        ItemType itemType = typeComboBox.getSelectionModel().getSelectedItem();

        if (code.equals("")) {
            codeTextField.requestFocus();
            return;
        }
        if (description.equals("")) {
            descriptionTextField.requestFocus();
            return;
        }
        if (supplier == null) {
            showError("Supplier Not selected");
            supplierComboBox.requestFocus();
            supplierComboBox.getSelectionModel().clearAndSelect(0);
        }

        try {
            String minLimText = minimunLimitTextField.getText().trim();
            minLimText = minLimText.isEmpty() ? "0.0" : minLimText;
            double minimumLimit = Double.parseDouble(minLimText);
            Item item = manager.find(Item.class, code);
            List<Serializable> serializables = new ArrayList<>();
            if (item == null) {
                item = new Item(code);
                LastCode lastCode = manager.find(LastCode.class, "Item");
                lastCode = lastCode == null ? new LastCode("Item") : lastCode;
                lastCode.setCode(code);
                serializables.add(lastCode);
            }
            item.setDescription(description);
            item.setBrand(brand);
            item.setSupplier(supplier);
//            ItemType itemType = (ItemType) itemTypeComboBox.getSelectedItem();
            item.setItemTypeType(itemType);
            Stock stock = item.getStock();
            if (stock == null) {
                stock = new Stock(code);
                stock.setBundles(0.0);
                stock.setItem(item);
                stock.setQuantity(0.0);
                stock.setMinLimit(minimumLimit);
                item.setStock(stock);
                serializables.add(stock);
            }
            supplier.getItemCollection().add(item);
            PriceList priceList = manager.find(PriceList.class, code);
            priceList = priceList == null ? new PriceList(code) : priceList;
            priceList.setCostPack(0.0);
            priceList.setItem(item);
            priceList.setSellingPack(0.0);
            priceList.setCostPack(0.0);
            item.setPriceList(priceList);
            serializables.add(supplier);
            serializables.add(item);
            serializables.add(priceList);

            if (manager.update(serializables)) {
                clear(event);
                return;
            }
            showError("Unable to update " + code);
        } catch (NumberFormatException e) {
            showError("Check values again");
        } catch (Exception e) {
            Loggings.logError(getClass().getName(), e);
        }
    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(itemTable.getSelectionModel().getSelectedItem().getItem());
        clear(event);
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        descriptionTextField.setText("");
        brandTextField.setText("");
        minimunLimitTextField.setText("");
        fillTable();
        fillSupplierComboBox();
        fillTypeComboBox();
    }

    @FXML
    private void gotoMinimumLimit(ActionEvent event) {
    }

    private void fillSupplierComboBox() {
        supplierComboBox.setItems(FXCollections.observableList(manager.find(Supplier.class)));
    }

    private void fillTypeComboBox() {
        typeComboBox.setItems(FXCollections.observableList(manager.find(ItemType.class)));
    }

    private void fillTable() {
        int i = 0;
        List<Serializable> serializables = new ArrayList<Serializable>();
        List<Item> items = manager.find(Item.class);
        List<ItemTableItem> itemTableItems = new ArrayList<ItemTableItem>();
        Collections.sort(items);
        for (Iterator<Item> it = items.iterator(); it.hasNext();) {
            Item item = it.next();
            Stock stock = item.getStock();
            if (stock == null) {
                stock = new Stock(item.getCode());
                stock.setBundles(0.0);
                stock.setItem(item);
                stock.setQuantity(0.0);
                item.setStock(stock);
                serializables.add(stock);
            }
            PriceList priceList = item.getPriceList();

            if (priceList == null) {
                priceList = new PriceList(item.getCode());
                priceList.setCostPack(0.0);
                priceList.setCostUnit(0.0);
                priceList.setSellingPack(0.0);
                priceList.setSellingUnit(0.0);
                priceList.setItem(item);
                item.setPriceList(priceList);
                serializables.add(priceList);
            }
            manager.update(serializables);
            double paymentAmount = Double.valueOf(priceList.getSellingPack() != null ? priceList.getSellingPack() : 0);
            itemTableItems.add(new ItemTableItem(++i, item, item.getDescription(), nf3d.format(stock.getQuantity()), nf2d.format(paymentAmount)));

        }
        itemTable.setItems(FXCollections.observableList(itemTableItems));
    }

    @FXML
    private void fill(InputEvent event) {
        ItemTableItem itemTableItem = itemTable.getSelectionModel().getSelectedItem();
        if (itemTableItem == null) {
            return;
        }
        fill(itemTableItem.getItem());
    }

    private void fill(Item item) {
        if (item == null) {
            return;
        }
        codeTextField.setText(item.getCode());
        descriptionTextField.setText(item.getDescription());
        brandTextField.setText(item.getBrand());
        minimunLimitTextField.setText("" + item.getStock().getMinLimit());
        supplierComboBox.getSelectionModel().select(item.getSupplier());
        typeComboBox.getSelectionModel().select(item.getItemTypeType());
    }

    @FXML
    private void select(KeyEvent event) {
    }

    protected static class ItemTableItem {

        private int row;
        private String description;
        private String code;
        private Item item;
        private String amount;
        private String quantity;

        public ItemTableItem(int row, Item item, String description, String quantity, String amount) {
            this.row = row;
            this.item = item;
            this.code = item.getCode();
            this.description = description;
            this.amount = amount;
            this.quantity = quantity;
        }

        public Item getItem() {
            return item;
        }

        public int getRow() {
            return row;
        }

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public String getAmount() {
            return amount;
        }

        public String getQuantity() {
            return quantity;
        }
    }
}
