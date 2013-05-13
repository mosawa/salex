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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import salex.SuperController;
import salex.ent.Customer;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class CustomerViewController extends SuperController implements Initializable {

    @FXML
    private TableView<Customer> customerTableView;
    @FXML
    private TableColumn<Customer, String> hashColumn;
    @FXML
    private TableColumn<Customer, String> codeColumn;
    @FXML
    private TableColumn<Customer, String> nameColumn;
    @FXML
    private TableColumn<Customer, String> mobileColumn;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField fixedLineTextField;
    @FXML
    private TextField faxTextField;
    @FXML
    private TextField mobileTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button updateButton;

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
    private void gotoCity(ActionEvent event) {
        cityTextField.requestFocus();
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
        mobileTextField.requestFocus();
    }

    @FXML
    private void gotoFax(ActionEvent event) {
        faxTextField.requestFocus();

    }

    @FXML
    private void gotoNotes(ActionEvent event) {
        notesTextField.requestFocus();
    }

       

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
        
    }

    @FXML
    private void delete(ActionEvent event) {
         manager.delete(customerTableView.getSelectionModel().getSelectedItem());
         clear(event);
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.requestFocus();
        codeTextField.setText("");
        nameTextField.setText("");
        addressNumberTextField.setText("");
        addressStreetTextField.setText("");
        cityTextField.setText("");
        mobileTextField.setText("");
        fixedLineTextField.setText("");
        faxTextField.setText("");
        notesTextField.setText("");
        codeTextField.requestFocus();
        fillTable();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = nameTextField.getText().trim();
        if (code.equals("")) {
            codeTextField.requestFocus();
            return;
        }
        if (name.equals("")) {
            nameTextField.requestFocus();
            return;
        }

        String addressNumber = addressNumberTextField.getText().trim();
        String addressStreet = addressStreetTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String fixedLine = fixedLineTextField.getText().trim();
        String fax = faxTextField.getText().trim();
        String notes = notesTextField.getText().trim();
        String city = cityTextField.getText().trim();
        Customer customer = manager.find(Customer.class, code);
        if (customer == null) {
            customer = new Customer(code);
        }
        customer.setName(name);
        customer.setAddressNumber(addressNumber);
        customer.setAddressStreet(addressStreet);
        customer.setFax(fax);
        customer.setFixedLine(fixedLine);
        customer.setMobile(mobile);
        customer.setNotes(notes);
        customer.setCity(city);
        if (manager.update(customer)) {
            clear(event);
            return;
//            clear();
//            codeField.requestFocus();

        }
    }

    private void makeColumns() {
        codeColumn.setCellValueFactory(
                new PropertyValueFactory<Customer, String>("code"));
        nameColumn.setCellValueFactory(
                new PropertyValueFactory<Customer, String>("name"));
        mobileColumn.setCellValueFactory(
                new PropertyValueFactory<Customer, String>("mobile"));
    }

    private void fillTable() {
        customerTableView.setItems(FXCollections.observableList(manager.find(Customer.class)));
    }

    @FXML
    private void fill(KeyEvent event) {
        Customer customer = customerTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(customer.getCode());
        nameTextField.setText(customer.getName());
        addressNumberTextField.setText(customer.getAddressStreet());
        addressStreetTextField.setText(customer.getAddressStreet());
        cityTextField.setText(customer.getCity());
        mobileTextField.setText(customer.getMobile());
        fixedLineTextField.setText(customer.getFixedLine());
        faxTextField.setText(customer.getFax());
        notesTextField.setText(customer.getNotes());


    }

    @FXML
    private void gotoFixedLine(ActionEvent event) {
        fixedLineTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        addressStreetTextField.requestFocus();
    }

    
}
