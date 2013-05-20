/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import salex.SuperController;
import salex.ent.Supplier;
import salex.ent.Town;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class SupplierController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField AddressStreetTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField mobileTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private TextField faxTextField;
    //private ComboBox<?> towncomboBox;
    @FXML
    private TableColumn<Supplier, String> nameTableColumn;
    @FXML
    private TableColumn<Supplier, String> townTableColumn;
    @FXML
    private TableColumn<Supplier, String> codeTableColumn;
    @FXML
    private TableView<Supplier> supplierTableView;
    @FXML
    private ComboBox<Town> townComboBox;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        makeColumns();
        fillTable();
         fillTownComboBox();
        // TODO
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        AddressStreetTextField.requestFocus();
    }

    private void gototown(ActionEvent event) {
        townComboBox.requestFocus();
    }

    @FXML
    private void gotoPhoneNumber(ActionEvent event) {
        phoneNumberTextField.requestFocus();
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
        mobileTextField.requestFocus();
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
        notesTextField.requestFocus();
    }

    @FXML
    private void gotoFax(ActionEvent event) {
        faxTextField.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {

        String code = codeTextField.getText().trim();
        String name = nameTextField.getText().trim();
        String addressnumber = addressNumberTextField.getText().trim();
        String adressstreet = AddressStreetTextField.getText().trim();
         Town town = townComboBox.getSelectionModel().getSelectedItem();
        String phonenumber = phoneNumberTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String notes = notesTextField.getText().trim();
        String fax = faxTextField.getText().trim();
        if (code.equals("") || name.equals("") || phonenumber.equals("")) {
            return;

        }
        Supplier supplier = new Supplier(code);
        supplier.setTown(town);
        supplier.setName(name);
        supplier.setAddressNumber(addressnumber);
        supplier.setAddressStreet(adressstreet);

        supplier.setMobile(mobile);
        supplier.setNotes(notes);
        supplier.setFax(fax);
        manager.update(supplier);
        clear(event);





    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(supplierTableView.getSelectionModel().getSelectedItem());
        clear(event);
       
        
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        addressNumberTextField.setText("");
        AddressStreetTextField.setText("");
        townComboBox.getSelectionModel().clearSelection();
        phoneNumberTextField.setText("");
        mobileTextField.setText("");
        notesTextField.setText("");
        faxTextField.setText("");
        codeTextField.requestFocus();
        fillTable();
    }

    private void fillTable() {
        supplierTableView.setItems(FXCollections.observableList(manager.find(Supplier.class)));
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<Supplier, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Supplier, String>("name"));
        townTableColumn.setCellValueFactory(
                new PropertyValueFactory<Supplier, String>("town"));
    }

    @FXML
    private void fill(KeyEvent event) {
        Supplier supplier = supplierTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(supplier.getCode());
        nameTextField.setText(supplier.getName());
        addressNumberTextField.setText(supplier.getAddressStreet());
        AddressStreetTextField.setText(supplier.getAddressStreet());
        townComboBox.getSelectionModel().clearSelection();
        mobileTextField.setText(supplier.getMobile());
        faxTextField.setText(supplier.getFax());
        notesTextField.setText(supplier.getNotes());
    }

    @FXML
    private void gotoTown(ActionEvent event) {
    }

    @FXML
    private void gotoUpdateButton(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void add(ActionEvent event) {
    }

    @FXML
    private void fillMouse(MouseEvent event) {
        Supplier supplier = supplierTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(supplier.getCode());
        nameTextField.setText(supplier.getName());
        addressNumberTextField.setText(supplier.getAddressStreet());
        AddressStreetTextField.setText(supplier.getAddressStreet());
        // townComboBox.setText(supplier.getCity());
        mobileTextField.setText(supplier.getMobile());
        faxTextField.setText(supplier.getFax());
        notesTextField.setText(supplier.getNotes());
    }

    private void fillTownComboBox() {
        townComboBox.setItems(FXCollections.observableList(manager.find(Town.class)));
    }
}
