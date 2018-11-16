package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public void add(Card korta) {
        this.cards.add(korta);
    }

    public void createDeck(){
        cards.clear();
        for(int i = 1; i < 5; i++){
            for(int j = 2; j < 15; j++){
                cards.add(new Card(j,i));
            }
        }
    }

    public Card dealCard(){
        Card c=cards.get(0);
        cards.remove(0);
        return c;
    }

    public void generateDeck(){

        createDeck();
        Collections.shuffle(cards);
    }

    public void printDeck(){

//        for(int i = 0; i < cards.size(); i++){
//            System.out.println(cards.get(i).toString());
//        }

        for(Card c: cards){
            System.out.println("Korta: "+c.toString());
        }

    }
}



