package com.example.sachinshrestha.depttraining_sept12.anil_sir_ko_lagi_scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.sachinshrestha.depttraining_sept12.R;

public class WelcomeScreen extends AppCompatActivity {

    EditText etWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        etWelcome = findViewById(R.id.etWelcome);
    }

    public void YahaThichne(View view) {
        Intent intent = new Intent(WelcomeScreen.this,CheckScrollView.class);
        String initialDIyeraRakhnaMilne = etWelcome.getText().toString();

        intent.putExtra("key1",initialDIyeraRakhnaMilne);

        startActivity(intent);
    }
}
