package com.example.sachinshrestha.depttraining_sept12.mero_menu_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroMenu extends AppCompatActivity {

    String[] citiesArray = {"Kathmandu","Bhaktapur","Lalitpur","Janakpur",
            "Kathmandu","Bhaktapur","Lalitpur","Janakpur",
            "Kathmandu","Bhaktapur","Lalitpur","Janakpur",
            "Kathmandu","Bhaktapur","Lalitpur","Janakpur"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mero_menu);

        ListView listView = findViewById(R.id.lvMeroListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,citiesArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MeroMenu.this, citiesArray[position], Toast.LENGTH_SHORT).show();
            }
        });

        TextView tvListOfCities = findViewById(R.id.tvListOfCities);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mero_khatra_animation_zoom);
        tvListOfCities.setAnimation(animation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mero_menu_items_yaha_chha,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.mero_item_setting){
            Toast.makeText(this, "setting is clicked", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.mero_item_exit){
            System.exit(0);
        } else if(item.getItemId() == R.id.mero_item_about_us) {
            Intent i = new Intent(this, AboutUs.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
