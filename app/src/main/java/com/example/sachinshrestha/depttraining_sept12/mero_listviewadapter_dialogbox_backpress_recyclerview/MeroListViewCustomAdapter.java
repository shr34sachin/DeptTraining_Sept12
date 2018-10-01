package com.example.sachinshrestha.depttraining_sept12.mero_listviewadapter_dialogbox_backpress_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MeroListViewCustomAdapter extends AppCompatActivity {

    ListView listView;
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
        setContentView(R.layout.activity_mero_list_view_custom_adapter);

        listView = findViewById(R.id.lvMeroCustomListView);
        MeroCustomAdapter adapter = new MeroCustomAdapter(this,title,subtitle,imgIDs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MeroListViewCustomAdapter.this, subtitle[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    long timePassedInMilliseconds;

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - timePassedInMilliseconds > 2000){
            Toast.makeText(this, "Press back again to exit",
                    Toast.LENGTH_SHORT).show();
        } else {
            super.onBackPressed();
        }
        timePassedInMilliseconds = System.currentTimeMillis();
    }
}
