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
        users.add(new Account("vcka", "vcka@ministras.lt", 16001));

        List<Item> itemsMain = new ArrayList<>();
        itemsMain.add(new Item("adb123",39.5, 40, "Marskineliai", "Marskineliai su CodeAcademy logotipu." ));

        users.get(0).addItem(itemsMain.get(0));

        System.out.println(users.get(0).getItems().toString());
        Transaction t = new Transaction(users.get(0), users.get(1),12.0);

        t.makeTransaction();

        System.out.println(users.get(0).toString());

        new Menu();
    }

}
