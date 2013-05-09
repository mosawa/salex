/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class TransferReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();

        dateHbox.getChildren().add(calendar);

    }
}
