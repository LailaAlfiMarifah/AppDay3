package com.example.appday3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MoveObjectActivity extends AppCompatActivity {

    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvtype = findViewById(R.id.tvType);
        TextView tvAge = findViewById(R.id.tvAge);

        Marvel marvel;
        if (Build.VERSION.SDK_INT >= 33){
            marvel = getIntent().getParcelableExtra(KEY_DATA, Marvel.class);
        }else {
            marvel = getIntent().getParcelableExtra(KEY_DATA);
        }
        if (marvel != null){
            //menampilkan data ke dalam TextView
            tvName.setText("Name: " + marvel.getName());
            tvtype.setText("Type: " + marvel.getType());
            tvAge.setText("Age: " + marvel.getAge());
        }

    }
}