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
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ExpensesReportViewController extends SuperController implements Initializable {

    @FXML
    private Label totalLable;
    @FXML
    private HBox srartDateHbox;
    @FXML
    private HBox endDateHbox;
    @FXML
    private Button fillButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        srartDateHbox.getChildren().add(new FXCalendar());
        endDateHbox.getChildren().add(new FXCalendar());
        // TODO
    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
