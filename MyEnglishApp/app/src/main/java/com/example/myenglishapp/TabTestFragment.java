package com.example.myenglishapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabTestFragment extends Fragment {

    Button btnStart;
    public TabTestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_test, container, false);
    }

   // public void sendMessage(View v)
   // {
       // Intent intent = new Intent(getActivity(), test.class);
        //startActivity(intent);
   // }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnStart = (Button) getActivity().findViewById((R.id.button_start));
        btnStart.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(getActivity(), StartingScreenActivity.class);
                                            startActivity(intent);
                                        }
                                    });
    }
}
