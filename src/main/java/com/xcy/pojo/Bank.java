package com.xcy.pojo;

public class Bank {
    private int bank_id;
    private String bank_name;
    private String cardpeople;
    private int phonenum;

    public Bank() {
    }

    public Bank(String cardpeople, int phonenum) {
        this.cardpeople = cardpeople;
        this.phonenum = phonenum;
    }

    public Bank(String bank_name, String cardpeople, int phonenum) {
        this.bank_name = bank_name;
        this.cardpeople = cardpeople;
        this.phonenum = phonenum;
    }

    public Bank(String bank_name, String cardpeople) {
        this.bank_name = bank_name;
        this.cardpeople = cardpeople;
    }

    public String getCardpeople() {
        return cardpeople;
    }

    public void setCardpeople(String cardpeople) {
        this.cardpeople = cardpeople;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bank_id=" + bank_id +
                ", bank_name='" + bank_name + '\'' +
                '}';
    }
}
