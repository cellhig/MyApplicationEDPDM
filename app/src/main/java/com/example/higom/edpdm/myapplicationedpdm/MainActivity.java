package com.example.higom.edpdm.myapplicationedpdm;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //TextView campoTexto;
    EditText edText;
    //ImageView image;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*image = (ImageView)findViewById(R.id.image1);*/

        //campoTexto = (TextView)findViewById(R.id.texto1);
        //campoTexto.setText("hola de nuevo Hector!");

        //edText = (EditText)findViewById(R.id.editText1);
        //edText.setText("cambiamos texto");

        boton = (Button)findViewById(R.id.button);
        edText = (EditText)findViewById(R.id.editText);
        //boton2 = (Button)findViewById(R.id.button2);

        boton.setOnClickListener(this);
        //boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button:
                String dato = edText.getText().toString();
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("DATO",dato);
                startActivity(intent);
                break;
        }
    }
}
