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

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class ProfitSummeryViewController implements Initializable {
    @FXML
    private Font x1;
    @FXML
    private HBox dateHBox;
    @FXML
    private TextField totalSaleIncomeTextFild;
    @FXML
    private TextField totalSalecostTextFild;
    @FXML
    private TextField totalSaleCosTextFild;
    @FXML
    private TextField totalPaidExpensesTextFild;
    @FXML
    private TextField totalPaymentTextFild;
    @FXML
    private TextField totalChequeTextFild;
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
