package com.example.sachinshrestha.depttraining_sept12.menu_listview_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

import java.util.List;

public class MenuNListView extends AppCompatActivity {

    String[] citiesArray = {"Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan",
            "Kathmandu", "Bhaktapur", "Patan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_nlist_view);

        ListView listView = findViewById(R.id.lvListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,citiesArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MenuNListView.this, citiesArray[position], Toast.LENGTH_SHORT).show();
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
        if (item.getItemId() == R.id.item_setting){
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item_exit){
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
