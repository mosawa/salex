/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.Employee;
import salex.ent.Item;
import salex.ent.Operator;
import salex.ent.PurchaseInvoice;
import salex.ent.Supplier;
import salex.test.FilterComboBox;

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
    @FXML
    private TextField amountTextFild;
    @FXML
    private TextField supplierTextField;
    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    /**
         * ************* FilterComboBox Start ************************
         */
        final FilterComboBox<Bank> filterComboBox = new FilterComboBox(getBanks());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                   
                }
            }
        });
        hBox.getChildren().add(1, filterComboBox);
        hBox.getChildren().remove(bankComboBox);
        /**
         * ************* FilterComboBox end ************************
         */
        
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
//        `
        fillBankComboBox();
    }
     private ObservableList<Bank> getBanks() {
        List<Bank> banks = manager.find(Bank.class);
        Collections.sort(banks);
        return FXCollections.observableList(banks);
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

//    private void fillSupplierComboBox() {
//      supperComboBox.setItems(FXCollections.observableList(manager.find(PurchaseInvoice.class)));
//    }

    private void fillBankComboBox() {
      bankComboBox.setItems(FXCollections.observableList(manager.find(Bank.class)));
    }
}
