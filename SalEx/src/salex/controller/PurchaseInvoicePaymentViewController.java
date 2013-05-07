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
public class PurchaseInvoicePaymentViewController implements Initializable {
        private HBox dateHBoox;
    @FXML
    private TextField numberTextFild;
    @FXML
    private TextField ammountTextFild;
    @FXML
    private TextField remainingtextFild;
    @FXML
    private ComboBox<?> supperComboBox;
    @FXML
    private HBox dateHBox;
    @FXML
    private ComboBox<?> bankComboBox;
    @FXML
    private TextField chequeNumberTextFild;
    @FXML
    private TextField bankingDateTextFild;
    @FXML
    private Button addButton;
    @FXML
    private Button clearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
         dateHBoox.getChildren().add(new FXCalendar()); // TODO
    }    

    @FXML
    private void bank(ActionEvent event) {
    }

    @FXML
    private void gotoBankingDate(ActionEvent event) {
      bankingDateTextFild.requestFocus();
    }

    @FXML
    private void gotoBank(ActionEvent event) {
        bankComboBox.requestFocus();
    }

    @FXML
    private void gotoAmount(ActionEvent event) {
        ammountTextFild.requestFocus();
    }

    @FXML
    private void add(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        chequeNumberTextFild.setText("");
        bankingDateTextFild.setText("");
        ammountTextFild.setText("");
        bankComboBox.setTooltip("");
    }
}
