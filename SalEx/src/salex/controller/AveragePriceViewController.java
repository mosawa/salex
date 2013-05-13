/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

//import com.sai.javafx.calendar.FXCalendar;
import com.sai.javafx.calendar.FXCalendar;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import salex.SuperController;
import salex.ent.Item;
import salex.ent.PurchaseInvoice;
import salex.ent.PurchaseInvoiceHasItem;
import static util.Format.nf2d;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class AveragePriceViewController extends SuperController implements Initializable {

    @FXML
    private Button fillButton;
    @FXML
    private HBox dateHbox;
    FXCalendar calendar = new FXCalendar();
    @FXML
    private TableView<AveragePriceItem> averagePriceTableView;
    @FXML
    private TableColumn<AveragePriceItem, String> codeColumn;
    @FXML
    private TableColumn<AveragePriceItem, String> descriptionColumn;
    @FXML
    private TableColumn<AveragePriceItem, String> minColumn;
    @FXML
    private TableColumn<AveragePriceItem, String> maxColumn;
    @FXML
    private TableColumn<AveragePriceItem, String> averageColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        dateHbox.getChildren().add(calendar);
        
        // TODO
    }

    private void makeColumns() {
        codeColumn.setCellValueFactory(
                new PropertyValueFactory<AveragePriceItem, String>("code"));
        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<AveragePriceItem, String>("description"));
        minColumn.setCellValueFactory(
                new PropertyValueFactory<AveragePriceItem, String>("min"));
        maxColumn.setCellValueFactory(
                new PropertyValueFactory<AveragePriceItem, String>("max"));
        averageColumn.setCellValueFactory(
                new PropertyValueFactory<AveragePriceItem, String>("average"));
    }

    @FXML
    private void fill(ActionEvent event) {
        Date date = calendar.getValue();
        Calendar firstCalendar = Calendar.getInstance();
        Calendar lastCalendar = Calendar.getInstance();
        firstCalendar.setTime(date);
        firstCalendar.set(Calendar.DATE, 1);
        lastCalendar.setTime(date);
        lastCalendar.set(Calendar.DATE, lastCalendar.getMaximum(Calendar.DATE));
        lastCalendar.set(Calendar.HOUR, 23);

        int i = 0;
        double tot = 0;
//        Query qry = man.getEm().createQuery("SELECT i FROM Item i");
//        qry.setParameter("invDate", date);
        Collection<Item> items = manager.find(Item.class);
        List<AveragePriceItem> averagePriceItems = new ArrayList<AveragePriceItem>();
        for (Iterator<Item> it = items.iterator(); it.hasNext();) {
            Item item = it.next();
            Collection<PurchaseInvoiceHasItem> purchaseInvoiceHasItems = item.getPurchaseInvoiceHasItemCollection();
            double max, min;
            max = 0;
            min = Double.MAX_VALUE;
            for (Iterator<PurchaseInvoiceHasItem> it1 = purchaseInvoiceHasItems.iterator(); it1.hasNext();) {
                PurchaseInvoiceHasItem purchaseInvoiceHasItem = it1.next();
                PurchaseInvoice purchaseInvoice = purchaseInvoiceHasItem.getPurchaseInvoice();
                Date invoiceDate = purchaseInvoice.getInvDate();
                if (invoiceDate.after(firstCalendar.getTime()) && invoiceDate.before(lastCalendar.getTime())) {
                    double costPrice = purchaseInvoiceHasItem.getCost();
                    if (max < costPrice) {
                        max = costPrice;
                    }
                    if (min > costPrice) {
                        min = costPrice;
                    }
                }
            }
            averagePriceItems.add(new AveragePriceItem(item, nf2d.format(min == Double.MAX_VALUE ? 0 : min), nf2d.format(max), nf2d.format(max == 0 || min == Double.MAX_VALUE ? max + min == Double.MAX_VALUE ? 0 : min : (max + min) / 2)));
        }
        averagePriceTableView.setItems(FXCollections.observableList(averagePriceItems));
    }

    public static class AveragePriceItem {

        private String code;
        private String description;
        private String min;
        private String max;
        private String average;

        public AveragePriceItem(Item item, String min, String max, String average) {
            this.code = item.getCode();
            this.description = item.getDescription();
            this.min = min;
            this.max = max;
            this.average = average;
        }

        /**
         * @return the code
         */
        public String getCode() {
            return code;
        }

        /**
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @return the min
         */
        public String getMin() {
            return min;
        }

        /**
         * @return the max
         */
        public String getMax() {
            return max;
        }

        /**
         * @return the average
         */
        public String getAverage() {
            return average;
        }
    }
}
