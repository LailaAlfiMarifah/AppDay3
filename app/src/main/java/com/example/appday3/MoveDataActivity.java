package com.example.appday3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveDataActivity extends AppCompatActivity {
    public static final String KEY_DATA = "key_name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        String name = getIntent().getStringExtra(KEY_DATA);

        TextView tvNama = findViewById(R.id.tvNama);
        tvNama.setText(name);

    }
}