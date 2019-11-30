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

import com.example.a4chatapp.Discovery;
import com.example.a4chatapp.DiscoveryViewAdapter;
import com.example.a4chatapp.FriendListItem;
import com.example.a4chatapp.R;
import com.example.a4chatapp.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class pageFragment3 extends Fragment {


    private RecyclerView myrecyclerview;
    private List<Discovery> discoveryList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activitypage, container, false);
        myrecyclerview = (RecyclerView) rootView.findViewById(R.id.discovery_recyclerview);
        DiscoveryViewAdapter discoveryViewAdapter = new DiscoveryViewAdapter(getContext(), discoveryList);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(discoveryViewAdapter);
        return rootView;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        discoveryList = new ArrayList<>();
        discoveryList.add(new Discovery("isabelle", R.drawable.hearthstone,"https://playhearthstone.com" ));
        discoveryList.add(new Discovery("isabelle", R.drawable.hearthstone, "https://playhearthstone.com"));
        discoveryList.add(new Discovery("isabelle", R.drawable.hearthstone, "https://playhearthstone.com"));


    }
}
