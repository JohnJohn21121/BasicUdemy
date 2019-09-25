package com.JohnJohn21121;

public class Main {
    public static void main(String[] args) {

        Account bobAccount = new Account("21121",200,"Bob Brown","email@bob.com"
        , "(+54) 11 1234-5678");

        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getEmail());
        System.out.println(bobAccount.getPhoneNumber());

        bobAccount.whitdraw(100);

        bobAccount.deposit(50);
        bobAccount.whitdraw(100);

        bobAccount.deposit(52);
        bobAccount.whitdraw(100);

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Manolo", 30000);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Alejandro",5000, "capullo@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
