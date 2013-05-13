/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Bank;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class StockTransferViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<?> repComboBox;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private Button clearButton;
    @FXML
    private Button transferButton;
    @FXML
    private TableView<?> stockTransferTableView;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> quantityTableColumn;
    @FXML
    private TableColumn<?, ?> rateTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);

    }

    @FXML
    private void clear(ActionEvent event) {
        quantityTextField.setText("");
        quantityTextField.requestFocus();
    }

    @FXML
    private void transfer(ActionEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }

    @FXML
    private void fill(MouseEvent event) {
    }
}
