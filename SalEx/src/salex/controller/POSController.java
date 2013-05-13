/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class POSController implements Initializable {
    @FXML
    private Font x1;
    @FXML
    private Font x2;
    @FXML
    private TextField invoiceNumberTextField;
    @FXML
    private HBox dateHBox;
    @FXML
    private ComboBox<?> supplierComboBox;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextField priceTextField;
    @FXML
    private TableView<?> posTableView;
    @FXML
    private TableColumn<?, ?> hashTableColumn;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> priceTableColumn;
    @FXML
    private TableColumn<?, ?> quantityTableColumn;
    @FXML
    private TableColumn<?, ?> netTableColumn;
    @FXML
    private TableColumn<?, ?> discountTableColumn;
    @FXML
    private TableColumn<?, ?> dTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TextField discountTextField;
    @FXML
    private TextField totalAmountTextField;
    @FXML
    private TextField paidAmountTextField;
    @FXML
    private TextField remainingAmountTextField;
    @FXML
    private TextField totalDiscountTextField;
    @FXML
    private TextField receiptTextField;
    @FXML
    private Button processButton;
    @FXML
    private Button clearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void gotoQuantity(ActionEvent event) {
    }

    @FXML
    private void gotoPrice(ActionEvent event) {
    }

    @FXML
    private void gotoItem(ActionEvent event) {
    }

    @FXML
    private void gotoItemComboBox(ActionEvent event) {
    }

    @FXML
    private void process(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }
}
