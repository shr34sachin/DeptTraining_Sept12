package com.example.sachinshrestha.depttraining_sept12.recyclerview_test;

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sachinshrestha.depttraining_sept12.R;

public class RecyclerViewAdapterTest extends RecyclerView.Adapter<RecyclerViewAdapterTest.MyRecyclerViewHolder> {
    Context context;
    String[] title;
    String[] subtitle;
    int[] imgIDs;

    RecyclerViewAdapterTest(Context context, String[] title, String[] subtitle, int[] imgIDs){
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.imgIDs = imgIDs;
    }


    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.mero_custom_listview_layout,viewGroup,false);

        return (new MyRecyclerViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder viewHolder, final int i) {
        viewHolder.imageView.setImageResource(imgIDs[i]);
        viewHolder.title.setText(title[i]);
        viewHolder.subtitle.setText(subtitle[i]);

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, title[i] + "is clicked", Toast.LENGTH_SHORT).show();

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("something").
                        setMessage("something").show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyRecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView title, subtitle;
        ImageView imageView;

        public MyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.meroTitleCustom);
            subtitle = itemView.findViewById(R.id.meroSubTitleCustom);
            imageView = itemView.findViewById(R.id.ivMeroCustomAdapter);
        }
    }
}
