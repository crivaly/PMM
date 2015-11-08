package com.example.crivaly.tablelayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1, boton2, boton3, borrar;
    TextView fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton1 = (Button)findViewById(R.id.boton1);
        boton2 = (Button)findViewById(R.id.boton2);
        boton3 = (Button)findViewById(R.id.boton3);
        borrar = (Button)findViewById(R.id.borrar);

        fondo = (TextView)findViewById(R.id.fondo);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        borrar.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.boton1):
                fondo.setBackgroundColor(getResources().getColor(R.color.rojo));
                break;
            case (R.id.boton2):
                fondo.setBackgroundColor(getResources().getColor(R.color.verde));
                break;
            case (R.id.boton3):
                fondo.setBackgroundColor(getResources().getColor(R.color.azul));
                break;
            case (R.id.borrar):
                fondo.setBackgroundColor(getResources().getColor(R.color.nada));
                break;
        }

    }
}
