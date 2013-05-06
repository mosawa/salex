/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class SaleInvoicePaymentViewController implements Initializable {
    @FXML
    private HBox date1Hbox;
    @FXML
    private HBox date2Hbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        date1Hbox.getChildren().add(new FXCalendar());
        date2Hbox.getChildren().add(new FXCalendar());
    }    
}
