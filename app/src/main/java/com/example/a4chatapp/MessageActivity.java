package com.example.a4chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.a4chatapp.fragments.pageFragment1;
import com.example.a4chatapp.fragments.pageFragment2;
import com.example.a4chatapp.fragments.pageFragment3;
import com.example.a4chatapp.fragments.pageFragment4;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends AppCompatActivity {
private ViewPager pager;
private PagerAdapter pagerAdapter;
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
    }
}
