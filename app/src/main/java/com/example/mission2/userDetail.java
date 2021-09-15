package com.example.mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class userDetail extends AppCompatActivity {

    Button edit, trash;
    TextView forname, forage, foraddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        edit = findViewById(R.id.edit);
        trash = findViewById(R.id.trash);
        forname = findViewById(R.id.forname);
        forage = findViewById(R.id.forage);
        foraddress = findViewById(R.id.foraddress);
    }
}