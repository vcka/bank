package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Account> users = new ArrayList<Account>();
        users.add(new Account("Andrius", "hello@andriuskemeris.com", 12.7, 600));
        users.add(new Account("Tomas", "tomas@abc.com", 1220));
        users.add(new Account("Margarita", "margarita@abc.com", 19, 10));
        users.add(new Account("Marius", "marius@abc.com"));
        users.add(new Account("Jonas", "jonas@abc.com", 6001));

        Transaction t = new Transaction(users.get(0), users.get(1),12.0);

        t.makeTransaction();

        System.out.println(users.get(0).toString());

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Iveskite varda");
//        String name = scn.next();
//        System.out.println("Iveskite emaila");
//        String email = scn.next();
//        System.out.println("Iveskite balansa");
//        double balance = scn.nextDouble();
//        System.out.println("Iveskite kredito limita");
//        int creditLimit = scn.nextInt();
//
//        if(creditLimit > 0) {
//            Account user1 = new Account(name,email,balance, creditLimit);
//            System.out.println(user1.toString());
//        }
//        if(balance > 0 && creditLimit <= 0) {
//            Account user1 = new Account(name,email,balance);
//            System.out.println(user1.toString());
//        }
//        if(creditLimit <= 0 && balance <=0) {
//            Account user1 = new Account(name, email);
//            System.out.println(user1.toString());
//        }

    }

}
