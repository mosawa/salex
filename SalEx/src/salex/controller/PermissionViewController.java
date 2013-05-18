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
import javafx.scene.control.ListView;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PermissionViewController extends SuperController implements Initializable {

    @FXML
    private Button grantButton;
    @FXML
    private Button removeButton;
    @FXML
    private ListView<?> operatorListView;
    @FXML
    private ListView<?> permitedListView;
    @FXML
    private ListView<?> availableListView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void grant(ActionEvent event) {
    }

    @FXML
    private void remove(ActionEvent event) {
    }
}
