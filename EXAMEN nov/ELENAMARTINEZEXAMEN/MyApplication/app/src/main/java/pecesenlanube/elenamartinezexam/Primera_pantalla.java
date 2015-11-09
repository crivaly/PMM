package pecesenlanube.elenamartinezexam;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Primera_pantalla extends AppCompatActivity implements View.OnClickListener{

    RadioGroup rg, rg2;
    CheckBox grande, ingredientes, sabrosa;
    Button totalPedido, factura;
    EditText editText;
    TextView text2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        rg=(RadioGroup)findViewById(R.id.rg);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        grande=(CheckBox)findViewById(R.id.checkBox);
        ingredientes=(CheckBox)findViewById(R.id.checkBox2);
        sabrosa=(CheckBox)findViewById(R.id.checkBox3);
        editText=(EditText)findViewById(R.id.editText);
        text2=(TextView)findViewById(R.id.textView2);
        totalPedido=(Button)findViewById(R.id.button);
        factura=(Button)findViewById(R.id.button2);

        totalPedido.setOnClickListener(this);
        factura.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_primera_pantalla, menu);
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



        double precio=0.0, pago=0.0;
        String pizzaString="",recogidaString="", extrasString="", unidadesString="", precioString="", pagoString="";


            if((v.getId()==R.id.button)) {

                //seleccionar pizza


                if (rg2.getCheckedRadioButtonId() == R.id.radioButton3) {
                    pizzaString = "Carbonara";
                    precioString="10";
                    precio = 10;
                    pago=pago+precio;

                }
                if (rg2.getCheckedRadioButtonId() == R.id.radioButton4) {
                    pizzaString = "Hawaiana";
                    precioString="20";
                    precio = 20;
                    pago=pago+precio;
                }
                if (rg2.getCheckedRadioButtonId() == R.id.radioButton5) {
                    pizzaString = "Barbacoa";
                    precioString="30";
                    precio= 30;
                    pago=pago+precio;
                }


                // editText - numero de unidades de pizza

                String numeroPizzas = editText.getText() + "";


                // radioButton 1 y 2
                if (rg.getCheckedRadioButtonId() == R.id.radioButton1) {
                    recogidaString = "local";

                } else if (rg.getCheckedRadioButtonId() == R.id.radioButton2) {
                    recogidaString = "domicilio";
                    pago = pago * 1.1;
                }


                // extras - cada extra suma 1€
                if (grande.isChecked()) {
                    pago = pago + 1;
                    extrasString = extrasString.concat("+ grande. ");
                }
                if (ingredientes.isChecked()) {
                    pago = pago + 1;
                    extrasString = extrasString.concat("+ ingredientes. ");
                }
                if (sabrosa.isChecked()) {
                    pago = pago + 1;
                    extrasString = extrasString.concat("+ sabrosa. ");
                }
                int unidades = Integer.parseInt(editText.getText()+"");
                unidadesString = Integer.toString(unidades);

                pago=pago*unidades;



                //textView2 - muestra el precio final

               pagoString = Double.toString(pago);


                text2.setText(pagoString);

            }

        if((v.getId()==R.id.button2)) {
            if (rg2.getCheckedRadioButtonId() == R.id.radioButton3) {
                pizzaString = "Carbonara";
                precioString="10";
                precio = 10;
                pago=pago+precio;

            }
            if (rg2.getCheckedRadioButtonId() == R.id.radioButton4) {
                pizzaString = "Hawaiana";
                precioString="20";
                precio = 20;
                pago=pago+precio;
            }
            if (rg2.getCheckedRadioButtonId() == R.id.radioButton5) {
                pizzaString = "Barbacoa";
                precioString="30";
                precio= 30;
                pago=pago+precio;
            }


            // editText - numero de unidades de pizza

            String numeroPizzas = editText.getText() + "";


            // radioButton 1 y 2
            if (rg.getCheckedRadioButtonId() == R.id.radioButton1) {
                recogidaString = "local";

            } else if (rg.getCheckedRadioButtonId() == R.id.radioButton2) {
                recogidaString = "domicilio";
                pago = pago * 1.1;
            }


            // extras - cada extra suma 1€
            if (grande.isChecked()) {
                pago = pago + 1;
                extrasString = extrasString.concat("+ grande. ");
            }
            if (ingredientes.isChecked()) {
                pago = pago + 1;
                extrasString = extrasString.concat("+ ingredientes. ");
            }
            if (sabrosa.isChecked()) {
                pago = pago + 1;
                extrasString = extrasString.concat("+ sabrosa. ");
            }
            int unidades = Integer.parseInt(editText.getText()+"");
            unidadesString = Integer.toString(unidades);

            pago=pago*unidades;



            //textView2 - muestra el precio final

            pagoString = Double.toString(pago);

            Intent intent = new Intent(Primera_pantalla.this, Segunda_pantalla.class);

            intent.putExtra("PIZZA", pizzaString);
            intent.putExtra("PRECIO", precioString);
            intent.putExtra("EXTRA", extrasString);
            intent.putExtra("UNIDADES", unidadesString);
            intent.putExtra("ENVIO", recogidaString);
            intent.putExtra("COSTE FINAL", pagoString);

            startActivity(intent);

        }

    }
}
