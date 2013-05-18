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
public class MenuManageViewController extends SuperController implements Initializable {
    @FXML
    private Button assignButton;
    @FXML
    private Button removeButton;
    @FXML
    private ListView<?> menuActiveListView;
    @FXML
    private ListView<?> MenuInactiveListView;
    @FXML
    private ListView<?> menuItemActiveListView;
    @FXML
    private ListView<?> menuInactiveListView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void asign(ActionEvent event) {
    }

    @FXML
    private void remove(ActionEvent event) {
    }
}
