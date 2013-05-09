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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class BankViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button upDateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void gotoNameTextField(ActionEvent event) {
        nameTextField.requestFocus();
    }

    @FXML
    private void gotoUpdateButton(ActionEvent event) {
        upDateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = nameTextField.getText().trim();


    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
    }
}
