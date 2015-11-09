package pecesenlanube.elenamartinezexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Segunda_pantalla extends AppCompatActivity {

    TextView factura;
    TextView factura2;
    TextView factura3;
    TextView factura4;
    TextView factura5;
    TextView factura6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);


        factura= (TextView) findViewById (R.id.factura);
        factura2= (TextView) findViewById (R.id.factura2);
        factura3= (TextView) findViewById (R.id.factura3);
        factura4= (TextView) findViewById (R.id.factura4);
        factura5= (TextView) findViewById (R.id.factura5);
        factura6= (TextView) findViewById (R.id.factura6);


        Intent intent = getIntent ();
        Bundle extras = intent.getExtras();

        //comprobar si está vacío


            String dato1= extras.getString("PIZZA");
            String dato2=extras.getString("PRECIO");
            String dato3= extras.getString("EXTRA");
            String dato4=extras.getString("UNIDADES");
            String dato5=extras.getString("ENVIO");
            String dato6=extras.getString("COSTE FINAL");





            factura.setText(factura.getText()+ " "+dato1);
            factura2.setText(factura2.getText()+ " "+dato2);
            factura3.setText(factura3.getText()+" "+dato3);
            factura4.setText(factura4.getText()+ " "+ dato4);
            factura5.setText(factura5.getText()+ " "+ dato5);
            factura6.setText(factura6.getText()+ " "+ dato6);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segunda_pantalla, menu);
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
}
