package com.tecknologiks.fibonaccicard.objectClass;

/**
 * Created by robinpauquet on 14/03/2018.
 */

public class Card {
    private int number;
    private String title;

    public Card(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
}
