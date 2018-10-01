package com.example.sachinshrestha.depttraining_sept12.recyclerview_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sachinshrestha.depttraining_sept12.R;

public class RecyclerViewImplementationTest extends AppCompatActivity {

    String[] title = {"Kathmandu1", "Bhaktapur1","Lalitpur1",
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

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_implementation_test);

        recyclerView = findViewById(R.id.rvRecyclerView);
        RecyclerViewAdapterTest recyclerViewAdapterTest = new
                RecyclerViewAdapterTest(this,title,subtitle,imgIDs);
        recyclerView.setAdapter(recyclerViewAdapterTest);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
