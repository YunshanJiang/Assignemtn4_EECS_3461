package com.example.a4chatapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4chatapp.FriendListItem;
import com.example.a4chatapp.R;
import com.example.a4chatapp.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class pageFragment2 extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<FriendListItem> friendListItems;


    public pageFragment2(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.friendlistpage, container, false);
        myrecyclerview = (RecyclerView) rootView.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), friendListItems);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        friendListItems = new ArrayList<>();
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));
        friendListItems.add(new FriendListItem("Isabelle", R.drawable.esabelle));

    }
}
