package com.example.a4chatapp;

import android.content.Context;
import android.content.Intent;
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

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final FriendListItem friendListItem = mData.get(position);
     holder.tv_name.setText(mData.get(position).getName());
        switch (mData.get(position).getStatus()){
            case 0:
                holder.status_icon.setBackgroundResource(R.drawable.statusicon);
                holder.status_word.setText("Offline");
                break;
            case 1:
                holder.status_icon.setBackgroundResource(R.drawable.statusicon2);
                holder.status_word.setText("Online");
                break;
            case 2:
                holder.status_icon.setBackgroundResource(R.drawable.statusicon3);
                holder.status_word.setText("Busy");
                break;
            default:
                holder.status_icon.setBackgroundResource(R.drawable.statusicon);
                holder.status_word.setText("Offline");
                break;
        }
        holder.img.setImageResource(mData.get(position).getPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mCotext, ChatActivity.class);
        intent.putExtra("username", friendListItem.getName());
        intent.putExtra("img", friendListItem.getPhoto());
        mCotext.startActivity(intent);
    }
});
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout item_contact;
        public TextView tv_name;
        public ImageView img;
        public ImageView status_icon;
        public TextView status_word;
        public  MyViewHolder(View itemView){
            super(itemView);
            item_contact = (LinearLayout) itemView.findViewById(R.id.friend_contect);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contect);
            status_icon = (ImageView) itemView.findViewById(R.id.status_icon);
            status_word = (TextView) itemView.findViewById(R.id.satus_word);
        }
    }
}
