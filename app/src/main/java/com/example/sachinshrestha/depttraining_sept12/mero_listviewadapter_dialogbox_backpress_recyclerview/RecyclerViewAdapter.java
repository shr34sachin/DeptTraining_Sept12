package com.example.sachinshrestha.depttraining_sept12.mero_listviewadapter_dialogbox_backpress_recyclerview;

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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MeroViewHolder> {

    private Context context;
    private String[] title;
    private String[] subtitle;
    private int[] imgIDs;

    RecyclerViewAdapter(Context context, String[] title, String[] subtitle, int[] imgIDs){
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.imgIDs = imgIDs;
    }

    @NonNull
    @Override
    public MeroViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.mero_custom_listview_layout,viewGroup,false);

        return (new MeroViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MeroViewHolder viewHolder, int i) {
        viewHolder.iv.setImageResource(imgIDs[i]);
        viewHolder.tvTitle.setText(title[i]);
        viewHolder.tvSubtitle.setText(subtitle[i]);

        viewHolder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "image is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MeroViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tvTitle, tvSubtitle;

        public MeroViewHolder(@NonNull View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.ivMeroCustomAdapter);
            tvTitle = itemView.findViewById(R.id.meroTitleCustom);
            tvSubtitle = itemView.findViewById(R.id.meroSubTitleCustom);
        }
    }
}
