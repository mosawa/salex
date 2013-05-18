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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ProfitViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    @FXML
    private Font x1;
    @FXML
    private TextField totalIncomeTextFild;
    @FXML
    private TextField totalCostTextFild;
    @FXML
    private TextField totalProfitTextFild;
    @FXML
    private Button printButton;
    @FXML
    private TableView<?> profitViewTableView;
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
    private void print(ActionEvent event) {
    }
}
