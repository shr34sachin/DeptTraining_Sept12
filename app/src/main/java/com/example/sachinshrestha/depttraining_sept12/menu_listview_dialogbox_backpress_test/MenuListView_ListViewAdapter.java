package com.example.sachinshrestha.depttraining_sept12.menu_listview_dialogbox_backpress_test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sachinshrestha.depttraining_sept12.R;

public class MenuListView_ListViewAdapter extends ArrayAdapter<String>{

    private Context context;
    private String[] title;
    private String[] subtitle;
    private int[] imgIDs;

    public MenuListView_ListViewAdapter(@NonNull Context context,String[] titleArray,String[] subtitle, int[] imgIDs) {
        super(context,R.layout.test_layout_listview,titleArray);

        this.context = context;
        this.title = titleArray;
        this.subtitle = subtitle;
        this.imgIDs = imgIDs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowListView = inflater.inflate(R.layout.test_layout_listview,parent,false);

        ImageView iv;
        TextView tvTitle, tvSubtitle;

        iv = rowListView.findViewById(R.id.ivListViewLayout);
        tvTitle = rowListView.findViewById(R.id.tvTitleListViewLayout);
        tvSubtitle = rowListView.findViewById(R.id.tvSubtitleListViewLayout);

        iv.setImageResource(imgIDs[position]);
        tvTitle.setText(title[position]);
        tvSubtitle.setText(subtitle[position]);

        return rowListView;
    }
}
