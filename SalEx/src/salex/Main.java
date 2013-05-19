/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex;

import com.nanosl.lib.db.Manager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import salex.controller.MainController;

/**
 *
 * @author Thilina
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        System.out.println("javafx.runtime.version: " + System.getProperties().get("javafx.runtime.version"));
        try {
            Manager.setPu("SalExPU");
            Manager.getInstance().clearCache();
            Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));
            Scene scene = new Scene(root);
            loadStyleSheet(scene);
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();
            MainController.getInstance().setStage(stage);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadStyleSheet(Scene scene) {
        scene.getStylesheets().add(Main.class.getResource("/salex/style/Style.css").toExternalForm());
        scene.getStylesheets().add(Main.class.getResource("/salex/style/calendar_styles.css").toExternalForm());
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
}
