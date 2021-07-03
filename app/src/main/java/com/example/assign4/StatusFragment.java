package com.example.assign4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class StatusFragment extends Fragment {
    RecyclerView rv1;
    StatusAdapter StatusAdapter;
    List<Stat> StatusList = new ArrayList<>();


    public StatusFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_status, container, false);
        StatusList.add(new Stat("Bilal Bhai", "Today , 9:00 PM",R.drawable.status6));
        StatusList.add(new Stat("Ahsan Ali", "Today , 8:00 PM",R.drawable.status5));
        StatusList.add(new Stat("Sajawal", "Today , 6:00 PM",R.drawable.status3));
        StatusList.add(new Stat("Saqib", "Today , 6:00 PM",R.drawable.status4));
        StatusList.add(new Stat("Usman", "Today , 9:00 AM",R.drawable.status2));
        StatusList.add(new Stat("Osama", "Today , 8:00 AM",R.drawable.status1));
        rv1 = view.findViewById(R.id.rv1);
        StatusAdapter = new StatusAdapter(StatusList, getContext());
        rv1.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv1.setAdapter(StatusAdapter);
        return view;
    }
}