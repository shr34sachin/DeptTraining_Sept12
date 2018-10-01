package com.example.sachinshrestha.depttraining_sept12.mero_database_sharedpref_package;

import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroSharedPreferacneImplementation extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnLogin, btnCancel;

    static final String sharedPreferenceTitle = "MEROUNIQUETITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mero_database_implementation);
        LoginDialog();

    }

    void LoginDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.mero_login_layout,null);
        builder.setView(view);
        builder.setCancelable(false);

        etUser = view.findViewById(R.id.etMeroLoginLayoutUsername);
        etPass = view.findViewById(R.id.etMeroLoginLayoutPassword);
        btnLogin = view.findViewById(R.id.btnMeroLoginLayoutLogin);
        btnCancel = view.findViewById(R.id.btnMeroLoginLayoutCancel);

        final AlertDialog dialog = builder.create();
        dialog.show();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = GetUserName();
                String pass = GetPassword();

                if(username.equals(etUser.getText().toString()) && pass.equals(etPass.getText().toString())){
                    dialog.cancel();
                } else {
                    Toast.makeText(MeroSharedPreferacneImplementation.this, "login id milena", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertInSharedPreference();
            }
        });
    }

    void InsertInSharedPreference(){
        SharedPreferences spf1 = this.getSharedPreferences(sharedPreferenceTitle,this.MODE_PRIVATE);
        SharedPreferences.Editor editor = spf1.edit();
        editor.putString("username",etUser.getText().toString());
        editor.putString("password",etPass.getText().toString());
        editor.apply();
        Toast.makeText(this, "data saved in sharedpref", Toast.LENGTH_SHORT).show();
    }

    String GetUserName(){
        SharedPreferences spf1 = this.getSharedPreferences(sharedPreferenceTitle,this.MODE_PRIVATE);
        String username = spf1.getString("username","masubhat khane");
        return username;
    }

    String GetPassword(){
        SharedPreferences spf1 = this.getSharedPreferences(sharedPreferenceTitle,this.MODE_PRIVATE);
        String username = spf1.getString("password","masubhat khane");
        return username;
    }
}
