package com.example.sachinshrestha.depttraining_sept12.mero_listviewadapter_dialogbox_backpress_recyclerview;

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

public class MeroCustomAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] title;
    private String[] subtitle;
    private int[] img;

    public MeroCustomAdapter(@NonNull Context context,
                             String[] titleArray,String[] subtitleArray,
                             int[] imgIDs) {
        super(context, R.layout.mero_custom_listview_layout,titleArray);

        this.context = context;
        this.img = imgIDs;
        this.title = titleArray;
        this.subtitle = subtitleArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View meroView = inflater.inflate(R.layout.mero_custom_listview_layout,parent,false);

        ImageView iv;
        TextView tvTitle, tvSubtitle;

        iv = meroView.findViewById(R.id.ivMeroCustomAdapter);
        tvTitle = meroView.findViewById(R.id.meroTitleCustom);
        tvSubtitle = meroView.findViewById(R.id.meroSubTitleCustom);

        tvTitle.setText(title[position]);
        tvSubtitle.setText(subtitle[position]);
        iv.setImageResource(img[position]);

        return meroView;
    }
}
