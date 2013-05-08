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
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class StockViewController extends SuperController  implements Initializable {
    @FXML
    private Button reloadButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void reload(ActionEvent event) {
    }
}
