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
import salex.SuperController;
import salex.ent.Bank;
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
    @FXML
    private ComboBox<?> towncomboBox;
    @FXML
    private Button updateBotton;
    @FXML
    private Button deleteBotton;
    @FXML
    private Button clearBotton;
    @FXML
    private TableColumn<Supplier, String> nameTableColumn;
    @FXML
    private TableColumn<Supplier,String> townTableColumn;
    @FXML
    private TableColumn<Supplier,String> codeTableColumn;
    @FXML
    private TableView<Supplier> supplierTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
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

    @FXML
    private void gototown(ActionEvent event) {
        towncomboBox.requestFocus();
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
        towncomboBox.getSelectionModel().getSelectedItem();
        String phonenumber = phoneNumberTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String notes = notesTextField.getText().trim();
        String fax = faxTextField.getText().trim();
        if (code.equals("") || name.equals("") || phonenumber.equals("")) {
            return;

        }
        Supplier supplier = new Supplier(code);
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
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        addressNumberTextField.setText("");
        AddressStreetTextField.setText("");

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
}
