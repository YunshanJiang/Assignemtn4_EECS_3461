package com.example.a4chatapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4chatapp.FriendListItem;
import com.example.a4chatapp.MessageListAdapter;
import com.example.a4chatapp.R;
import com.example.a4chatapp.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class pageFragment1 extends Fragment {
    private ImageButton addMessagebutton;
    private RecyclerView recyclerView;
    private MessageListAdapter messageListAdapter;
    private List<FriendListItem> mMessage;

    private  List<String> usersList;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addMessagebutton = (ImageButton)getView().findViewById(R.id.imageButton5);
        addMessagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.messagepage, container, false);

        recyclerView =rootView.findViewById(R.id.message_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        messageListAdapter = new MessageListAdapter(getContext(), mMessage);
        recyclerView.setAdapter(messageListAdapter);
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMessage = new ArrayList<>();
        mMessage.add(new FriendListItem("York Fam", R.drawable.pp1,1,1));
        mMessage.add(new FriendListItem("ck", R.drawable.pp3,2,1));
        mMessage.add(new FriendListItem("jellymaca", R.drawable.pp2,3,2));
        mMessage.add(new FriendListItem("Yunshan.J", R.drawable.pp4,4,0));
    }
}
