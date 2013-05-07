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
public class SaleInvoicePaymentViewController implements Initializable {

    @FXML
    private HBox date1Hbox;
    @FXML
    private HBox date2Hbox;
    @FXML
    private TextField numberTextField;
    @FXML
    private TextField customerrTextField;
    @FXML
    private TextField amountrTextField;
    @FXML
    private TextField RemainingTextField;
    @FXML
    private TextField chequeNumberTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextField bankingDateTextField;
    @FXML
    private ComboBox<?> bankComboBox;
    @FXML
    private TextField paidTextField;
    @FXML
    private TextField receiptTextField;
    @FXML
    private Button processButton;
    @FXML
    private Button clearButton;
    FXCalendar calendar1 = new FXCalendar();
    FXCalendar calendar2 = new FXCalendar();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        date1Hbox.getChildren().add(calendar1);
        date1Hbox.getChildren().add(calendar2);
    }

    @FXML
    private void gotoDate(ActionEvent event) {
        calendar1.requestFocus();
    }

    @FXML
    private void gotoAmount(ActionEvent event) {
        amountTextField.requestFocus();
    }

    @FXML
    private void gotoRemaining(ActionEvent event) {
        RemainingTextField.requestFocus();
    }

    @FXML
    private void gotoChequeNumber(ActionEvent event) {
        chequeNumberTextField.requestFocus();
    }

    @FXML
    private void gotoBankingDate(ActionEvent event) {
        bankingDateTextField.requestFocus();
    }

    @FXML
    private void gotoBank(ActionEvent event) {
        bankComboBox.requestFocus();
    }

    @FXML
    private void process(ActionEvent event) {
        processButton.requestFocus();
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void gotoprocess(ActionEvent event) {
    }

}
   

