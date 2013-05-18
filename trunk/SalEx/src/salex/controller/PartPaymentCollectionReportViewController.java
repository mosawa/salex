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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PartPaymentCollectionReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    @FXML
    private TableView<?> partPaymentCollectionTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> invoiceTableColumn;
    @FXML
    private TableColumn<?, ?> customeTableColumn;
    @FXML
    private TableColumn<?, ?> receiptTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> invoiceAmountTableColumn;
    @FXML
    private TableColumn<?, ?> totalReceivedTableColumn;
    @FXML
    private TableColumn<?, ?> remainnigTableColumn;
    @FXML
    private Label totalLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
    }
}
