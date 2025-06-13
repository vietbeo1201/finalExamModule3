package com.example.finalmodule3.model;

public class customer {
    private int customerId;
    private String customerName;
    private String cusbirthOfDate;
    private String cusPhoneNumber;
    private String cusAddress;
    private String cusEmail;

    customer(){}

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCusbirthOfDate() {
        return cusbirthOfDate;
    }

    public void setCusbirthOfDate(String cusbirthOfDate) {
        this.cusbirthOfDate = cusbirthOfDate;
    }

    public String getCusPhoneNumber() {
        return cusPhoneNumber;
    }

    public void setCusPhoneNumber(String cusPhoneNumber) {
        this.cusPhoneNumber = cusPhoneNumber;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    customer(int customerId, String customerName, String cusbirthOfDate, String cusPhoneNumber, String cusAddress, String cusEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.cusbirthOfDate = cusbirthOfDate;
        this.cusPhoneNumber = cusPhoneNumber;
        this.cusAddress = cusAddress;
        this.cusEmail = cusEmail;


    }
}


