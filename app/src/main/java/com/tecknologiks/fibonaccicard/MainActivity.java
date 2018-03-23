package com.tecknologiks.fibonaccicard;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tecknologiks.fibonaccicard.adapter.CardAdapter;
import com.tecknologiks.fibonaccicard.objectClass.Card;
import com.tecknologiks.fibonaccicard.utils.FibonacciUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvCards;
    CardAdapter adapter;
    ArrayList<Card> lstCards = FibonacciUtils.getListCards(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCards = findViewById(R.id.lvCards);
        adapter = new CardAdapter(this, this.lstCards);
        lvCards.setAdapter(adapter);


        lvCards.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                Log.e("", "" + lstCards.get(i));
                intent.putExtra("number", lstCards.get(i).getNumber());
                startActivity(intent,transition(view));
            }
        });
    }

    public Bundle transition(View v) {
        View statusBar = findViewById(android.R.id.statusBarBackground);
        View navigationBar = findViewById(android.R.id.navigationBarBackground);

        List<Pair<View, String>> pairs = new ArrayList<>();
        if (statusBar != null) {
            pairs.add(Pair.create(statusBar, Window.STATUS_BAR_BACKGROUND_TRANSITION_NAME));
        }
        if (navigationBar != null) {
            pairs.add(Pair.create(navigationBar, Window.NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME));
        }
        pairs.add(Pair.create(v.findViewById(R.id.tvCard), "card"));

        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                pairs.toArray(new Pair[pairs.size()]));
        return options.toBundle();
    }
}
