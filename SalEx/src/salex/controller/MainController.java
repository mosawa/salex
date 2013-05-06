/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import salex.Main;

/**
 * FXML Controller class
 *
 * @author Thilina
 */
public class MainController implements Initializable {

//    private Stage stage;
    private Rectangle2D backupWindowBounds = null;
    private boolean maximized = false;
    @FXML
    private BorderPane root;
    @FXML
    private ToolBar treeToolbar;
    @FXML
    private ToolBar pageToolbar;
    @FXML
    private Button ribbonBlueButton;
    @FXML
    private Button closeButton;
    @FXML
    private Button minimizeButton;
    @FXML
    private Button maximizeButton;
    @FXML
    private TabPane tabPane;
    private Main application;
    private Stage stage;

    public void setApp(Main application) {
        this.application = application;
    }

    @FXML
    private void closeButtonAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    private void minimizeButtonAction(ActionEvent event) {
        stage.setIconified(true);
    }

    @FXML
    private void maximizeButtonAction(ActionEvent event) {
        toogleMaximized();
    }

    public void toogleMaximized() {
        final Screen screen = Screen.getScreensForRectangle(stage.getX(), stage.getY(), 1, 1).get(0);
        if (maximized) {
            maximized = false;
            if (backupWindowBounds != null) {
                stage.setX(backupWindowBounds.getMinX());
                stage.setY(backupWindowBounds.getMinY());
                stage.setWidth(backupWindowBounds.getWidth());
                stage.setHeight(backupWindowBounds.getHeight());
            }
        } else {
            maximized = true;
            backupWindowBounds = new Rectangle2D(stage.getX(), stage.getY(), stage.getWidth(), stage.getHeight());
            stage.setX(screen.getVisualBounds().getMinX());
            stage.setY(screen.getVisualBounds().getMinY());
            stage.setWidth(screen.getVisualBounds().getWidth());
            stage.setHeight(screen.getVisualBounds().getHeight());
        }
    }

    public boolean isMaximized() {
        return maximized;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(Main.class.getResource("view/HomeView.fxml"));
            Node node1 = (Node) loader1.load();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(Main.class.getResource("view/BankView.fxml"));
            Node node2 = (Node) loader2.load();
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(Main.class.getResource("view/CollectionReportView.fxml"));
            Node node3 = (Node) loader3.load();
            Tab tab1 = new Tab();
            tab1.setText("Home");
            tab1.setContent(node1);
            tab1.setClosable(false);            
            Tab tab2 = new Tab();
            tab2.setText("Bank");
            tab2.setContent(node2);
            Tab tab3 = new Tab();
            tab3.setText("Collection Report");
            tab3.setContent(node3);
            tabPane.getTabs().add(tab1);
            tabPane.getTabs().add(tab2);
            tabPane.getTabs().add(tab3);
//            pageArea.getChildren().setAll(tabPane);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
