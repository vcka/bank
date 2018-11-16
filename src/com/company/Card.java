package com.company;

public class Card {

    enum Suit{
        HEARTS(1), CLUBS(2), SPADES(3),DIAMONDS(4);
        private final int suitNum;
        Suit(int suit){
            this.suitNum = suit;
        }
    }

    enum CardValue{
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), KING(13), QUEEN(12), JACK(11), ACE(14);
        private final int symbolValue;

        CardValue(int cv){
         this.symbolValue = cv;
        }

        public int getSymbolValue(){
            return this.getSymbolValue();
        }
    }


    private int value;
    private Suit rank;

    public Suit getRank() {
        return rank;
    }

    public CardValue getValueSymbol(int value){
        switch (value){
            case 2:
                return CardValue.TWO;

            case 3:
                return CardValue.THREE;

            case 4:
                return CardValue.FOUR;

            case 5:
                return CardValue.FIVE;

            case 6:
                return CardValue.SIX;

            case 7:
                return CardValue.SEVEN;

            case 8:
                return CardValue.EIGHT;

            case 9:
                return CardValue.NINE;

            case 10:
                return CardValue.TEN;

            case 11:
                return CardValue.JACK;

            case 12:
                return CardValue.QUEEN;

            case 13:
                return CardValue.KING;
            case 14:
                return CardValue.ACE;
            default:
                return CardValue.TWO;

        }
    }
//    public void setRank(int rank) {
//        if(rank > 0 && rank < 5) this.rank = rank;
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value>1 && value < 14) this.value = value;
    }

    public Card(int value, int rank) {
        this.value = value;
        switch (rank){
            case 1:
                this.rank=Suit.HEARTS;
                break;
            case 2:
                this.rank=Suit.CLUBS;
                break;
            case 3:
                this.rank=Suit.SPADES;
                break;
            case 4:
                this.rank=Suit.DIAMONDS;
                break;
        }
//        this.rank = rank;
    }

    public int getStrenght(){
        if (this.value<10) return value;
        if (this.value>=10 && this.value<14) return 10;
        if (this.value==14) return 1;
        return -1;
    }

    public String toString(){
        return "Value: "+this.value+" Rank: "+this.rank;
    }
}
