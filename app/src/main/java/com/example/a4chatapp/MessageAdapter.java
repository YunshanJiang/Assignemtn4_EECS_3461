package com.example.a4chatapp;

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

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    public static final int MSG_TYPE_LEFT = 0;
    public static final int MSG_TYPE_RIGHT = 1;


    Context mCotext;
    List<Chat> mChat;
    private String  imageurl;


    public  MessageAdapter(Context mContext, List<Chat> mChat){
        this.mCotext = mContext;
        this.mChat = mChat;
       // this.imageurl = imageurl;
    }

    @NonNull
    @Override
    public MessageAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       // if (viewType == MSG_TYPE_RIGHT) {
            View v;
            v = LayoutInflater.from(mCotext).inflate(R.layout.chat_item_right, parent, false);
            final MessageAdapter.MyViewHolder viewHolder = new MessageAdapter.MyViewHolder(v);
            return viewHolder;
//        }else{
//            View v;
//            v = LayoutInflater.from(mCotext).inflate(R.layout.chat_item_left, parent, false);
//            final MessageAdapter.MyViewHolder viewHolder = new MessageAdapter.MyViewHolder(v);
//            return viewHolder;
//        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Chat chat = mChat.get(position);

        holder.show_message.setText(chat.getMessage());

        if (imageurl.equals("default")){
            holder.profile_image.setImageResource(R.mipmap.ic_launcher);
        }
    }



    @Override
    public int getItemCount() {
        return mChat.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView show_message;
        public ImageView profile_image;

        public  MyViewHolder(View itemView){
            super(itemView);

            show_message = (TextView) itemView.findViewById(R.id.show_message);
            profile_image = (ImageView) itemView.findViewById(R.id.profile_image);
        }
    }
}
