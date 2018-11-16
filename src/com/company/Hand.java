package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private boolean hasLost=false;
    List<Card> cards = new ArrayList<>();
    private int valueSum = 0;

    public boolean getHasLost(){
        return hasLost;
    }

    public int getValueSum() {
        return valueSum;
    }

    public void addCard(Card c){
       this.cards.add(c);
       //TODO: ace value change if busted
       if (c.getStrenght()==1) {
           if (this.valueSum <= 10) {
               this.valueSum += 11;
           } else {
               this.valueSum += 1;
           }
       }else{
           this.valueSum +=c.getStrenght();
       }
       if (this.valueSum>21) hasLost=true;
    }

    public void printHand(){
        System.out.println("Your hand:");
        for (Card c: cards){

            System.out.println(c.getValueSymbol(c.getValue())+ " of " + c.getRank());
        }
        System.out.println("Score: "+ this.getValueSum());
    }

    public void setValueSum(int val){
        this.valueSum += val;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", valueSum=" + valueSum +
                '}';
    }
}
