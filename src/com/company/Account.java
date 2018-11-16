package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {
    private String name;
    private String email;
    private String accountNumber;
    private double balance;
    private boolean isCreditable;
    private int creditLimit;
    public List<Item> items = new ArrayList<>();



    public List<Item> getItems(){
        return items;
    }


    public void addItem(Item item){
        items.add(item);
    }

    public Item getItem(String productId){
        for (int i = 0; i< items.size(); i++){
            Item item = items.get(i);
            if (productId.equals(item.getProductId())) return item;
        }
        System.out.println("Produktas nerastas");
        return null;
    }

    public Item changeItemQuantity(String productId){
        for(int i = 0; i<items.size(); i++){
            Item item = items.get(i);
            if (productId.equals(item.getProductId())) {
                int quantity = items.get(i).getQuantity();
            }
        }
        return null;
    }

    public void removeItem(Object o){
        this.items.remove(o);
    }


    Account(String n, String e){
        this.name = n;
        this.email = e;
        this.balance = 0;
        this.isCreditable = false;
        this.creditLimit = 0;
        this.accountNumber = generateNumber();
    }

    Account(String n, String e, double b){
        this.name = n;
        this.email = e;
        this.balance = b;
        this.isCreditable = false;
        this.creditLimit = 0;
        this.accountNumber = generateNumber();
    }

    Account(String n, String e, double b, int cl){
        this.name = n;
        this.email = e;
        this.balance = b;
        this.isCreditable = true;
        this.creditLimit = cl;
        this.accountNumber = generateNumber();

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", isCreditable=" + isCreditable +
                ", creditLimit=" + creditLimit +
                '}';
    }

    public String printItems(){
        return  "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isCreditable() {
        return isCreditable;
    }

    public void setCreditable(boolean creditable) {
        isCreditable = creditable;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    private String generateNumber(){
        Random rnd = new Random();
        String result = "LT";
        for(int i = 0; i < 18; i++){
            result += String.valueOf(rnd.nextInt(9));
        }
        return result;
    }


}
