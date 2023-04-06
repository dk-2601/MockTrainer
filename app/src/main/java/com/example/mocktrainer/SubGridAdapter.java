package com.example.mocktrainer;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class SubGridAdapter extends BaseAdapter {

    private List<String> subList;

    @Override
    public int getCount() {
        return subList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public SubGridAdapter(List<String> subList) {
        this.subList = subList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_item_layout,parent,false);
        }
        else {
            view = convertView;
        }
        view.setOnClickListener(v -> {
            Intent intent = new Intent(parent.getContext(), SetsActivity.class);
            intent.putExtra("SUBJECT", subList.get(position));
            intent.putExtra("SUBJECT_ID",position +1);
            parent.getContext().startActivity(intent);
        });

        ((TextView) view.findViewById(R.id.subName)).setText(subList.get(position));

        Random rnd = new Random();
        int color = Color.argb(255,rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255));
        view.setBackgroundColor(color);
        return view;
    }
}
