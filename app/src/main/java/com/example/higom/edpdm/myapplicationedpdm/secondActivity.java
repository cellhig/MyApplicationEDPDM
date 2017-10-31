package com.example.higom.edpdm.myapplicationedpdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        boton = (Button)findViewById(R.id.button);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button:
                Intent intent = new Intent(secondActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
