package com.tecknologiks.fibonaccicard.utils;

import com.tecknologiks.fibonaccicard.objectClass.Card;

import java.util.ArrayList;

/**
 * Created by robinpauquet on 14/03/2018.
 */

public class FibonacciUtils {
    public static ArrayList<Card> getListCards(int nb) {
        ArrayList<Card> lstCards = new ArrayList<>();
        lstCards.add(new Card(1, "Too Easy"));
        lstCards.add(new Card(2, "Easy"));
        lstCards.add(new Card(3, "So Easy"));
        lstCards.add(new Card(5, "Normal"));
        lstCards.add(new Card(8, "Not so easy"));
        lstCards.add(new Card(13, "Difficult"));
        lstCards.add(new Card(21, "Damn"));
        lstCards.add(new Card(34, "No way"));

        return lstCards;
    }
}
