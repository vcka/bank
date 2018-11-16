package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card korta = new Card(1,2);

        Deck deck = new Deck();

        deck.generateDeck();
        //deck.printDeck();

        Hand player = new Hand();

        Scanner scn = new Scanner(System.in);

        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        System.out.println("♡♢♤♧");
        player.printHand();

        int choise;

        while (!player.getHasLost()){
            System.out.println("Hit [1] or Stand [2]");
            choise = scn.nextInt();
            if (choise==1){
                player.addCard(deck.dealCard());
                if (player.getValueSum()==21){
                    player.printHand();
                    System.out.println("YOU WON!!!");
                    break;
                }
            }else{
                //TODO: dealer card
            }
            player.printHand();
        }
        if (player.getHasLost()) System.out.println("YOU LOST!!!");
        }
}
