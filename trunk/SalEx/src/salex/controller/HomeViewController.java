/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import com.fxexperience.javafx.animation.TadaTransition;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Thilina
 */
public class HomeViewController implements Initializable {
    @FXML
    private Label label;
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

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    FadeTransition ft;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        makeFt();
    }

    @FXML
    private void play(javafx.scene.input.MouseEvent event) {

        new TadaTransition((Node) event.getSource()).play();
        /*
         ft.setNode((Node) event.getSource());
         ft.play();
         */
//        System.out.println("hhhh");
    }

    @FXML
    private void stop(javafx.scene.input.MouseEvent event) {
        ft.jumpTo(Duration.ZERO);
        ft.stop();
//        System.out.println("yiuhuiihkhh");
    }

    private void makeFt() {

        ft = new FadeTransition(Duration.millis(1000));
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);

//        System.out.println("yyyyyyyyyyyyyyyy");
    }

    @FXML
    private void itemView(ActionEvent event) {
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