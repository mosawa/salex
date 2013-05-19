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
import javafx.scene.input.InputEvent;
import salex.SuperController;
import salex.ent.Bank;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class BankViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableView<Bank> bankTableView;
    @FXML
    private TableColumn<Bank, String> codeTableColumn;
    @FXML
    private TableColumn<Bank, String> nameTableColumn;
    @FXML
    private Button updateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
    }

    @FXML
    private void gotoNameTextField(ActionEvent event) {
        nameTextField.requestFocus();
    }

    private void gotoUpdateButton(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = nameTextField.getText().trim();
        if (code.equals("") || name.equals("")) {
            return;
        }
        Bank bank = new Bank(code);
        bank.setName(name);
        manager.update(bank);
        clear(event);
    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(bankTableView.getSelectionModel().getSelectedItem());
        clear(event);
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        codeTextField.requestFocus();
        fillTable();
    }

    private void fillTable() {
        bankTableView.setItems(FXCollections.observableList(manager.find(Bank.class)));
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<Bank, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Bank, String>("name"));
    }

    @FXML
    private void fill(InputEvent event) {
        Bank bank = bankTableView.getSelectionModel().getSelectedItem();
        codeTextField.setText(bank.getCode());
        nameTextField.setText(bank.getName());
    }
}