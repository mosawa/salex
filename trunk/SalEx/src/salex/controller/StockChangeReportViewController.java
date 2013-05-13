/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class StockChangeReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private TableView<?> stockChangeReporeTableView;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> oldQuantityTableColumn;
    @FXML
    private TableColumn<?, ?> actualQuantityTableColumn;
    @FXML
    private TableColumn<?, ?> deferentTableColumn;
    @FXML
    private TableColumn<?, ?> rateTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
    }

    @FXML
    private void fill(MouseEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}
