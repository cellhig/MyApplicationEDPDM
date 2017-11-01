package com.example.higom.edpdm.myapplicationedpdm;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    //TextView campoTexto;
    //EditText edText;
    //ImageView image;
    //Button boton;
    LinearLayout ln;
    SensorManager sm;
    Sensor sensor;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ln = (LinearLayout)findViewById(R.id.linear);
        tv = (TextView)findViewById(R.id.texto);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        /*image = (ImageView)findViewById(R.id.image1);*/

        //campoTexto = (TextView)findViewById(R.id.texto1);
        //campoTexto.setText("hola de nuevo Hector!");

        //edText = (EditText)findViewById(R.id.editText1);
        //edText.setText("cambiamos texto");

        //boton = (Button)findViewById(R.id.button);
        //edText = (EditText)findViewById(R.id.editText);
        //boton2 = (Button)findViewById(R.id.button2);

        //boton.setOnClickListener(this);
        //boton2.setOnClickListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        String texto = String.valueOf(event.values[0]);
        tv.setText(texto);

        float valor = Float.parseFloat(texto);

        if (valor == 0) {
            ln.setBackgroundColor(Color.BLUE);
        } else {
            ln.setBackgroundColor(Color.YELLOW);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    /*@Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button:
                String dato = edText.getText().toString();
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("DATO",dato);
                startActivity(intent);
                break;
        }
    }  */
}
