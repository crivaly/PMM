package com.example.crivaly.myapplicationprueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Maria on 23/09/2014.
 */
public class MainActivity_Pantalla2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pantalla2);

        final TextView otroSaludo = (TextView) findViewById(R.id.miMensaje);

        Bundle miBundleRecoger = getIntent().getExtras();
        otroSaludo.setText(miBundleRecoger.getString("TEXTO"));

        final Button miBoton= (Button)findViewById(R.id.miBtn);


        miBoton.setOnClickListener ( new View.OnClickListener(){
            public void onClick(View v) {
                Intent miIntent = new Intent(MainActivity_Pantalla2.this, MainActivity.class);
                startActivity(miIntent);
            }

        });

    }
}
