/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Employee;
import salex.ent.Item;
import salex.ent.Operator;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class OperatorViewController extends SuperController implements Initializable {

    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox<Operator> employeeComboBox;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> usernameTableColumn;
    @FXML
    private TableColumn<?, ?> createdDateTableColumn;
    @FXML
    private TableColumn<?, ?> createdByTableColumn;
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
        final FilterComboBox<Employee> filterComboBox = new FilterComboBox(getemployees());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    usernameTextField.requestFocus();
                }
            }
        });
        hBox.getChildren().add(1, filterComboBox);
        hBox.getChildren().remove(employeeComboBox);
        /**
         * ************* FilterComboBox end ************************
         */
        fillOperatorConboBox();
    }

    private ObservableList<Employee> getemployees() {
        List<Employee> employees = manager.find(Employee.class);
        Collections.sort(employees);
        return FXCollections.observableList(employees);
    }

    @FXML
    private void gotoUsername(ActionEvent event) {
        usernameTextField.requestFocus();
    }

    @FXML
    private void gotoPassword(ActionEvent event) {
        passwordTextField.requestFocus();
    }

    private void fillOperatorConboBox() {
        employeeComboBox.setItems(FXCollections.observableList(manager.find(Operator.class)));
    }

    @FXML
    private void add(ActionEvent event) {
    }
}
