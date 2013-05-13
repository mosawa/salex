/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class StockChangeViewController extends SuperController implements Initializable {

    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField actualQuantityTextField;
    @FXML
    private TableView<?> stockChangeTableView;
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
    @FXML
    private Button processButton;
    @FXML
    private Button resetButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void fill(KeyEvent event) {
    }

    @FXML
    private void process(ActionEvent event) {
    }

    @FXML
    private void reset(ActionEvent event) {
    }

    @FXML
    private void fill(MouseEvent event) {
    }
}
