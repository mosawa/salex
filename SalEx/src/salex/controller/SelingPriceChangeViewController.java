/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class SelingPriceChangeViewController extends SuperController  implements Initializable {
    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField newPriceTextField;
    @FXML
    private Button processButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dateHbox.getChildren().add(new FXCalendar());
    }    

    @FXML
    private void process(ActionEvent event) {
    }
}
