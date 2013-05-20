/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Employee;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class TransferReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<Employee> repComboBox;
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
    @FXML
    private TableView<?> transferReportTableView;
    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final FilterComboBox<Employee> filterComboBox = new FilterComboBox(getEmployees());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    //costPriceTextField.requestFocus();
                }
            }
        });
        hBox.getChildren().add(1, filterComboBox);
        hBox.getChildren().remove(repComboBox);
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);

    }

//    private void fillRepComboBox() {
//       //  repComboBox.setItems(FXCollections.observableList(manager.find(StockTransfer.class)));
//        
//        }
    private ObservableList<Employee> getEmployees() {
        List<Employee> employees = manager.find(Employee.class);
        Collections.sort(employees);
        return FXCollections.observableList(employees);
    }

    @FXML
    private void fill(KeyEvent event) {
    }

    @FXML
    private void fill(MouseEvent event) {
    }
}
