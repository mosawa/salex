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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.Employee;
import salex.ent.Item;
import salex.ent.Item_;
import salex.ent.Town;
import salex.test.FilterComboBox;

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
    @FXML
    private HBox hBox;
    @FXML
    private HBox hBox1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /**
         * ************* FilterComboBox Start ************************
         */
        final FilterComboBox<Employee> employeeFilterComboBox = new FilterComboBox(getemployees());
        final FilterComboBox<Item> itemFilterComboBox = new FilterComboBox(getItems());
        employeeFilterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    itemFilterComboBox.requestFocus();
                }
            }
        });

        itemFilterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
//                    mobileTextField.requestFocus();
                }
            }
        });


        hBox.getChildren().add(1, employeeFilterComboBox);
        hBox.getChildren().remove(repComboBox);

        hBox1.getChildren().add(1, itemFilterComboBox);
        hBox1.getChildren().remove(itemComboBox);

        /**
         * ************* FilterComboBox end ************************
         */

        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
    }

    private ObservableList<Item> getItems() {
        List<Item> items = manager.find(Item.class);
        Collections.sort(items);
        return FXCollections.observableList(items);

    }

    private ObservableList<Employee> getemployees() {
        List<Employee> employees = manager.find(Employee.class);
        Collections.sort(employees);
        return FXCollections.observableList(employees);


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
