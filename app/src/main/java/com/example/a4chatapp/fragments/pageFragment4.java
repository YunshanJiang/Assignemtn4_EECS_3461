package com.example.a4chatapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a4chatapp.R;

import Persistent.UserAccountModel;
import Service.UserAccountServiceImpl;

public class pageFragment4 extends Fragment {
    private UserAccountServiceImpl uas = new UserAccountServiceImpl();
    private UserAccountModel.UserAccount userAccount;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.profilepage, container, false);
        setUserInfo(rootView);
        return rootView;
    }

    private void setUserInfo(ViewGroup root){
        loadUserResultById("isabelle");
        TextView userName =  root.findViewById(R.id.userName);
        TextView userId = root.findViewById(R.id.userId);
        TextView email = root.findViewById(R.id.email);
        TextView address = root.findViewById(R.id.address);
        TextView status = root.findViewById(R.id.status);

        userName.setText(userAccount.getUserName());
        userId.setText(userAccount.getUserId());
        email.setText(userAccount.getEmail());
        address.setText(userAccount.getAddress());
        status.setText(userAccount.getStatus());

    }

    private void loadUserResultById(String userId){
        userAccount = uas.retrieveUserAccountByUserId(userId);
    }
}
