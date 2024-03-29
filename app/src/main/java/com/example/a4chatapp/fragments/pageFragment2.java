package com.example.a4chatapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4chatapp.AddFriendActivity;
import com.example.a4chatapp.FriendListItem;
import com.example.a4chatapp.R;
import com.example.a4chatapp.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class pageFragment2 extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<FriendListItem> friendListItems;
    private ImageButton addNewFriendButton;

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
        friendListItems.add(new FriendListItem("Jimmyjay", R.drawable.pp1, 1, 1));
        friendListItems.add(new FriendListItem("Franc010", R.drawable.pp6,2,1));
        friendListItems.add(new FriendListItem("jellymaca", R.drawable.pp2,3,2));
        friendListItems.add(new FriendListItem("ck", R.drawable.pp3,4,0));
        friendListItems.add(new FriendListItem("Yunshan.J", R.drawable.pp4,5,0));
        friendListItems.add(new FriendListItem("LemonAid", R.drawable.pp5,6,0));

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        addNewFriendButton = (ImageButton) getView().findViewById(R.id.imageButton_add_new_friend);
        addNewFriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddFriendActivity.class);
                startActivity(intent);
            }
        });
    }
}
