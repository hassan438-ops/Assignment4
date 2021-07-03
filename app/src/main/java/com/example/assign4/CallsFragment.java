package com.example.assign4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {
    RecyclerView rv2;
    CallAdapter CallAdapter;
    List<Caller> CallsList = new ArrayList<Caller>();

    public CallsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        CallsList.add(new Caller("Ahmed Hassan", "Today 4:00 PM", R.drawable.image5, R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Sajawal","Today 3:55 PM", R.drawable.image7,R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Bilal Bhai", "20 June 3:45 PM", R.drawable.image8,R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Ahsan Ali", "11 June 12:00 PM", R.drawable.image4,R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Usman", "9 June 8:00 PM" , R.drawable.image2,R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Osama", "26 May 9:00 PM", R.drawable.image1,R.drawable.ic_baseline_call_24));
        CallsList.add(new Caller("Saqib", "17 March 10:00 PM ", R.drawable.image3,R.drawable.ic_baseline_call_24));
        View view= inflater.inflate(R.layout.fragment_calls, container, false);
        rv2 = view.findViewById(R.id.rv2);
        CallAdapter = new CallAdapter(CallsList, getContext());
        rv2.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv2.setAdapter(CallAdapter);
        return  view;
    }
}