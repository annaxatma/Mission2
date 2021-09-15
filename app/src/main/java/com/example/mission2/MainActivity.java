package com.example.mission2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import model.user;

public class MainActivity extends AppCompatActivity implements OnCardListener{

    RecyclerView RecyclerView;
    FloatingActionButton add;
    ArrayList<user> list;
    int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiView();
        setListener();
    }

    private void setListener() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), inputUser.class);
                startActivity(intent);
            }
        });
    }

    private void intiView() {
        RecyclerView = findViewById(R.id.RecyclerView);
        add = findViewById(R.id.add);

        list = new ArrayList<user>();
    }

    @Override
    public void onCardClick(int position) {

    }
}