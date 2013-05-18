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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class IssuedChequeReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
     FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new FXCalendar();
    @FXML
    private TableView<?> IssuedChequeReportTableView;
    @FXML
    private TableColumn<?, ?> numberTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> issuedDateTableColumn;
    @FXML
    private TableColumn<?, ?> bankingDateTableColumn;
    @FXML
    private TableColumn<?, ?> bankTableColumn;
    @FXML
    private TableColumn<?, ?> invoiceTableColumn;
    @FXML
    private TableColumn<?, ?> supplierTableColumn;
    @FXML
    private Button fillButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dateHbox.getChildren().addAll(calendar1, calendar2);
    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
