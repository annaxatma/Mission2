package com.example.mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

import model.user;
import model.save;

public class inputUser extends AppCompatActivity {

    TextView nama, umur, alamat;
    Button save;
    String namaa, umurr, alamatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_user);

        initView();
        setListener();
        setText();
    }

    private TextWatcher check = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            namaa = nama.getText().toString().trim();
            umurr = umur.getText().toString().trim();
            alamatt = alamat.getText().toString().trim();

            if (!namaa.isEmpty()) {
                save.setEnabled(true);
            }else {
                save.setEnabled(false);
            }

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void  setText() {
        nama.addTextChangedListener(check);
        umur.addTextChangedListener(check);
        alamat.addTextChangedListener(check);
    }

    private void setListener() {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user data = new user(nama, alamat, umur);
                model.save.savedata.add(data);

                Intent start = new Intent(inputUser.this, MainActivity.class);
                start.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(start);
                finish();
            }
        });
    }

    private void initView() {
        nama = findViewById(R.id.nama);
        umur = findViewById(R.id.umur);
        alamat = findViewById(R.id.alamat);
        save = findViewById(R.id.save);
    }

}