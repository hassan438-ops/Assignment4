package com.example.assign4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;


public class
ChatFragment extends Fragment {
    RecyclerView rv;
    UserAdapter userAdapter;
    List<User> ChatList = new ArrayList<>();


    public ChatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ChatList.add(new User("Ahmed Hassan", "Assalam o Alaikum", R.drawable.image5,"4:00 PM"));
        ChatList.add(new User("Sajawal", "Sir g! thek ha?", R.drawable.image7,"3:55 PM"));
        ChatList.add(new User("Bilal Bhai", "Ground 6bj aayna", R.drawable.image8,"3:45 PM"));
        ChatList.add(new User("Ahsan Ali", "University mein ho", R.drawable.image4,"9:20 AM"));
        ChatList.add(new User("Usman", "Good ", R.drawable.image2,"11:00 PM"));
        ChatList.add(new User("Osama", "khan ho?", R.drawable.image1,"9:45 PM"));
        ChatList.add(new User("Saqib", "Good Work ", R.drawable.image3,"8:00 PM"));
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        rv = view.findViewById(R.id.rv);
        userAdapter = new UserAdapter(ChatList, getContext());
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv.setAdapter(userAdapter);
        return view;
    }
}




