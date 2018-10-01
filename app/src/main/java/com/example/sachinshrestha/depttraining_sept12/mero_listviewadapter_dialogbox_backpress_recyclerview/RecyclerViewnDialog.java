package com.example.sachinshrestha.depttraining_sept12.mero_listviewadapter_dialogbox_backpress_recyclerview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class RecyclerViewnDialog extends AppCompatActivity {

    MeroDialogBox meroDialog;
    String[] title = {"Kathmandu", "Bhaktapur","Lalitpur",
            "Kathmandu", "Bhaktapur","Lalitpur",
            "Kathmandu", "Bhaktapur","Lalitpur",
            "Kathmandu", "Bhaktapur","Lalitpur"};

    String[] subtitle = {"This is Kathmandu", "This is Bhaktapur","This is Lalitpur",
            "This is Kathmandu", "This is Bhaktapur","This is Lalitpur",
            "This is Kathmandu", "This is Bhaktapur","This is Lalitpur",
            "This is Kathmandu", "This is Bhaktapur","This is Lalitpur"};

    int[] imgIDs = {R.mipmap.ic_launcher_round,R.mipmap.mero_icon,R.drawable.image1,
            R.mipmap.ic_launcher_round,R.mipmap.mero_icon,R.drawable.image1,
            R.mipmap.ic_launcher_round,R.mipmap.mero_icon,R.drawable.image1,
            R.mipmap.ic_launcher_round,R.mipmap.mero_icon,R.drawable.image1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_viewn_dialog);

        meroDialog = new MeroDialogBox(this);
//        meroDialog.MeroLoginDialog();

        RecyclerView recyclerView = findViewById(R.id.rvRecyclerviewListofCities);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,title, subtitle,imgIDs);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onBackPressed() {
        meroDialog.MeroExitDialog();
//        super.onBackPressed();
    }
}
