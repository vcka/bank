package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Card korta = new Card(1,2);

        Deck deck = new Deck();

        deck.generateDeck();
        deck.printDeck();

    }


}
