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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.DamageNotes;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class DamageNotesViewController extends SuperController implements Initializable {

    @FXML
    private ComboBox<DamageNotes> repComboBox;
    @FXML
    private Button reloadButton;
    @FXML
    private HBox dateHbox;
    @FXML
    private Label totalLable;
    @FXML
    private TableColumn<?, ?> dateTableColum;
    @FXML
    private TableColumn<?, ?> codeTableColum;
    @FXML
    private TableColumn<?, ?> descriptionTableColum;
    @FXML
    private TableColumn<?, ?> quantityTableColum;
    @FXML
    private TableColumn<?, ?> rateTableColum;
    @FXML
    private TableColumn<?, ?> valueTableColum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
        fillrepComboBox();
    }

    @FXML
    private void fillTable(ActionEvent event) {
    }

    private void fillrepComboBox() {
        repComboBox.setItems(FXCollections.observableList(manager.find(DamageNotes.class)));
    }
}
