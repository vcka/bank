package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    Menu(){
        init();
    }

    String regex = "^(.+)@(.+)$";

    Pattern pattern = Pattern.compile(regex);


    public void init(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String name = scn.next();

        String email;
        do {
            System.out.println("Iveskite emaila");
            email = scn.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) break;
            else System.out.println("Neteisingas Email");
        }while(true);

        double balance;
        do {
            System.out.println("Iveskite balansa");
            String input = scn.next();
            try {
                balance = Double.parseDouble(input);
                if (balance>=0) break;
                // number is good.

            } catch (NumberFormatException e) {
                System.out.println("Neteisingas balansas");
            }
        }while (true);

        int creditLimit;
        do {
            System.out.println("Iveskite kredito limita");
            String input = scn.next();
            try {
                creditLimit = Integer.parseInt(input);
                if (creditLimit>=0) break;
                //number is good.

            } catch (NumberFormatException e) {
                System.out.println("Neteisingas kredito limitas");
            }
        }while (true);



        if(creditLimit > 0) {
            Account user1 = new Account(name,email,balance, creditLimit);
            System.out.println(user1.toString());
        }
        if(balance > 0 && creditLimit <= 0) {
            Account user1 = new Account(name,email,balance);
            System.out.println(user1.toString());
        }
        if(creditLimit <= 0 && balance <=0) {
            Account user1 = new Account(name, email);
            System.out.println(user1.toString());
        }
    }
}
