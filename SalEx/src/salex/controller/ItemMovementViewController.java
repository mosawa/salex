/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;
import salex.ent.PurchaseInvoiceHasItem;
import salex.ent.SaleInvoiceHasItem;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ItemMovementViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    FXCalendar calendar1 = new FXCalendar();
    FXCalendar calendar2 = new FXCalendar();
    private ComboBox<Item> itemcomboBox;
    @FXML
    private TableColumn<SaleInvoiceHasItem, String> issueDateTableColum;
    @FXML
    private TableColumn<SaleInvoiceHasItem, String> issueQuantityTableColum;
    @FXML
    private TableColumn<PurchaseInvoiceHasItem, String> receiveDateTableColumn;
    @FXML
    private TableColumn<PurchaseInvoiceHasItem, String> receiveQuantityTableColumn;
    @FXML
    private Label receiveTotalLable;
    @FXML
    private Label issueTotalLable;
    @FXML
    private Button fillButton;
    @FXML
    private TableView<PurchaseInvoiceHasItem> itemMovemenReceivetTableView;
    @FXML
    private TableView<SaleInvoiceHasItem> itemMovementIssueTableView;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
         * ************* FilterComboBox Start ************************
         */
        final FilterComboBox<Item> filterComboBox = new FilterComboBox(getItems());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    // costPriceTextField.requestFocus();
                }
            }
        });
        hBox.getChildren().add(1, filterComboBox);
        hBox.getChildren().remove(itemComboBox);
        /**
         * ************* FilterComboBox end ************************
         */
        dateHBox.getChildren().addAll(calendar1, calendar2);
//        fillItemComboBox();
    }

    private ObservableList<Item> getItems() {
        List<Item> items = manager.find(Item.class);
        Collections.sort(items);
        return FXCollections.observableList(items);
    }

//    private void fillItemComboBox() {
//        // itemcomboBox.setItems(FXCollections.observableList(manager.find(Item.class)));
//    }

    @FXML
    private void fill(ActionEvent event) {
//          itemMovementIssueTableView.setRowFactory(null);
//        receiveQuantityTableColumn.setr
    }
}
