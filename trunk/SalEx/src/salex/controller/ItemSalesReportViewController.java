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
public class ItemSalesReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    @FXML
    private TableView<?> itemSalesReportTableView;
    @FXML
    private TableColumn<?, ?> dateTableView;
    @FXML
    private TableColumn<?, ?> codeTableView;
    @FXML
    private TableColumn<?, ?> customerTableView;
    @FXML
    private TableColumn<?, ?> invoiceTableView;
    @FXML
    private TableColumn<?, ?> amountTableView;
    @FXML
    private Button fillButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
