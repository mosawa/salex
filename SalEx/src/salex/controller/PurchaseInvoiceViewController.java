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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PurchaseInvoiceViewController extends SuperController implements Initializable {

    @FXML
    private TextField invoiceTextFild;
    @FXML
    private TextField supperTextFild;
    @FXML
    private TextField totalTextFild;
    @FXML
    private HBox dateHBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
    }

    @FXML
    private void gotoSupplier(ActionEvent event) {
        supperTextFild.requestFocus();
    }

    @FXML
    private void displayOnTable(ActionEvent event) {
    }

    @FXML
    private void total(ActionEvent event) {
    }
}