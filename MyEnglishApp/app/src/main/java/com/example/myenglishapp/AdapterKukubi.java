package com.example.myenglishapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterKukubi extends ArrayAdapter<String> {

    Context ct;
    ArrayList<String> data;

    public AdapterKukubi(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        this.ct = context;
        this.data = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        LayoutInflater inflater = (LayoutInflater)ct.getSystemService(ct.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.kukubi_box, null);

        if (data != null && data.size() > 0)
        {
            com.example.myenglishapp.GameKukubiColorBox item = (com.example.myenglishapp.GameKukubiColorBox)row.findViewById(R.id.box_kukubi);
            item.setBackgroundColor(Color.parseColor(data.get(position)));
        }

        return row;
    }
}
