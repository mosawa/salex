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
import salex.ent.RepSaleValue;
import salex.ent.SaleCheque;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ReceivedChequeReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<RepSaleValue> statesComboBox;
    @FXML
    private TextField statesTextFild;
    @FXML
    private Button updateButton;
    @FXML
    private TableColumn<?, ?> numberTableColum;
    @FXML
    private TableColumn<?, ?> amountTableColum;
    @FXML
    private TableColumn<?, ?> receivedDateTableColum;
    @FXML
    private TableColumn<?, ?> bankingDateTableColum;
    @FXML
    private TableColumn<?, ?> bankTableColum;
    @FXML
    private TableColumn<?, ?> invoiceTableColum;
    @FXML
    private TableColumn<?, ?> receiptTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new  FXCalendar();
        dateHbox.getChildren().addAll(calendar1,calendar2);
        fillStatusCombobox();
    }

    @FXML
    private void update(ActionEvent event) {
    }

    private void fillStatusCombobox() {
        statesComboBox.setItems(FXCollections.observableList(manager.find(RepSaleValue.class)));
        }
}
