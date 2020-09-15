package com.twu.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    double totSalesTx;
    double tot;
    List<LineItem> lineItems;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
        totSalesTx = 0d;
        tot = 0d;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double getTotSalesTx() {
        return totSalesTx;
    }

    public void setTotSalesTx(double totSalesTx) {
        this.totSalesTx = totSalesTx;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
}
