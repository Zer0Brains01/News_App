package com.example.newslaytical;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.newslaytical.Models.API;
import com.example.newslaytical.Models.NewsApi;
import com.example.newslaytical.Models.newsHeadlines;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class frag1 extends Fragment {

    public frag1() {
        // Required empty public constructor
    }
    RecyclerView r1;
    ArrayList<newsHeadlines> m;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View v=inflater.inflate(R.layout.fragment_frag1, container, false);
    r1=v.findViewById(R.id.ress);
        API api=new Retrofit_instance().getRetrofit().create(API.class);
        api.getApi("in",100,"58a66555bbea4629a6f45433d5f29941","general").enqueue(new Callback<NewsApi>() {
            @Override
            public void onResponse(Call<NewsApi> call, Response<NewsApi> response) {
                m= (ArrayList<newsHeadlines>) response.body().getArticles();
                CustomAdapter customAdapter=new CustomAdapter(getContext(),m);
                r1.setLayoutManager(new LinearLayoutManager(getContext()));
                r1.setAdapter(customAdapter);
            }
            @Override
            public void onFailure(Call<NewsApi> call, Throwable t) {
                Toast.makeText(getContext(),"Please Cheak Your Internet Connection",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}