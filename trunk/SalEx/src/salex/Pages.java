package salex;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import salex.controller.MainController;

public class Pages {

    public static Tab AVERAGE_PRICE, BANK, COLLECTION_REPORT, COMPANY, COST_PRICE_CHANGE,
            DAMAGE_NOTES, DAMAGE_STOCK, EMPLOYEE_POSITION, EMPLOYEE, EXPENSES_PAY, EXPENSES_PEPORT,
            FIND_INVOICE, HOME, ISSUED_CHEQUE_REPORT, ITEM_MOVEMENT, ITEM_SALES_REPORT,
            ITEM_TYPE, ITEM, LOGIN, MAIN, MENU_MANAGE, MONTH_REPORT, OPERATOR,
            PART_PAYMENT_COLLECTION_REPORT, PAYMENT_REPORT, PERMISSION, PROFIT_SUMMERY,
            PROFIT, PURCHASE_INVOICE_PAYMENT, PURCHASE_INVOICE, PURCHASE_REPORT,
            RECEIVED_CHEQUE_REPORT, REP_SALE_REPORT, ROOT_AREA, SALE_INVOICE_PAYMENT,
            SALE_REPORT, SELING_PRICE_CHANGE, STOCK_CHANGE_REPORT, STOCK_CHANGE,
            STOCK_TRANSFER, STOCK, SUB_DEALER, SUPPLIER, TOWN, TRANSFER_REPORT;

    static {
        AVERAGE_PRICE = loadTab("AveragePriceView", "Average price");
        BANK = loadTab("BankView", "Bank Details");
        COLLECTION_REPORT = loadTab("CollectionReportView", "Collection Report");
        COMPANY = loadTab("CompanyView", "Company Details");
        COST_PRICE_CHANGE = loadTab("CostPriceChangeView", "Cost Price Change");
        DAMAGE_NOTES = loadTab("DamageNotesView", "Employee Details");
        DAMAGE_STOCK = loadTab("DamageStockView", "Damage Stock");
        EMPLOYEE_POSITION = loadTab("EmployeePositionView", "Employee Position");
        EMPLOYEE = loadTab("EmployeeView", "Employee Details");
        EXPENSES_PAY = loadTab("ExpensesPayView", "Expenses Pay");
        EXPENSES_PEPORT = loadTab("ExpensesReportView", "Expenses Report");
    }

    public static Tab loadTab(String fxmlName, String tabTitle) {
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
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tab;

    }
}
