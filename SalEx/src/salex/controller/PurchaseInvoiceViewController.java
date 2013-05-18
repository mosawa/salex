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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class PurchaseInvoiceViewController extends SuperController implements Initializable {
    @FXML
    private TableView<?> purchaseInvoiceTableView;
    @FXML
    private TableColumn<?, ?> hashCodeColumn;
    @FXML
    private TableColumn<?, ?> codeTableView;
    @FXML
    private TableColumn<?, ?> descriptionTableView;
    @FXML
    private TableColumn<?, ?> valueTableView;
    @FXML
    private TableColumn<?, ?> quantityTableView;
    @FXML
    private TableColumn<?, ?> rateTableView;
    @FXML
    private TableColumn<?, ?> discountTableView;
    @FXML
    private TableColumn<?, ?> dTableView;
    @FXML
    private TableColumn<?, ?> amountTableView;
    @FXML
    private TextField supplierTextField;
    @FXML
    private TextField itemTextField;
    @FXML
    private TextField invoiceNumberTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextField valueTextField;
    @FXML
    private Button processButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField totalAmountTextField;
    @FXML
    private TextField totalDiscountTextField;
    @FXML
    private TextField discountTextField;
//        private TextField supperTextFild;
//        private HBox dateHBox;
    @FXML
    private HBox dateHBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
    }

        private void gotoSupplier(ActionEvent event) {
////        supperTextFild.requestFocus();
    }

    @FXML
    private void process(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void fill(MouseEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}
