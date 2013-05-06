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

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class StockTransferViewController implements Initializable {
    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<?> repComboBox;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private Button clearButton;
    @FXML
    private Button transferButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dateHbox.getChildren().add(new FXCalendar());
    }    

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void transfer(ActionEvent event) {
    }
}
