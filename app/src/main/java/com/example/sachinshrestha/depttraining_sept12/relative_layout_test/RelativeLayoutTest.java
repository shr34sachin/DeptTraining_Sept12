package com.example.sachinshrestha.depttraining_sept12.relative_layout_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.sachinshrestha.depttraining_sept12.R;
import com.example.sachinshrestha.depttraining_sept12.interest_calculator_package.InterestCalculator;

public class RelativeLayoutTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_test);

        Button btnTouch = findViewById(R.id.btnTouchMe);
        final EditText etInput = findViewById(R.id.etInputText);

        btnTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RelativeLayoutTest.this,InterestCalculator.class);
                i.putExtra("key1",45);
                i.putExtra("key2",etInput.getText().toString());
                startActivity(i);
            }
        });

    }
}
