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
public class RootAreaViewController extends SuperController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();

    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
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
