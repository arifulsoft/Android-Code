package com.example.images1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.lang.reflect.Constructor;

public class CustomAdaper extends BaseAdapter {
    Context context;
    int[] logo;
    LayoutInflater inflater;

    public CustomAdaper(Context context, int[] logo) {
        this.context = context;
        this.logo = logo;
        this.inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View V=convertView;
        V=inflater.inflate(R.layout.item_view,null);
        ImageView ing=V.findViewById(R.id.imageView);
        ing.setImageResource(logo[position]);
        return V;
    }
}
