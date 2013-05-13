package salex.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import salex.SuperController;
import salex.ent.SubDealer;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class SubDealerViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField ownerTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private ComboBox<?> townComboBox;
    @FXML
    private Button UpdateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TableColumn<SubDealer, String> codeTableColumn;
    @FXML
    private TableColumn<SubDealer, String> nameTableColumn;
    @FXML
    private TableColumn<SubDealer, String> mobileTableColumn;
    @FXML
    private TableView<SubDealer> subDealerTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
        // TODO
    }

    @FXML
    private void gotoName(ActionEvent event) {
        NameTextField.requestFocus();
    }

    @FXML
    private void gotoOwner(ActionEvent event) {
        ownerTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        addressStreetTextField.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        UpdateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = NameTextField.getText().trim();
        String owner = ownerTextField.getText().trim();
        String addressNumber = addressNumberTextField.getText().trim();
        String addressStreet = addressStreetTextField.getText().trim();
        String phone = phoneTextField.getText().trim();

        if (code.equals("") || name.equals("")) {
            return;
        }
        SubDealer subDealer = new SubDealer(code);
        subDealer.setName(name);
        subDealer.setAddress(addressNumber + " " + addressStreet);
        subDealer.setContact(phone);
        manager.update(subDealer);
        clear(event);

    }

    @FXML
    private void gotoTown(ActionEvent event) {
        townComboBox.getSelectionModel().getSelectedItem();




    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        NameTextField.setText("");
        ownerTextField.setText("");
        addressNumberTextField.setText("");
        addressStreetTextField.setText("");

        phoneTextField.setText("");
        codeTextField.requestFocus();
        fillTable();







    }

    private void fillTable() {
        subDealerTableView.setItems(FXCollections.observableList(manager.find(SubDealer.class)));
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("name"));
        mobileTableColumn.setCellValueFactory(
                new PropertyValueFactory<SubDealer, String>("mobile"));
    }

    @FXML
    private void fill(MouseEvent event) {
    }

    @FXML
    private void fill(KeyEvent event) {
    }
}
