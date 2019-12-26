package com.example.myenglishapp.tabGame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myenglishapp.R;

import java.util.List;

public class AdapterGame extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TabGameItem> listItem;

    public AdapterGame(Context context, int layout, List<TabGameItem> listItem) {
        this.context = context;
        this.layout = layout;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        ImageView imgGame = (ImageView) convertView.findViewById(R.id.tab_game_item_image);
        TextView tvName = (TextView) convertView.findViewById(R.id.tab_game_item_name);

        TabGameItem gameItem = listItem.get(position);

        imgGame.setImageResource(gameItem.getImage());
        tvName.setText(gameItem.getName());

        return convertView;
    }
}
