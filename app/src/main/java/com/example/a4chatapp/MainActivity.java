package com.example.a4chatapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Persistent.UserAccountModel;
import Service.UserAccountServiceImpl;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private Button CreateAccountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.button);
        CreateAccountButton = (Button)findViewById(R.id.button2);
        CreateAccountButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CreateAccountActivity();
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText userId = (EditText) findViewById(R.id.userId);
                EditText password = (EditText) findViewById(R.id.password);
                TextView validationMessage = (TextView) findViewById(R.id.validationMessage);
                if(accountCheck(userId.getText().toString(), password.getText().toString())){
                    validationMessage.setTextColor(Color.parseColor("#00A829"));
                    validationMessage.setText("Login Suceed!");
                    CreateMessageActivity();
                } else {
                    validationMessage.setText("* Id or Password Not Correct.");
                }
            }
        });
    }
    private void CreateAccountActivity(){
        Intent intent = new Intent(this, NewAccountActivity.class);
        startActivity(intent);
    }
    private void CreateMessageActivity(){
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
        finish();
    }

    private UserAccountServiceImpl userAccountServiceImpl = new UserAccountServiceImpl();
    private boolean accountCheck(String userId, String password){
        UserAccountModel.UserAccount ua = userAccountServiceImpl.retrieveUserAccountByUserId(userId);
        if(ua != null && password.equals(ua.getPassword())){
            return true;
        }
        return false;
    }
}
