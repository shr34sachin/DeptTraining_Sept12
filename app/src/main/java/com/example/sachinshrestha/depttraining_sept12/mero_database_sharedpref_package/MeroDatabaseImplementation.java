package com.example.sachinshrestha.depttraining_sept12.mero_database_sharedpref_package;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroDatabaseImplementation extends AppCompatActivity {

    MeroDatabaseHelper helper;
    SQLiteDatabase db;

    EditText etSym, etKitta, etPrice;
    Button btnDisp, btnInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mero_database_implementation2);

        etKitta = findViewById(R.id.etKitta);
        etPrice = findViewById(R.id.etPrice);
        etSym = findViewById(R.id.etSym);
        btnDisp = findViewById(R.id.btnDisp);
        btnInsert = findViewById(R.id.btnInsert);

        helper = new MeroDatabaseHelper(this);
        db = helper.getWritableDatabase();

        btnDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayDataFromDB();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertDataIntoDB();
            }
        });

    }

    void InsertDataIntoDB(){
        helper.InsertDataDatabase(db,etSym.getText().toString(),
                Integer.parseInt(etPrice.getText().toString()),
                Integer.parseInt(etKitta.getText().toString()));
        etSym.setText("");
        etPrice.setText("");
        etKitta.setText("");
        Toast.makeText(this, "Inserted", Toast.LENGTH_SHORT).show();
    }

    void DisplayDataFromDB(){
        Cursor cursor = helper.GetAllData(db);
        StringBuffer buffer = new StringBuffer();
        buffer.append("Symbol");
        buffer.append(";");
        buffer.append("Price");
        buffer.append(";");
        buffer.append("Kitta");
        buffer.append(";");
        buffer.append("Total");
        buffer.append("\n");
        while(cursor.moveToNext()){
            buffer.append(cursor.getString(0));
            buffer.append(";");
            buffer.append(cursor.getInt(1));
            buffer.append(";");
            buffer.append(cursor.getInt(2));
            buffer.append(";");
            buffer.append(cursor.getInt(2) * cursor.getInt(1));
            buffer.append("\n");
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(buffer.toString())
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();

    }

}
