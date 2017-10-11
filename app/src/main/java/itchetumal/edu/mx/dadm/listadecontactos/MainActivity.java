package itchetumal.edu.mx.dadm.listadecontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView lis;
    ListView lis2;
    ListView lis3;
    String [] contactos = new String[]{"Jhon Jairo Jaramillo", "Pedro Perez", "Carolina Correa"};
    String [] telefonos = new String[]{"3100234355", "23464243"};
    String [] palabras = new String[]{"Pepe", "Pedro","Perez"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lis = (ListView)findViewById(R.id.lista);
        ArrayAdapter arr= new ArrayAdapter(MainActivity.this,android.R.layout.simple_expandable_list_item_1,contactos);
        lis.setAdapter(arr);

        lis2 = (ListView)findViewById(R.id.lista2);
        ArrayAdapter arr2= new ArrayAdapter(MainActivity.this,android.R.layout.simple_expandable_list_item_1,telefonos);
        lis2.setAdapter(arr2);

        lis3 = (ListView)findViewById(R.id.lista3);
        ArrayAdapter arr3= new ArrayAdapter(MainActivity.this,android.R.layout.simple_expandable_list_item_1,palabras);
        lis3.setAdapter(arr3);
    }



}

