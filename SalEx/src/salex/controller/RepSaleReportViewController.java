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
import salex.ent.RepSale;
import salex.ent.SaleCheque;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class RepSaleReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox dateHbox;
    @FXML
    private ComboBox<RepSale> repComboBox;
    @FXML
    private TableColumn<?, ?> codeTableColumn;
    @FXML
    private TableColumn<?, ?> descriptionTableColumn;
    @FXML
    private TableColumn<?, ?> loadedTableColumn;
    @FXML
    private TableColumn<?, ?> remainingTableColumn;
    @FXML
    private TableColumn<?, ?> soldTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
        fillRepCombmBox();
    }

    private void fillRepCombmBox() {
         repComboBox.setItems(FXCollections.observableList(manager.find(RepSale.class)));
        
         }
}
