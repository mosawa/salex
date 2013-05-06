/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nanosl.minix;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Thilina
 */
public class MainViewController implements Initializable {
    @FXML
    private Button itemViewButton;
    @FXML
    private Button salesViewButton;
    @FXML
    private Button purchaseViewButton;
    @FXML
    private Button purchaseReportButton;
    @FXML
    private Button salesReportButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void stop(MouseEvent event) {
    }

    @FXML
    private void itemView(ActionEvent event) {
    }

    @FXML
    private void play(MouseEvent event) {
    }

    @FXML
    private void salesView(ActionEvent event) {
    }

    @FXML
    private void purchaseView(ActionEvent event) {
    }

    @FXML
    private void purchaseReport(ActionEvent event) {
    }

    @FXML
    private void salesReport(ActionEvent event) {
    }
}
