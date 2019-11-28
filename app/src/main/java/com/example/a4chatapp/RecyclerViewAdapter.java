package com.example.a4chatapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mCotext;
    List<FriendListItem> mData;


    public  RecyclerViewAdapter(Context mContext, List<FriendListItem> mData){
        this.mCotext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mCotext).inflate(R.layout.item_contect, parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(v);
        viewHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mCotext, "test click" + String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.tv_name.setText(mData.get(position).getName());
holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_contact;
        private TextView tv_name;
        private ImageView img;

        public  MyViewHolder(View itemView){
            super(itemView);
            item_contact = (LinearLayout) itemView.findViewById(R.id.friend_contect);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contect);
        }
    }
}