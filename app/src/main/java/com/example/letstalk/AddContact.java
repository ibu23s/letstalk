package com.example.letstalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        getSupportActionBar().setTitle("Add Contact");
    }
}