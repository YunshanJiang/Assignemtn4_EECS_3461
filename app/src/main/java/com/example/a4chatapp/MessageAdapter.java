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

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.BaseMyviewHolder> {

    public static final int MSG_TYPE_LEFT = 0;
    public static final int MSG_TYPE_RIGHT = 1;



    private int type = 1;
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
    public MessageAdapter.BaseMyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        if (viewType == MSG_TYPE_RIGHT) {
            View v;
            v = LayoutInflater.from(mCotext).inflate(R.layout.chat_item_right, parent, false);
            final MessageAdapter.MyViewHolder viewHolder = new MessageAdapter.MyViewHolder(v);
            return viewHolder;
        }else{
            View v;
            v = LayoutInflater.from(mCotext).inflate(R.layout.chat_item_left, parent, false);
           final MessageAdapter.MyViewHolder2 viewHolder = new MessageAdapter.MyViewHolder2(v);
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseMyviewHolder holder, int position) {
        Chat chat = mChat.get(position);

        holder.show_message.setText(chat.getMessage());

        if (holder instanceof MyViewHolder2){
            ((MyViewHolder2) holder).id.setText(chat.getReceiver());
            holder.profile_image.setImageResource(chat.getImgid());
        }
      //  if (imageurl.equals("default")){
       //     holder.profile_image.setImageResource(R.mipmap.ic_launcher);
      //  }
    }




    @Override
    public int getItemCount() {
        return mChat.size();
    }

    public class MyViewHolder extends BaseMyviewHolder{


        public  MyViewHolder(View itemView){
            super(itemView);

            show_message = (TextView) itemView.findViewById(R.id.show_message);
            profile_image = (ImageView) itemView.findViewById(R.id.profile_image);
        }


    }

    public class MyViewHolder2 extends BaseMyviewHolder{


        public TextView id;

        public  MyViewHolder2(View itemView){
            super(itemView);

            show_message = (TextView) itemView.findViewById(R.id.show_message);
            profile_image = (ImageView) itemView.findViewById(R.id.profile_image);
            id = (TextView)itemView.findViewById(R.id.usernameinchat);
        }


    }

    public  class BaseMyviewHolder extends RecyclerView.ViewHolder{

        public TextView show_message;
        public ImageView profile_image;

        public BaseMyviewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (mChat.get(position).getReceiver() == ""){
            return MSG_TYPE_RIGHT;
        }
        return MSG_TYPE_LEFT;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
