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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.Item;
import salex.test.FilterComboBox;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class SelingPriceChangeViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField newPriceTextField;
    @FXML
    private Button processButton;
    @FXML
    private TableView<?> sellingPriceChangeTableView;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> oldPriceTableColumn;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
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
        final FilterComboBox<Item> filterComboBox = new FilterComboBox(getitems());
        filterComboBox.addEventFilter(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                   
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
    }
    private ObservableList<Item> getitems() {
        List<Item> items = manager.find(Item.class);
        Collections.sort(items);
        return FXCollections.observableList(items);
    }

    @FXML
    private void process(ActionEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }

    @FXML
    private void fill(MouseEvent event) {
    }
}
