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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class DamageNotesViewController extends SuperController  implements Initializable {
    @FXML
    private ComboBox<?> repComboBox;
    @FXML
    private Button reloadButton;
    @FXML
    private HBox dateHbox;
    @FXML
    private Label totalLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fillTable(ActionEvent event) {
    }
}
