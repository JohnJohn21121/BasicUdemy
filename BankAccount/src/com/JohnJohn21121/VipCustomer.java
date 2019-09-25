package com.JohnJohn21121;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name= name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public VipCustomer(String name, int creditLimit){
        this(name,creditLimit, "unknown@email.com");
    }

    public VipCustomer(){
        this("Default name ",100000 ,"default@email.com");

    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
