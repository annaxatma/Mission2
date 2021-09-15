package com.example.mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import java.util.ArrayList;

import model.user;

public class inputUser extends AppCompatActivity {

    private Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_user);

        //intiView();
        setListener();
    }

        private void setListener() {
//        .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        }

    private void intiView() {
        toolbar2 = findViewById(R.id.toolbar2);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar2.setTitle("Add Data");
    }

}