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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import salex.SuperController;
import salex.ent.Item;
import salex.ent.Operator;

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
    private TableColumn<?, ?> nameTableColum;
    @FXML
    private TableColumn<?, ?> usernameTableColum;
    @FXML
    private TableColumn<?, ?> createdDateTableColum;
    @FXML
    private TableColumn<?, ?> createdByTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       fillOperatorConboBox();
    }

    @FXML
    private void gotoUsername(ActionEvent event) {
        usernameTextField.requestFocus();
    }

    @FXML
    private void gotoPassword(ActionEvent event) {
        passwordTextField.requestFocus();
    }

    @FXML
    private void login(ActionEvent event) {
    }

    private void fillOperatorConboBox() {
        employeeComboBox.setItems(FXCollections.observableList(manager.find(Operator.class)));
    }
}
