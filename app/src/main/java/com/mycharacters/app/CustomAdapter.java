package com.mycharacters.app;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String characterList[];
    int icons[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] characterList, int[] icons) {
        this.context = applicationContext;
        this.characterList = characterList;
        this.icons = icons;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return characterList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.customlist, null);
        TextView name = (TextView)  view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        name.setText(characterList[i]);
        icon.setImageResource(icons[i]);
        return view;
    }}
