package com.JohnJohn21121;

public class Account {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;



    public Account(String accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int depositFunds) {
        balance += depositFunds;
        System.out.println("Deposit of " + depositFunds + " Processed. New Balance = " + balance);
    }

    public void whitdraw(int withdrawFunds) {
        if (this.balance - withdrawFunds < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not Processed");
        } else {
            balance -= withdrawFunds;
            System.out.println("Withdrawal of " + withdrawFunds + " Processed. Remaining Balance = " + balance);
        }
    }
}
