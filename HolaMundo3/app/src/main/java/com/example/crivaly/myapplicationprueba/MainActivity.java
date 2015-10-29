package com.example.crivaly.myapplicationprueba;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // final TextView mensajeIni;
    final EditText miTexto= (EditText)findViewById(R.id.miTxt);
    final Button miBoton= (Button)findViewById(R.id.miBtn);
    final TextView elSaludo= (TextView)findViewById(R.id.miLbl);





    miBoton.setOnClickListener ( new View.OnClickListener(){
        public void onClick(View v){
            Intent miIntent= new Intent(MainActivity.this, MainActivity_Pantalla2.class);

            //lleva el contenido
            Bundle miBundle=new Bundle();
            String mensajePaso= "Te saludo " + miTexto.getText();
            miBundle.putString("TEXTO", mensajePaso);
            miIntent.putExtras(miBundle);

            startActivity(miIntent);
        }

    });


}


}
