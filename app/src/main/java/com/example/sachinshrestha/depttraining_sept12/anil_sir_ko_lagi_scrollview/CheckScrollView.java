package com.example.sachinshrestha.depttraining_sept12.anil_sir_ko_lagi_scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sachinshrestha.depttraining_sept12.R;

public class CheckScrollView extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_scroll_view);

        tvWelcome = findViewById(R.id.tvDataEntryForm);

        Intent i = getIntent();
        String utaBataAAKOString = i.getStringExtra("key1");

        tvWelcome.setText("Welcome " + utaBataAAKOString);
    }
}
