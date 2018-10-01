package com.example.sachinshrestha.depttraining_sept12.menu_listview_dialogbox_backpress_test;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MenuNListViewTest extends AppCompatActivity {

    String[] citiesArray = {"Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan"};

    String[] citiesSubtitleArray = {"Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan"};

    int[] imgArray = {android.R.drawable.btn_default, android.R.drawable.btn_plus, android.R.drawable.bottom_bar,
            android.R.drawable.btn_default, android.R.drawable.btn_plus, android.R.drawable.bottom_bar,
            android.R.drawable.btn_default, android.R.drawable.btn_plus, android.R.drawable.bottom_bar,
            android.R.drawable.btn_default, android.R.drawable.btn_plus, android.R.drawable.bottom_bar,
            android.R.drawable.btn_default, android.R.drawable.btn_plus, android.R.drawable.bottom_bar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_nlist_view);

        ListView listView = findViewById(R.id.lvListView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1,citiesArray);
//        listView.setAdapter(arrayAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MenuNListViewTest.this, citiesArray[position], Toast.LENGTH_SHORT).show();
//            }
//        });

        MenuListView_ListViewAdapter adapter = new MenuListView_ListViewAdapter(this,
                citiesArray,citiesSubtitleArray,imgArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MenuNListViewTest.this, citiesArray[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.test_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.item_setting:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                View view = getLayoutInflater().inflate(R.layout.layout_custom_dialog_test,null);
                builder.setView(view);

                final EditText etUser, etPassword;
                Button btnEnter;

                etUser = view.findViewById(R.id.etCustomDialogTestUser);
                etPassword = view.findViewById(R.id.etCustomDialogTestPass);
                btnEnter = view.findViewById(R.id.btnEnterCustomDialog);

                builder.setCancelable(true)
                .setTitle("setting")
                .setMessage("this is for login")
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String user, pass;
                        user = etUser.getText().toString();
                        pass = etPassword.getText().toString();

                        if(user.equals("s") && pass.equals("s")){
                            Toast.makeText(MenuNListViewTest.this, "login", Toast.LENGTH_SHORT).show();
                            dialog.cancel();

                        } else
                            Toast.makeText(MenuNListViewTest.this, "Try again", Toast.LENGTH_SHORT).show();
                    }
                });




                final AlertDialog dialog = builder.create();
                dialog.show();

                btnEnter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String user, pass;
                        user = etUser.getText().toString();
                        pass = etPassword.getText().toString();

                        if(user.equals("s") && pass.equals("s")){
                            Toast.makeText(MenuNListViewTest.this, "login", Toast.LENGTH_SHORT).show();
                            dialog.cancel();

                        } else
                            Toast.makeText(MenuNListViewTest.this, "Try again", Toast.LENGTH_SHORT).show();

                    }
                });

                return true;

            case R.id.item_exit:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setTitle("Exit")
                        .setMessage("Are you sure")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                MenuNListViewTest.this.finish();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();
            default:
                return super.onOptionsItemSelected(item);
        }

//        if (item.getItemId() == R.id.item_setting){
//            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
//        }
//        if (item.getItemId() == R.id.item_exit){
//            System.exit(0);
//        }

    }

    private long timePassedInMS;
    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() < (timePassedInMS + 2000) ){
            super.onBackPressed();
        } else {
            Toast.makeText(this, "press again", Toast.LENGTH_SHORT).show();
        }
        timePassedInMS = System.currentTimeMillis();
    }
}
