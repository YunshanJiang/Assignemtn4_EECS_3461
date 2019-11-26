package com.example.a4chatapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

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
    }
private void CreateAccountActivity(){
    Intent intent = new Intent(this, NewAccountActivity.class);
    startActivity(intent);
 }
}
