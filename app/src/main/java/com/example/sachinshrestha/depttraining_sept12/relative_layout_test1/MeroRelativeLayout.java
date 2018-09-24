package com.example.sachinshrestha.depttraining_sept12.relative_layout_test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroRelativeLayout extends AppCompatActivity {

    EditText etName, etAddress, etGender, etAge;
    final static String TAG = "TAG_MERORELATIVELAYOUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mero_relative_layout);

        etName = findViewById(R.id.etNameEntry);
        etAddress = findViewById(R.id.etAddressEntry);
        etGender = findViewById(R.id.etGenderEntry);
        etAge = findViewById(R.id.etAgeEntry);

//        Button btnSubmit = findViewById(R.id.btnSubmit);

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DisplayData();
//            }
//        });
    }

    void DataDisplayGarr(View v){

        String meroMessage = "Name: " + etName.getText().toString() +
                "\n Address: " + etAddress.getText().toString() +
                "\n Gender: " + etGender.getText().toString() +
                "\n Age: " + etAge.getText().toString();

        Toast.makeText(this, meroMessage, Toast.LENGTH_SHORT).show();

        Log.d(TAG, "Name: " + etName.getText().toString() +
                "\n Address: " + etAddress.getText().toString() +
                "\n Gender: " + etGender.getText().toString() +
                "\n Age: " + etAge.getText().toString());
    }
}
