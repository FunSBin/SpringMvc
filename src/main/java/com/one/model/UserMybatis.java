package com.one.model;

public class UserMybatis {
    private String id;
    private String real_name;
    private String card_no;
    private String balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserMybatis{" +
                "id='" + id + '\'' +
                ", real_name='" + real_name + '\'' +
                ", card_no='" + card_no + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
