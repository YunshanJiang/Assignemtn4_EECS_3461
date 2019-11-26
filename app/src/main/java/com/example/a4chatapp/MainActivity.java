package com.example.a4chatapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import Persistent.UserAccountModel;
import Service.CommunicationServiceImpl;
import Service.UserAccountServiceImpl;

public class MainActivity extends AppCompatActivity {

    private static UserAccountServiceImpl userAccountServiceimpl = new UserAccountServiceImpl();
    private static CommunicationServiceImpl communicationServiceImpl = new CommunicationServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /**
     * When the user id is used as parameter (e.g., "isabelle"), it returns its relevant user information
     * @param userId
     * @return UserAccount
     */
     private UserAccountModel.UserAccount getUserInformationById(String userId){
        return userAccountServiceimpl.retrieveUserAccountByUserId(userId);
    }

    /**
     * When the app user's message is used as parameter (e.g., 'how are you?'), it returns the virtual user's response
     * @param message
     * @return String
     */
    private String getResponseFromtheBotByUserMessage(String message){
        return communicationServiceImpl.getResponse(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
