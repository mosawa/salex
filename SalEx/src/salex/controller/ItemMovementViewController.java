/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.EmployeePosition;
import salex.ent.Item;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ItemMovementViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHBox;
    @FXML
    private ComboBox<Item> itemcomboBox;
    @FXML
    private TableColumn<?, ?> receive;
    @FXML
    private TableColumn<?, ?> receiveQuantityTableColum;
    @FXML
    private TableColumn<?, ?> issueDateTableColum;
    @FXML
    private TableColumn<?, ?> issueQuantityTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHBox.getChildren().add(calendar);
        fillItemComboBox();
    }

    private void fillItemComboBox() {
         itemcomboBox.setItems(FXCollections.observableList(manager.find(Item.class)));
    }
}
