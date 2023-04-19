
package com.mycompany.project;

public class invoice {

    private double ul; //usage limit
    private double cs;// current spending
    private int LDTP;// last day to pay 

    public invoice(double usagelimit, int LastDayToPay) {
        this.cs = 0;
        this.LDTP = 30;
    }

    public boolean isLimitEceeded(double amount) {
        return false;
    }

    public void addcost(double amount) {
        this.cs += amount;
    }

    public void pay(double amount) {
        if (amount == cs) {
            this.LDTP = 30;
        }
    }

    public void changeusagelimit(double amount) {
        this.ul = amount;
    }
}
