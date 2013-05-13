/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

//import com.sai.javafx.calendar.FXCalendar;
import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class CollectionReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox hBox;

        FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new FXCalendar();
    @FXML
    private Button fillButton;
    @FXML
    private TableView<?> chequeTableView;
    @FXML
    private TableColumn<?, ?> chequeNumberTableColumn;
    @FXML
    private TableColumn<?, ?> bankTableColumn;
    @FXML
    private TableColumn<?, ?> bankingDateTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> invoiceTableColumn;
    @FXML
    private Label chequeTableLabel;
    @FXML
    private Font x1;
    @FXML
    private Label cashTotalLabel;
    @FXML
    private TableView<?> cashTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> customerTableColumn;
    @FXML
    private TableColumn<?, ?> receiptTableColumn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hBox.getChildren().addAll(calendar1, calendar2);
    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
