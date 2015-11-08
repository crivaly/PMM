package pecesenlanube.ejercicio03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup rg ;
    CheckBox chk1, chk2;
    Button aplicar;
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rg=(RadioGroup)findViewById(R.id.radioGroup);
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        aplicar=(Button) findViewById(R.id.botonAplicar);
        mostrar=(TextView)findViewById(R.id.textoFinal);

        aplicar.setOnClickListener(this);



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
        int pre=0;
        String cur="";

        if (rg.getCheckedRadioButtonId()==R.id.radioButton1){
            pre=900;
            cur="android";
        }else if(rg.getCheckedRadioButtonId()==R.id.radioButton2){
            pre=700;
            cur="java";
        }else if(rg.getCheckedRadioButtonId()==R.id.radioButton3) {
            pre = 800;
            cur = "python";
        }

        double d1=0, d2=0;

        if (chk1.isChecked()){
            d1=pre*0.20;
        }
        if (chk2.isChecked()){
            d2=pre*0.30;
        }

        double total= pre-d1-d2;

        //Toast.makeText(getApplicationContext(),"el curso que has seleccionado es: "+ cur+"\nsu precio es: "+pre+"\nel descuento 1 es: "+d1+"\nel descuento 2 es: "+d2+"\ntotal a pagar: "+total,Toast.LENGTH_LONG).show();

        mostrar.setText("el curso que has seleccionado es: "+ cur+"\nsu precio es: "+pre+"\nel descuento 1 es: "+d1+"\nel descuento 2 es: "+d2+"\ntotal a pagar: "+total);
    }
}
