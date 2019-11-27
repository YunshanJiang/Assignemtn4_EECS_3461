package com.example.a4chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

import com.example.a4chatapp.fragments.pageFragment1;
import com.example.a4chatapp.fragments.pageFragment2;
import com.example.a4chatapp.fragments.pageFragment3;
import com.example.a4chatapp.fragments.pageFragment4;

import java.util.ArrayList;
import java.util.List;

import Persistent.UserAccountModel;
import Service.CommunicationServiceImpl;
import Service.UserAccountServiceImpl;

public class MessageActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private ImageButton messageButton;
    private ImageButton friendListButton;
    private ImageButton activityButton;
    private ImageButton profileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        List<Fragment> list = new ArrayList<>();
        list.add(new pageFragment1());
        list.add(new pageFragment2());
        list.add(new pageFragment3());
        list.add(new pageFragment4());
        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
        messageButton = (ImageButton)findViewById(R.id.imageButton);
        friendListButton = (ImageButton)findViewById(R.id.imageButton2);
        activityButton = (ImageButton)findViewById(R.id.imageButton3);
        profileButton = (ImageButton)findViewById(R.id.imageButton4);
        messageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(0, false);
            }
        });

        friendListButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(1, false);
            }
        });
        activityButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(2, false);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(3, false);
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        switch(keyCode)
        {
            case KeyEvent.KEYCODE_BACK:

                moveTaskToBack(true);

                return true;
        }
        return false;
    }

    private CommunicationServiceImpl csi = new CommunicationServiceImpl();
    private UserAccountServiceImpl usi = new UserAccountServiceImpl();
    private String getResposeFromBot(String userMessage){
        return csi.getResponse(userMessage);
    }
    private UserAccountModel.UserAccount getUserInformationById(String userId){
        return usi.retrieveUserAccountByUserId(userId);
    }

}
