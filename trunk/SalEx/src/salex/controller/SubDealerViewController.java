package salex.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;
import salex.ent.SubDealer;
import salex.ent.Town;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class SubDealerViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField ownerTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private ComboBox<Town> townComboBox;
    private Button UpdateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TableColumn<SubDealer, String> codeTableColumn;
    @FXML
    private TableColumn<SubDealer, String> nameTableColumn;
    @FXML
    private TableColumn<SubDealer, String> mobileTableColumn;
    @FXML
    private TableView<SubDealer> subDealerTableView;
    @FXML
    private Button updateButton;
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
        final FilterComboBox<Town> filterComboBox = new FilterComboBox(getTowns());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    phoneTextField.requestFocus();
                }
            }
        });
        makeColumns();
        fillTable();
        fillTownComboBox();
        // TODO
    }

    private ObservableList<Town> getTowns() {
        List<Town> towns = manager.find(Town.class);
        Collections.sort(towns);
        return FXCollections.observableList(towns);
    }

    @FXML
    private void gotoName(ActionEvent event) {
        NameTextField.requestFocus();
    }

    @FXML
    private void gotoOwner(ActionEvent event) {
        ownerTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        addressStreetTextField.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        UpdateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = NameTextField.getText().trim();
        String owner = ownerTextField.getText().trim();
        String addressNumber = addressNumberTextField.getText().trim();
        String addressStreet = addressStreetTextField.getText().trim();
        String phone = phoneTextField.getText().trim();

        if (code.equals("") || name.equals("")) {
            return;
        }
        SubDealer subDealer = new SubDealer(code);
        subDealer.setName(name);
        subDealer.setOwner(owner);
        subDealer.setAddress(addressNumber + " " + addressStreet);
        subDealer.setContact(phone);
        subDealer.setName(addressStreet);
        manager.update(subDealer);

        clear(event);

    }

    @FXML
    private void gotoTown(ActionEvent event) {
        townComboBox.getSelectionModel().getSelectedItem();




    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(subDealerTableView.getSelectionModel().getSelectedItem());
        clear(event);
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        NameTextField.setText("");
        ownerTextField.setText("");
        addressNumberTextField.setText("");
        addressStreetTextField.setText("");

        phoneTextField.setText("");
        codeTextField.requestFocus();
        fillTable();







    }

    private void fillTable() {
        subDealerTableView.setItems(FXCollections.observableList(manager.find(SubDealer.class)));
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("name"));
        mobileTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("mobile"));
    }

    @FXML
    private void fill(KeyEvent event) {
        SubDealer subDealer = subDealerTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(subDealer.getCode());
        NameTextField.setText(subDealer.getName());
        townComboBox.getSelectionModel().select(subDealer.getTown());
        ownerTextField.setText(subDealer.getOwner());
        //addressNumberTextField.setText(subDealer.get);
        addressStreetTextField.setText(subDealer.getStreet());
        phoneTextField.setText(subDealer.getContact());
    }

    @FXML
    private void gotoPhone(ActionEvent event) {
    }

    private void fillTownComboBox() {
        townComboBox.setItems(FXCollections.observableList(manager.find(Town.class)));

    }

    @FXML
    private void fillMouse(MouseEvent event) {
        SubDealer subDealer = subDealerTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(subDealer.getCode());
        NameTextField.setText(subDealer.getName());
        townComboBox.getSelectionModel().select(subDealer.getTown());
        ownerTextField.setText(subDealer.getOwner());
        //addressNumberTextField.setText(subDealer.get);
        addressStreetTextField.setText(subDealer.getStreet());
        phoneTextField.setText(subDealer.getContact());
    }
}
