package com.razrow.ryan_san;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.razrow.ryan_san.instagram.InstagramActivity;
import com.razrow.ryan_san.missedcalls.MissedCallsActivity;
import com.razrow.ryan_san.snapchat.SnapchatActivity;
import com.razrow.ryan_san.textmessages.TextMessagesActivity;

public class HomeActivity extends AppCompatActivity {

    ImageButton ibSnapchat;
    ImageButton ibInstagram;
    ImageButton ibTextMessages;
    ImageButton ibMissedCalls;

    Button btnSnapchat;
    Button btnInstagram;
    Button btnTextMessages;
    Button btnMissedCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpButtons();
        setUpOnClicks();
    }

    private void setUpOnClicks(){
        ibSnapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SnapchatActivity.class);
                startActivity(intent);
            }
        });

        btnSnapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SnapchatActivity.class);
                startActivity(intent);
            }
        });

        ibInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, InstagramActivity.class);
                startActivity(intent);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, InstagramActivity.class);
                startActivity(intent);
            }
        });

        ibTextMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TextMessagesActivity.class);
                startActivity(intent);
            }
        });

        btnTextMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TextMessagesActivity.class);
                startActivity(intent);
            }
        });

        ibMissedCalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MissedCallsActivity.class);
                startActivity(intent);
            }
        });

        btnMissedCalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MissedCallsActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setUpButtons(){
        ibSnapchat = findViewById(R.id.ibSnapchat);
        ibInstagram = findViewById(R.id.ibInstagram);
        ibTextMessages = findViewById(R.id.ibTextMessage);
        ibMissedCalls = findViewById(R.id.ibMissedCalls);

        btnSnapchat = findViewById(R.id.btnSnapchat);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnTextMessages = findViewById(R.id.btnTextMessages);
        btnMissedCalls = findViewById(R.id.btnMissedCalls);
    }
}
