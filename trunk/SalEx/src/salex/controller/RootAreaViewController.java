/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import salex.SuperController;
import salex.ent.RootArea;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class RootAreaViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableColumn<RootArea, String> codeTableColumn;
    @FXML
    private TableColumn<RootArea, String> nameTableColumn;
    @FXML
    private TableView<RootArea> rootTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();

    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String name = nameTextField.getText().trim();
        String code = codeTextField.getText().trim();
        if (name.equals("") || code.equals("")) {
            return;





        }
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        codeTextField.requestFocus();

        filltable();

    }

    private void filltable() {
        rootTableView.setItems(FXCollections.observableList(manager.find(RootArea.class)));


    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<RootArea, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<RootArea, String>("name"));
    }

    @FXML
    private void fill(MouseEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}