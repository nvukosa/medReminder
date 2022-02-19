package com.example.populate;

public class Medication {
    private String name;
    private String amount;
    private int hour;



    public Medication(String name, String amount, int hour) {
        this.name = name;
        this.amount = amount;
        this.hour = hour;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
