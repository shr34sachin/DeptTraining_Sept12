package com.example.sachinshrestha.depttraining_sept12.interest_calculator_package;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class InterestCalculator extends AppCompatActivity {

    Button btnInterestCalc;
    EditText etPrincipal, etRate, etTime;
    TextView tvResult;
    final static String TAG = "TAG_INTEREST_CALC";
    String xx;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_calculator);

        Intent i = getIntent();
        int val = i.getIntExtra("key1",0);
        Toast.makeText(this, "" + val + " " + i.getStringExtra("key2"), Toast.LENGTH_SHORT).show();

        btnInterestCalc = findViewById(R.id.btnCalc);
        etPrincipal = findViewById(R.id.etPrincipal);
        etTime = findViewById(R.id.etTime);
        etRate = findViewById(R.id.etRate);
        tvResult = findViewById(R.id.tvCalc);
        tvResult.setText("The interest is 0 - have patience");

        String Principal1 = etPrincipal.getText().toString();

        btnInterestCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Principal = etPrincipal.getText().toString();
                String Rate = etRate.getText().toString();
                String Time = etTime.getText().toString();

                xx= "ff";
                x = 34;

                if (Principal.isEmpty()){
                    etPrincipal.setError("khai ta principal value");
                    etPrincipal.requestFocus();
                } else if (Time.isEmpty()){
                    etTime.setError("khai ta time value");
                    etTime.requestFocus();
                } else if (Rate.isEmpty()){
                    etRate.setError("khai ta rate value");
                    etRate.requestFocus();
                } else {
                    Float principal = Float.parseFloat(etPrincipal.getText().toString());
                    Float time = Float.parseFloat(etTime.getText().toString());
                    Float rate = Float.parseFloat(etRate.getText().toString());

                    Float answer = principal * time * rate / 100;
                    tvResult.setText("The interest is " + answer.toString());
                }
            }
        });
    }

//    String calc(){
//        return Principal1;
//    }
}
