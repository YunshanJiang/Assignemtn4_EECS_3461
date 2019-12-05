package com.example.a4chatapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DiscoveryViewAdapter extends RecyclerView.Adapter<DiscoveryViewAdapter.MyViewHolder> {

    Context mCotext;
    List<Discovery> mNews;


    public  DiscoveryViewAdapter(Context mContext, List<Discovery> mNews){
        this.mCotext = mContext;
        this.mNews = mNews;
    }

    @NonNull
    @Override
    public DiscoveryViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mCotext).inflate(R.layout.discoveryitem, parent,false);
        final DiscoveryViewAdapter.MyViewHolder viewHolder = new DiscoveryViewAdapter.MyViewHolder(v);
        viewHolder.discovery_block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoveryViewAdapter.MyViewHolder holder, int position) {
        final Discovery discovery = mNews.get(position);
        holder.discovery_text_title.setText(mNews.get(position).getDestitle());
        holder.discovery_text.setText(mNews.get(position).getDescription());
        holder.discovery_image.setImageResource(mNews.get(position).getPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(discovery.getUrl()));
                mCotext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNews.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout discovery_block;
        public TextView discovery_text;
        public ImageView discovery_image;
        public TextView discovery_text_title;
        public  MyViewHolder(View itemView){
            super(itemView);
            discovery_text_title = (TextView) itemView.findViewById(R.id.discovery_text_title);
            discovery_block = (LinearLayout) itemView.findViewById(R.id.discovery_block);
            discovery_text = (TextView) itemView.findViewById(R.id.discovery_text);
            discovery_image = (ImageView) itemView.findViewById(R.id.discovery_image);
        }
    }
}
