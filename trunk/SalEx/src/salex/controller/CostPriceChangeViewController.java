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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar = new FXCalendar();
        dateHbox.getChildren().add(calendar);
        makeColumns();
        fillitemComboBox();
      
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

    private void fillitemComboBox() {
         itemComboBox.setItems(FXCollections.observableList(manager.find(Item.class)));
    }

    
    }

   

        
        
        
        
        
        
        
    
