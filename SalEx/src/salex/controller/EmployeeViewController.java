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
import javafx.scene.input.InputEvent;
import salex.SuperController;
import salex.ent.Employee;
import salex.ent.EmployeePosition;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class EmployeeViewController extends SuperController implements Initializable {

    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TextField mobileTextField;
    @FXML
    private TextField fixedLineTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private ComboBox<EmployeePosition> positionComboBox;
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private TableColumn<String, String> hashTableColumn;
    @FXML
    private TableColumn<Employee, String> codeTableColumn;
    @FXML
    private TableColumn<Employee, String> nameTableColumn;
    @FXML
    private TableColumn<Employee, String> mobileTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
        fillPositionComboBox();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String firstName = firstNameTextField.getText().trim();
        String lastName = lastNameTextField.getText().trim();
        EmployeePosition employeePosition = positionComboBox.getSelectionModel().getSelectedItem();
        String addressNumber = addressNumberTextField.getText().trim();
        String addressStreet = addressStreetTextField.getText().trim();
        String city = cityTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String fixedLine = fixedLineTextField.getText().trim();
        String notes = notesTextField.getText().trim();

        if (code.equals("")) {
            codeTextField.requestFocus();
//            showError("Code Reqlired");
            return;
        }
        if (firstName.equals("")) {
            firstNameTextField.requestFocus();
//            showError("First Name Reqlired");
            return;
        }

        Employee employee = manager.find(Employee.class, code);
        if (employee == null) {
            employee = new Employee(code);
        }
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmployeePosition(employeePosition);
        employee.setAddressNumber(addressNumber);
        employee.setAddressStreet(addressStreet);
        employee.setFixedLine(fixedLine);
        employee.setMobile(mobile);
        employee.setNotes(notes);
        employee.setCity(city);
        if (manager.update(employee)) {
            clear(event);
            return;
        }
        showError("Unable to update " + code);
    }

    private void fillTable() {
        employeeTableView.setItems(FXCollections.observableList(manager.find(Employee.class)));
    }

    private void makeColumns() {

        hashTableColumn.setCellValueFactory(
                new PropertyValueFactory<String, String>("hash"));
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<Employee, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Employee, String>("firstName"));
        mobileTableColumn.setCellValueFactory(
                new PropertyValueFactory<Employee, String>("mobile"));
    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(employeeTableView.getSelectionModel().getSelectedItem());
        clear(event);
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        addressStreetTextField.requestFocus();
    }

    @FXML
    private void gotoFirstName(ActionEvent event) {
        firstNameTextField.requestFocus();
    }

    @FXML
    private void gotoLastName(ActionEvent event) {
        lastNameTextField.requestFocus();
    }

    @FXML
    private void gotoPosition(ActionEvent event) {
        positionComboBox.requestFocus();
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
        mobileTextField.requestFocus();
    }

    @FXML
    private void gotoCity(ActionEvent event) {
        cityTextField.requestFocus();
    }

    @FXML
    private void gotoFixedLine(ActionEvent event) {
        fixedLineTextField.requestFocus();
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
        notesTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    private void fillPositionComboBox() {
        positionComboBox.setItems(FXCollections.observableList(manager.find(EmployeePosition.class)));
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        positionComboBox.getSelectionModel().clearSelection();
        addressNumberTextField.setText("");
        addressStreetTextField.setText("");
        cityTextField.setText("");
        mobileTextField.setText("");
        fixedLineTextField.setText("");
        notesTextField.setText("");
        codeTextField.requestFocus();
        fillTable();
    }

    @FXML
    private void fill(InputEvent event) {
        Employee employee = employeeTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(employee.getCode());
        firstNameTextField.setText(employee.getFirstName());
        lastNameTextField.setText(employee.getLastName());
        positionComboBox.getSelectionModel().select(employee.getEmployeePosition());
        addressNumberTextField.setText(employee.getAddressNumber());
        addressStreetTextField.setText(employee.getAddressStreet());
        cityTextField.setText(employee.getCity());
        mobileTextField.setText(employee.getMobile());
        fixedLineTextField.setText(employee.getFixedLine());
        notesTextField.setText(employee.getNotes());
    }
}
