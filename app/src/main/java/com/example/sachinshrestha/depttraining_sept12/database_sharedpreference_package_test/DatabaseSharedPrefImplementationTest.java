package com.example.sachinshrestha.depttraining_sept12.database_sharedpreference_package_test;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class DatabaseSharedPrefImplementationTest extends AppCompatActivity {

    DatabaseTestSQLite myDBHelper;
    SQLiteDatabase db;
    static final String SHAREDPREF_TITLE = "MYUNIQUETITLE";

    Button btnInsert,btnRead,btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_implementation_test);

        myDBHelper = new DatabaseTestSQLite(this);
        db = myDBHelper.getWritableDatabase();

        btnInsert = findViewById(R.id.btnDBInsert);
        btnRead = findViewById(R.id.btnDBRead);
        btnUpdate = findViewById(R.id.btnDBUpdate);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ret = myDBHelper.InsertData(db,"sachinss",84,"elx");
                Toast.makeText(DatabaseSharedPrefImplementationTest.this, "" + ret, Toast.LENGTH_SHORT).show();
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] val = {"sachin"};
//                Cursor cursor = myDBHelper.GetData(db,"name",val);
                Cursor cursor = myDBHelper.GetAllData(db);
                StringBuffer buffer = new StringBuffer();

                while(cursor.moveToNext()){
                    String name = cursor.getString(cursor.getColumnIndex("name"));
                    int crn = cursor.getInt(1);
                    String fac = cursor.getString(2);

                    buffer.append(name + " " + fac + " " + crn + " \n");
                }
                Toast.makeText(DatabaseSharedPrefImplementationTest.this, buffer.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] val = {"sachin"};
                int ret = myDBHelper.updateData(db,"name",val);

                Toast.makeText(DatabaseSharedPrefImplementationTest.this, ""+ret, Toast.LENGTH_SHORT).show();
            }
        });

    }

    void SaveValueSharedPref(){
        SharedPreferences sharedPreferences =
                this.getSharedPreferences(SHAREDPREF_TITLE,this.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key1","val1");
        editor.apply();
        Toast.makeText(this, "value saved", Toast.LENGTH_SHORT).show();
    }

    void GetSharedPrefValue(){
        SharedPreferences sharedPreferences =
                this.getSharedPreferences(SHAREDPREF_TITLE,this.MODE_PRIVATE);

        String val = sharedPreferences.getString(SHAREDPREF_TITLE,"");

        Toast.makeText(this, val, Toast.LENGTH_SHORT).show();
    }
}
