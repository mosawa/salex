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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ProfitSummeryViewController extends SuperController implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private HBox dateHBox;
     FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new FXCalendar();
    @FXML
    private Button fillButton;
    @FXML
    private TextField totalSaleIncomeTextField;
    @FXML
    private TextField totalSalecostTextField;
    @FXML
    private TextField totalSaleCosTextField;
    @FXML
    private TextField totalPaidExpensesTextField;
    @FXML
    private TextField totalPaymentsTextField;
    @FXML
    private TextField totalChequeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         dateHBox.getChildren().addAll(calendar1, calendar2);
    }

    @FXML
    private void fill(ActionEvent event) {
    }
}
