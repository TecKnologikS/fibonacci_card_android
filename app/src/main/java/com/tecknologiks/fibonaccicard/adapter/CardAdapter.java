package com.tecknologiks.fibonaccicard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tecknologiks.fibonaccicard.R;
import com.tecknologiks.fibonaccicard.objectClass.Card;

import java.util.ArrayList;

/**
 * Created by robinpauquet on 14/03/2018.
 */

public class CardAdapter extends BaseAdapter {

    private Context c;
    private ArrayList<Card> lstCards;
    private LayoutInflater inflater;

    public CardAdapter(Context c, ArrayList<Card> lstCards) {
        this.c = c;
        this.lstCards = lstCards;
        this.inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return lstCards.size();
    }

    @Override
    public Object getItem(int i) {
        return lstCards.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.item_card, null);
        ((TextView)view.findViewById(R.id.tvCard)).setText(lstCards.get(i).getNumber() + "");
        ((TextView)view.findViewById(R.id.tvTitle)).setText(lstCards.get(i).getTitle() + "");
        return view;
    }
}
