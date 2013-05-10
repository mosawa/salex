/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.SaleCheque;
import salex.ent.StockTransfer;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class TransferReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<StockTransfer> repComboBox;
    @FXML
    private TableColumn<?, ?> codeTableColum;
    @FXML
    private TableColumn<?, ?> descriptionTableColum;
    @FXML
    private TableColumn<?, ?> quantityTableColum;
    @FXML
    private TableColumn<?, ?> rateTableColum;
    @FXML
    private TableColumn<?, ?> amountTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();

        dateHbox.getChildren().add(calendar);
        fillRepComboBox();

    }

    private void fillRepComboBox() {
         repComboBox.setItems(FXCollections.observableList(manager.find(StockTransfer.class)));
        
        }
}
