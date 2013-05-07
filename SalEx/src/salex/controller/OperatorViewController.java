/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class OperatorViewController implements Initializable {
    @FXML
    private ComboBox<?> employeeComBox;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
}
