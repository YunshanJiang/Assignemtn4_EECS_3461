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
        discoveryList.add(new Discovery("Look at these cows wearing VR headsets",
                "Russian farmers are allegedly experimenting with virtual reality for cows in order to improve milk production. ", R.drawable.milkcow,"https://www.pcgamer.com/look-at-these-cows-wearing-vr-headsets/" ));
        discoveryList.add(new Discovery("No Man's Sky update will let players increase ship inventory and permanently edit terrain","The Synthesis Update arrives this week with hundreds of changes for No Man's Sky.", R.drawable.nomanssky, " https://www.pcgamer.com/no-mans-sky-synthesis-update"));
        discoveryList.add(new Discovery("Hearthsone","check the new release of hearhstone!", R.drawable.hearthstone, "https://playhearthstone.com"));


    }
}
