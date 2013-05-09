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
import javafx.util.Duration;
import salex.Pages;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thilina
 */
public class HomeViewController extends SuperController implements Initializable {

    MainController mainController = MainController.getInstance();
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
    @FXML
    private Button testButton;
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
    }

    @FXML
    private void itemView(ActionEvent event) {
        mainController.loadPage(Pages.ITEM);
    }

    @FXML
    private void salesView(ActionEvent event) {
        mainController.loadPage(Pages.ITEM);
    }

    @FXML
    private void purchaseView(ActionEvent event) {
        mainController.loadPage(Pages.PURCHASE_INVOICE);
    }

    @FXML
    private void purchaseReport(ActionEvent event) {
        mainController.loadPage(Pages.PURCHASE_REPORT);
    }

    @FXML
    private void salesReport(ActionEvent event) {
        mainController.loadPage(Pages.SALE_REPORT);
    }

    @FXML
    private void test(ActionEvent event) {
    }
}
