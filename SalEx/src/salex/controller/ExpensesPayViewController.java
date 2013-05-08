/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class ExpensesPayViewController implements Initializable {

    @FXML
    private TextField reasonTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private HBox dateHbox;
    @FXML
    private Button updateButton;
    @FXML
    private Button clearButton;
 FXCalendar calendar = new FXCalendar();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        dateHbox.getChildren().add(calendar);
        // TODO
    }

    @FXML
    private void gotoAmount(ActionEvent event) {
        amountTextField.requestFocus();

    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        Date date = calendar.getValue();
String reason = reasonTextField.getText().trim();
String ammount = amountTextField.getText().trim();


    }
}
