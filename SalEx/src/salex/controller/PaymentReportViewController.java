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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PaymentReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    @FXML
    private TableView<?> cashTableView;
    @FXML
    private TableColumn<?, ?> dateColumn;
    @FXML
    private TableColumn<?, ?> codeColumn;
    @FXML
    private TableColumn<?, ?> supplierColumn;
    @FXML
    private TableColumn<?, ?> invoiceColumn;
    @FXML
    private TableColumn<?, ?> bankColumn;
    @FXML
    private TableColumn<?, ?> amountColumn;
    @FXML
    private TextField cashTextField;
    @FXML
    private TableView<?> chequeTableView;
    @FXML
    private TableColumn<?, ?> chequeNumberColumn;
    @FXML
    private TableColumn<?, ?> issuedDateColumn;
    @FXML
    private TableColumn<?, ?> bankDateColumn;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TextField chequeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
    }
}
