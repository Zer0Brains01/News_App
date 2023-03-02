package com.example.newslaytical;
import com.bumptech.glide.Glide;
import com.example.newslaytical.Models.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder> {
private Context context;
private ArrayList<newsHeadlines> m;


    CustomAdapter(Context context, ArrayList<newsHeadlines> m){
        this.context=context;
        this.m=m;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.componentdesigen,parent,false);
        viewHolder viewHolder=new viewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
holder.t1.setText(m.get(position).getTitle());
holder.t2.setText(m.get(position).getDescription());
 holder.t3.setText("PublishedAt: "+m.get(position).getPublishedAt());
        Glide.with(context).load(m.get(position).getUrlToImage()).centerCrop().into(holder.imageView);
        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(context,MainActivity2.class);
                i1.putExtra("URL",m.get(position).getUrl());
                context.startActivity(i1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return m.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3;
        ImageView imageView;
        LinearLayout ll;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        t1=itemView.findViewById(R.id.tit);
        t2=itemView.findViewById(R.id.source);
        t3=itemView.findViewById(R.id.published);
        imageView=itemView.findViewById(R.id.ima);
        ll=itemView.findViewById(R.id .linok);

        }
    }
}
