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
        DAMAGE_NOTES = loadTab("DamageNotesView", "Damage Notes");
        DAMAGE_STOCK = loadTab("DamageStockView", "Damage Stock");
        EMPLOYEE_POSITION = loadTab("EmployeePositionView", "Employee Position");
        EMPLOYEE = loadTab("EmployeeView", "Employee Details");
        EXPENSES_PAY = loadTab("ExpensesPayView", "Expenses Pay");
        EXPENSES_PEPORT = loadTab("ExpensesReportView", "Expenses Report");
        FIND_INVOICE = loadTab("FindInvoiceViewController", "Find Invoice");
        HOME = loadTab("HomeView", "Home ");
        ISSUED_CHEQUE_REPORT = loadTab("IssuedChequeReportView", "Issued Cheque Report ");
        ITEM_MOVEMENT = loadTab("ItemMovementView", "Item Movement ");
        ITEM_SALES_REPORT = loadTab("ItemSalesReportView", "Item Sales Report");
        ITEM_TYPE = loadTab("ItemTypeView", "Item Type ");
        ITEM = loadTab("ItemView", "Item ");
        LOGIN = loadTab("Login", "Login ");
        MAIN = loadTab("Main", "Main ");
        MENU_MANAGE = loadTab("MenuManageView", "Menu Manage ");
         MONTH_REPORT = loadTab("MonthReportView", "Month Report  ");
        OPERATOR = loadTab("OperatorView", "Operator");
        PART_PAYMENT_COLLECTION_REPORT = loadTab("PartPaymentCollectionReportView", "Part Payment Collection Report");
        PAYMENT_REPORT = loadTab("PaymentReportView", "Payment Report");
        PERMISSION = loadTab("PermissionView", "Permission ");
        PROFIT_SUMMERY = loadTab("ProfitSummeryView", "Profit Summery");
        PROFIT = loadTab("ProfitView", "Profit");
        PURCHASE_INVOICE_PAYMENT = loadTab("PurchaseInvoicePaymentView", "Purchase Invoice Payment ");
        PURCHASE_INVOICE = loadTab("PurchaseInvoiceView", "Purchase Invoice");
        PURCHASE_REPORT = loadTab("PurchaseReportView", "Purchase Report");
        RECEIVED_CHEQUE_REPORT = loadTab("ReceivedChequeReportView", "Received Cheque Report ");
        REP_SALE_REPORT = loadTab("RepSaleReportView", "RepSale Report ");
        ROOT_AREA = loadTab("RootAreaView", "Root Area");
        SALE_INVOICE_PAYMENT = loadTab("SaleInvoicePaymentView", "Sale Invoice Payment");
        SALE_REPORT = loadTab("SalesReport", "Sales Report ");
        SELING_PRICE_CHANGE = loadTab("SelingPriceChangeView", "Seling Price Change");
        STOCK_CHANGE_REPORT = loadTab("StockChangeReportView", "Stock Change Report");
        STOCK_CHANGE = loadTab("StockChangeView", "Stock Change");
        STOCK_TRANSFER = loadTab("StockTransferView", "Stock Transfer");
        STOCK = loadTab("StockView", "Stock");
        SUB_DEALER = loadTab("SubDealerView", "Sub Dealer");
        SUPPLIER = loadTab("SupplierView", "Supplier");
        TOWN = loadTab("TownView", "Town");
        TRANSFER_REPORT = loadTab("TransferReportView", "Transfer Report");




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
