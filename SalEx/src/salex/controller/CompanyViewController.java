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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class CompanyViewController implements Initializable {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField sloganOneTextField;
    @FXML
    private TextField sloganTwoTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TextField addressCityTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField contactOneTextField;
    @FXML
    private TextField contactTwoTextField;
    @FXML
    private TextField faxTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField webTextField;
    @FXML
    private Button updateButton;
    @FXML
    private Button clearButton;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoSloganOne(ActionEvent event) {
     sloganOneTextField.requestFocus();
    }

    @FXML
    private void gotoSloganTwo(ActionEvent event) {
        sloganTwoTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
   addressStreetTextField.requestFocus(); }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
          addressStreetTextField.requestFocus();
        
    }

    @FXML
    private void gotoAddressCity(ActionEvent event) {
        addressCityTextField.requestFocus();
    }

    @FXML
    private void gotoContactOne(ActionEvent event) {
        contactOneTextField.requestFocus();
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();
    }

    @FXML
    private void gotoContactTwo(ActionEvent event) {
        contactTwoTextField.requestFocus();
    }

    @FXML
    private void gotoFax(ActionEvent event) {
     faxTextField.requestFocus();
    }

    @FXML
    private void gotoEmail(ActionEvent event) {
        emailTextField.requestFocus();
    }

    @FXML
    private void gotoWeb(ActionEvent event) {
        webTextField.requestFocus();
    }

    @FXML
    private void gotoupdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String Slogon1 = sloganOneTextField.getText().trim();
        String slogon2 = sloganTwoTextField.getText().trim();
        String addressNumber = addressNumberTextField.getText().trim();
        String addressSteet = addressStreetTextField.getText().trim();
        String addressCity = addressCityTextField.getText().trim();
        String contact1 = contactOneTextField.getText().trim();
        String contact2 = contactTwoTextField.getText().trim();
        String fax = faxTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String web = webTextField.getText().trim();
      
                
        
        
        
    }

    @FXML
    private void clear(ActionEvent event) {
        nameTextField.setText("");
        sloganOneTextField.setText("");
        sloganTwoTextField.setText("");
        addressNumberTextField.setText("");
        addressStreetTextField.setText("");
        addressCityTextField.setText("");
        contactOneTextField.setText("");
       contactTwoTextField.setText("");
       faxTextField.setText("");
     emailTextField.setText("");
       
       
    }

    
}
