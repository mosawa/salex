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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class CostPriceChangeViewController extends SuperController implements Initializable {

    @FXML
    private ComboBox<Item> itemComboBox;
    @FXML
    private Button processButton;
    @FXML
    private HBox dateHbox;
    @FXML
    private TextField costPriceTextField;
    @FXML
    private TableColumn<Item, String> codeTableColumn;
    @FXML
    private TableColumn<Item, String> descriptionTableColumn;
    @FXML
    private TableColumn<String, String> oldCostTableColumn;
    @FXML
    private TableColumn<String, String> newCostTableColumn;
    @FXML
    private TableView<String> costPriceChangeTableView;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
         * ************* FilterComboBox Start ************************
         */
        final FilterComboBox<Item> filterComboBox = new FilterComboBox(getItems());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    costPriceTextField.requestFocus();
                }
            }
        });
        hBox.getChildren().add(1, filterComboBox);
        hBox.getChildren().remove(itemComboBox);
        /**
         * ************* FilterComboBox end ************************
         */
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
        makeColumns();
    }

    @FXML
    private void gotoCostPrice(ActionEvent event) {
        costPriceTextField.requestFocus();

    }

    @FXML
    private void process(ActionEvent event) {
        String cost = costPriceTextField.getText().trim();
        itemComboBox.getSelectionModel().getSelectedItem();
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<Item, String>("code"));
        descriptionTableColumn.setCellValueFactory(
                new PropertyValueFactory<Item, String>("description"));
        oldCostTableColumn.setCellValueFactory(
                new PropertyValueFactory<String, String>("old"));
        newCostTableColumn.setCellValueFactory(
                new PropertyValueFactory<String, String>("new"));
    }

    @FXML
    private void fillTable(ActionEvent event) {
    }

    private ObservableList<Item> getItems() {
        List<Item> items = manager.find(Item.class);
        Collections.sort(items);
        return FXCollections.observableList(items);
    }
}
