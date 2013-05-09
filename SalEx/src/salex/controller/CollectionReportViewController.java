/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

//import com.sai.javafx.calendar.FXCalendar;
import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class CollectionReportViewController extends SuperController implements Initializable {

    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXCalendar calendar1 = new FXCalendar();
        FXCalendar calendar2 = new FXCalendar();
        hBox.getChildren().addAll(calendar1, calendar2);
    }
}
