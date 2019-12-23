package com.example.myenglishapp.tabGrammar;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myenglishapp.R;

import java.util.ArrayList;

public class GrammarAdapter extends ArrayAdapter<Grammar> {
    public GrammarAdapter(@NonNull Context context, ArrayList<Grammar> grammars) {
        super(context,0,grammars);
    }

    private class ViewHolder{
        TextView tvNameGrammar;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        ViewHolder holder;

        if(convertView==null)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.item_grammar,parent,false);

            holder = new ViewHolder();
            holder.tvNameGrammar = (TextView)convertView.findViewById(R.id.textViewNameGrammar);
            convertView.setTag(holder);
        }
        else
        {
            holder= (ViewHolder) convertView.getTag();
        }

        Grammar g = getItem(position);
        if(g!=null)
        {
            holder.tvNameGrammar.setText(g.getId()+"."+g.getTen());
        }


        return convertView;
    }
}
