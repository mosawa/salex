/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class SalesReportController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private Button fillButton;
    @FXML
    private TableView<?> saleReportTableView;
    @FXML
    private TableColumn<?, ?> itemTableColumn;
    @FXML
    private TableColumn<?, ?> soldQuantityTableColumn;
    @FXML
    private TableColumn<?, ?> soldPriceTableColumn;
    @FXML
    private TableColumn<?, ?> incomeTableColumn;
    @FXML
    private TableColumn<?, ?> itemCostTableColumn;
    @FXML
    private TableColumn<?, ?> totalCostTableColumn;
    @FXML
    private TableColumn<?, ?> profitTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar1 = new FXCalendar ();
        FXCalendar calendar2 = new FXCalendar ();
        dateHbox.getChildren().addAll(calendar1,calendar2);


    }

    @FXML
    private void fill(ActionEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}
