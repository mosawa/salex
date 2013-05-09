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
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import salex.Main;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thilina
 */
public class MainController extends SuperController implements Initializable {

    private static MainController mainController;

    /**
     * @return the mainController
     */
    public static MainController getInstance() {
        return mainController;
    }
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
        mainController = this;
//        loadPage(Pages.HOME);
        loadTab("HomeView", "Home Page");
//        loadTab("BankView", "Bank Details");
//        loadTab("CollectionReportView", "Collection Report");
//        loadTab("ItemView", "Item Details");
//        loadTab("EmployeeView", "Employee Details");

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Tab loadTab(String fxmlName, String tabTitle) {
        Tab tab = null;
        try {
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.setLocation(Main.class.getResource("view/" + fxmlName + ".fxml"));
            Node node = (Node) fXMLLoader.load();
            tab = new Tab();
            tab.setText(tabTitle);
            tab.setContent(node);
            if (fxmlName.equalsIgnoreCase("HomeView")) {
                tab.setClosable(false);
            }
            tabPane.getTabs().add(tab);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tab;
    }

    public void loadPage(Tab tab) {
        if (!tabPane.getTabs().contains(tab)) {
            tabPane.getTabs().add(tab);
        }
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(tab);
    }
}
