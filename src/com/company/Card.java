package com.company;

public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank(){
        return rank;
    }

    public String suit(){
        return suit;
    }

    public int pointValue(){
        return pointValue;
    }

    public boolean cardCheck(Card card2){
        if (pointValue == card2.pointValue){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String temp = (rank + "" + suit + "" + Integer.toString(pointValue));
        return temp;
    }
}
