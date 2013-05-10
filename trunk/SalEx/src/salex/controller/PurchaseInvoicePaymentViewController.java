/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.Operator;
import salex.ent.PurchaseInvoice;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PurchaseInvoicePaymentViewController extends SuperController implements Initializable {

    @FXML
    private TextField numberTextFild;
    @FXML
    private TextField ammountTextFild;
    @FXML
    private TextField remainingtextFild;
    @FXML
    private ComboBox<PurchaseInvoice> supperComboBox;
    @FXML
    private HBox dateHBox;
    @FXML
    private ComboBox<Bank> bankComboBox;
    @FXML
    private TextField chequeNumberTextFild;
    @FXML
    private TextField bankingDateTextFild;
    @FXML
    private Button addButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableColumn<?, ?> amountTableColum;
    @FXML
    private TableColumn<?, ?> chequeNumberTableColum;
    @FXML
    private TableColumn<?, ?> bankingDateTableColum;
    @FXML
    private TableColumn<?, ?> bankTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
        fillSupplierComboBox();
        fillBankComboBox();
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
    }

    private void fillSupplierComboBox() {
      supperComboBox.setItems(FXCollections.observableList(manager.find(PurchaseInvoice.class)));
    }

    private void fillBankComboBox() {
      bankComboBox.setItems(FXCollections.observableList(manager.find(Bank.class)));
    }
}
