package com.example.appday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btnMove);
        Button btnMoveData = findViewById(R.id.btnMoveData);
        Button btnMoveObj = findViewById(R.id.btnMoveObj);
        Button btnImplisit = findViewById(R.id.btnImplisit);

        //Listener
        btnMove.setOnClickListener(this);
        btnMoveData.setOnClickListener(this);
        btnMoveObj.setOnClickListener(this);
        btnImplisit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnMove){
            Intent intent = new Intent(this, MoveActivity.class);
            startActivity(intent);

        } else if (view.getId() == R.id.btnMoveData) {
            Intent intent = new Intent(this, MoveDataActivity.class);
            intent.putExtra(MoveDataActivity.KEY_DATA, "Fulan");
            startActivity(intent);

        } else if (view.getId() == R.id.btnMoveObj) {
            Marvel marvel = new Marvel();
            marvel.setName("Spiderman");
            marvel.setType("Human");
            marvel.setAge(12);

            Intent intent = new Intent(this, MoveObjectActivity.class);
            intent.putExtra(MoveObjectActivity.KEY_DATA, marvel);
            startActivity(intent);

        } else if (view.getId() == R.id.btnImplisit) {
            String phone = "081215161718";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " +phone));
            startActivity(intent);
        }
    }
}