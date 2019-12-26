package com.example.myenglishapp.tabGrammar;


import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myenglishapp.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabGrammarFragment extends Fragment {
    Database database;
    GrammarAdapter grammarAdapter;
    ListView listView;
    ArrayList<Grammar> arr_grammar = new ArrayList<Grammar>();
    private SearchView searchView = null;
    private SearchView.OnQueryTextListener queryTextListener;
    public TabGrammarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        database= new Database(getActivity(),"dulieu.sqlite",null,1);
        DuLieu dl = new DuLieu();
        dl.duLieu(database);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_grammar, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Cursor cursor = database.GetData("SELECT * FROM nguphap");
        listView = (ListView)getActivity().findViewById(R.id.listViewGrammar);
        arr_grammar.clear();
        for(int i=0;i<cursor.getCount();i++)
        {
            cursor.moveToPosition(i);
            arr_grammar.add(new Grammar(cursor.getInt(0),cursor.getString(1)
                    ,cursor.getString(2),cursor.getString(3),cursor.getString(4)
                    ,cursor.getString(5),cursor.getString(6),cursor.getString(7)
                    ,cursor.getString(8),cursor.getString(9),cursor.getString(10)
                    ,cursor.getString(11),cursor.getString(12),cursor.getString(13)));

        }
        grammarAdapter= new GrammarAdapter(getActivity(),arr_grammar);
        listView.setAdapter(grammarAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int id = arr_grammar.get(i).getId();
                String ten=arr_grammar.get(i).getTen();
                Intent intent = new Intent(getActivity(),GrammarActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id",id);
                bundle.putString("ten", ten);
                bundle.putString("title1", arr_grammar.get(i).getTitle1());
                bundle.putString("title2", arr_grammar.get(i).getTitle2());
                bundle.putString("title3", arr_grammar.get(i).getTitle3());
                bundle.putString("title4", arr_grammar.get(i).getTitle4());
                bundle.putString("title5", arr_grammar.get(i).getTitle5());
                bundle.putString("title6", arr_grammar.get(i).getTitle6());
                bundle.putString("noidung1", arr_grammar.get(i).getNoidung1());
                bundle.putString("noidung2", arr_grammar.get(i).getNoidung2());
                bundle.putString("noidung3", arr_grammar.get(i).getNoidung3());
                bundle.putString("noidung4", arr_grammar.get(i).getNoidung4());
                bundle.putString("noidung5", arr_grammar.get(i).getNoidung5());
                bundle.putString("noidung6", arr_grammar.get(i).getNoidung6());
                intent.putExtra("idGrammar", bundle);
                startActivity(intent);
            }
        });
    }

    @SuppressLint("ResourceType")
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.search, menu);
        MenuItem searchItem = menu.findItem(R.id.timkiem);
        {
            SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);

            if (searchItem != null) {
                searchView = (SearchView) searchItem.getActionView();
            }
            if (searchView != null) {
                searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

                queryTextListener = new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextChange(String newText) {
                        Log.i("onQueryTextChange", newText);
                        Cursor cursor = database.GetData("SELECT * FROM nguphap WHERE ten LIKE '%"+newText+"%'");
                        grammarAdapter.clear();
                        if(cursor.moveToFirst()){

                            do{
                                arr_grammar.add(new Grammar(cursor.getInt(0),cursor.getString(1)
                                        ,cursor.getString(2),cursor.getString(3),cursor.getString(4)
                                        ,cursor.getString(5),cursor.getString(6),cursor.getString(7)
                                        ,cursor.getString(8),cursor.getString(9),cursor.getString(10)
                                        ,cursor.getString(11),cursor.getString(12),cursor.getString(13)));
                            }while (cursor.moveToNext());

                        }
                        listView.setAdapter(grammarAdapter);
                        grammarAdapter.notifyDataSetChanged();
                        return true;
                    }
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        Log.i("onQueryTextSubmit", query);

                        return true;
                    }
                };
                searchView.setOnQueryTextListener(queryTextListener);
            }}

    }
}
