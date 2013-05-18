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
import javafx.scene.input.InputEvent;
import salex.SuperController;
import salex.ent.EmployeePosition;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class EmployeePositionViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableView<EmployeePosition> employeePositionTableView;
    @FXML
    private TableColumn<EmployeePosition, String> nameColumn;
    @FXML
    private TableColumn<EmployeePosition, String> codeColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();
    }

    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
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

        EmployeePosition employeePosition = manager.find(EmployeePosition.class, code);
        employeePosition = employeePosition == null ? new EmployeePosition(code) : employeePosition;
        employeePosition.setDescription(name);
        if (manager.update(employeePosition)) {
            clear(event);
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        fillTable();
    }

    private void makeColumns() {
        codeColumn.setCellValueFactory(
                new PropertyValueFactory<EmployeePosition, String>("code"));
        nameColumn.setCellValueFactory(
                new PropertyValueFactory<EmployeePosition, String>("description"));
    }

    private void fillTable() {
        employeePositionTableView.setItems(FXCollections.observableList(manager.find(EmployeePosition.class)));
    }

    @FXML
    private void fill(InputEvent event) {
        EmployeePosition employeePosition = employeePositionTableView.getSelectionModel().getSelectedItem();
        if (employeePosition == null) {
            return;
        }
        codeTextField.setText(employeePosition.getCode());
        nameTextField.setText(employeePosition.getDescription());
    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(employeePositionTableView.getSelectionModel().getSelectedItem());
        clear(event);
    }
}
