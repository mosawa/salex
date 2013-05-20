/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.Calendar;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Employee;
import salex.ent.Item;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class DamageNotesViewController extends SuperController implements Initializable {

    @FXML
    private ComboBox<Employee> repComboBox;
    @FXML
    private Button reloadButton;
    @FXML
    private HBox dateHbox;
    @FXML
    private Label totalLable;
    @FXML
    private TableView<?> damageNotesTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> rateTableColumn;
    @FXML
    private TableColumn<?, ?> valueTableColumn;
    @FXML
    private TableColumn<?, ?> quantityTableColumn;
    @FXML
    private HBox hHbox;

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
                    reloadButton.requestFocus();
                }
            }
        });
        hHbox.getChildren().add(1, filterComboBox);
        hHbox.getChildren().remove(repComboBox);

        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
        fillrepComboBox();
    }

    @FXML
    private void fillTable(ActionEvent event) {
    }

    private ObservableList<Employee> getEmployees() {
        List<Employee> employees = manager.find(Employee.class);
        Collections.sort(employees);
        return FXCollections.observableList(employees);
    }

    private void fillrepComboBox() {
        // repComboBox.setItems(FXCollections.observableList(manager.find(DamageNotes.class)));
    }
}
