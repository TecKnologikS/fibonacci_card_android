package com.tecknologiks.fibonaccicard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by robinpauquet on 14/03/2018.
 */

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Log.e("test", getIntent().getIntExtra("number", 0) + "");
        ((TextView)findViewById(R.id.tvNumber)).setText("" + getIntent().getIntExtra("number", 0));

    }
}