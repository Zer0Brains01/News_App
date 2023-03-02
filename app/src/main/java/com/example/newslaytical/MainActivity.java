package com.example.newslaytical;
import com.example.newslaytical.Models.*;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {
TabLayout t1;
ViewPager p1;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
t1=findViewById(R.id.tabb);
p1=findViewById(R.id.page);
TabAdapter tb=new TabAdapter(getSupportFragmentManager());
p1.setAdapter(tb);
t1.setupWithViewPager(p1);
    }


}