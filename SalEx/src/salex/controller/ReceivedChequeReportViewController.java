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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.RepSaleValue;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ReceivedChequeReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<RepSaleValue> statesComboBox;
    @FXML
    private TextField statesTextFild;
    @FXML
    private Button updateButton;
    @FXML
    private TableColumn<?, ?> numberTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> recivedDateTableColumn;
    @FXML
    private TableColumn<?, ?> bankingDateTableColumn;
    @FXML
    private TableColumn<?, ?> bankTableColumn;
    @FXML
    private TableColumn<?, ?> invoiceTableColumn;
    @FXML
    private TableColumn<?, ?> receiptTableColumn;
    @FXML
    private TableColumn<?, ?> costomerTableColumn;
    @FXML
    private TableView<?> recivedChequeReportTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new  FXCalendar();
        dateHbox.getChildren().addAll(calendar1,calendar2);
        fillStatusCombobox();
    }
    
    @FXML
    private void update(ActionEvent event) {
    }
    
   
    private void fillStatusCombobox() {
       // statesComboBox.setItems(FXCollections.observableList(manager.find(RepSaleValue.class)));
        }

    @FXML
    private void fill(MouseEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}
