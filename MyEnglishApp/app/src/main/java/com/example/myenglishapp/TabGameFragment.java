package com.example.myenglishapp;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabGameFragment extends Fragment {

    ListView listGame;
    ArrayList<TabGameItem> listGameItem;
    AdapterGame adapter;

    public TabGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_game, container, false);
        listGame = (ListView) view.findViewById(R.id.list_game);

        anhXa();
        setOnClick();

        return view;
    }

    private void anhXa()
    {

        listGameItem = new ArrayList<>();
        listGameItem.add(new TabGameItem("Game kuku kube", R.drawable.ic_game_kukubi_logo));

        adapter = new AdapterGame(getActivity(), R.layout.tab_game_item, listGameItem);
        listGame.setAdapter(adapter);
    }

    private void setOnClick()
    {
        listGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent intent = new Intent(getActivity(), GameKukubiMenu.class);
                    startActivity(intent);
                }
            }
        });
    }
}
