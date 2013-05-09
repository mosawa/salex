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
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class SalesReportController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private Button fillButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dateHbox.getChildren().addAll(new FXCalendar(), new FXCalendar());


    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
