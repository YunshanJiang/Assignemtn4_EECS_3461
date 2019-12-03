package com.example.a4chatapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ChatActivity extends AppCompatActivity {
    TextView username;

    ImageButton btn_send;
    EditText text_send;

    MessageAdapter messageAdapter;
    List<Chat> mchat;

    RecyclerView recyclerView;

    ImageButton call_button;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        androidx.appcompat.widget.Toolbar toorbar = findViewById(R.id.chatToorbar);

        setSupportActionBar(toorbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toorbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mchat = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view_chat);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        //linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        messageAdapter = new MessageAdapter(ChatActivity.this, mchat);
        recyclerView.setAdapter(messageAdapter);
        username = findViewById(R.id.userIdInChat);
        btn_send = findViewById(R.id.btn_send);
        text_send = findViewById(R.id.text_send);
        call_button = (ImageButton) findViewById(R.id.call_button);
        intent = getIntent();
        final String userid = intent.getStringExtra("username");
        final int imgid = intent.getIntExtra("img", 0);
        username.setText(userid);


        btn_send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String msg = text_send.getText().toString();
                if (!msg.equals("")){
                mchat.add(new Chat("a", "", msg, 0));
                    messageAdapter = new MessageAdapter(ChatActivity.this, mchat);
                    recyclerView.setAdapter(messageAdapter);
                }
                text_send.setText("");

                new CountDownTimer(3000, 1000){
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                        mchat.add(new Chat("", userid, "cxczcx", imgid));
                      //  messageAdapter = new MessageAdapter(ChatActivity.this, mchat);

                        messageAdapter.notifyDataSetChanged();
                        //recyclerView.setAdapter(messageAdapter);

                    }
                }.start();
            }
        });



        call_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startVoiceChat();
            }
        });
    }
    private void startVoiceChat(){
        Intent intent = new Intent(this, VoiceChatActivity.class);
        startActivity(intent);
    }
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);

    }

    private void readMesagges(){
   // messageAdapter = new MessageAdapter(ChatActivity.this, mchat);
    }

}
