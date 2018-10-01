package com.example.sachinshrestha.depttraining_sept12.mero_listviewadapter_dialogbox_backpress_recyclerview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroDialogBox {

    private Context context;
    MeroDialogBox(Context context){
        this.context = context;
    }

    void MeroExitDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("EXIT")
                .setMessage("Do you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setCancelable(false)
                .show();
    }

    void MeroMessageBox(String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Message")
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setCancelable(false)
                .setMessage(msg)
                .show();
    }

    void MeroLoginDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("LOGIN");

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.mero_login_layout,null);
        final EditText user, pass;
        Button btnLogin, btncancel;

        user = view.findViewById(R.id.etMeroLoginLayoutUsername);
        pass = view.findViewById(R.id.etMeroLoginLayoutPassword);
        btnLogin = view.findViewById(R.id.btnMeroLoginLayoutLogin);
        btncancel = view.findViewById(R.id.btnMeroLoginLayoutCancel);

        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username, password;
                username = user.getText().toString();
                password = pass.getText().toString();

                if(username.equals("s") && password.equals("s")){
                    dialog.cancel();
                } else {
                    Toast.makeText(context, "invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }

}
