package com.example.exp2_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pedido extends AppCompatActivity {

    String PP = "Pizza Pastorera";
    String PM = "Pizza Mexicana";
    String PQ = "Pizza Doble Queso";
    private TextView tvPizzaName;
    private TextView tvOrden2;
    private TextView tvPrecio2;
    private Button btnCompraOrden;
    private EditText txtNombrePedido;
    private EditText txtDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        tvPizzaName = (TextView) findViewById(R.id.tvPizzaName);
        tvOrden2 = (TextView) findViewById(R.id.tvOrden2);
        tvPrecio2 = (TextView) findViewById(R.id.tvPrecio2);
        GettvOrden0();

        String Pizza = tvPizzaName.getText().toString();

        if (Pizza.equals(PP)){
            GettvOrden2();
            GettvPrecio2();
        } else if (Pizza.equals(PM)){
            GettvOrden3();
            GettvPrecio3();
        } else if (Pizza.equals(PQ)){
            GettvOrden4();
            GettvPrecio4();
        }

        btnCompraOrden = (Button) findViewById(R.id.btnCompraOrden);
        txtNombrePedido = (EditText)findViewById(R.id.txtNombrePedido);
        txtDireccion = (EditText)findViewById(R.id.txtDireccion);

        btnCompraOrden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hiciste Click",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Pasaste a la segunda pantalla");
                String cadenaN = txtNombrePedido.getText().toString();
                String cadenaD = txtDireccion.getText().toString();
                Intent intent = new Intent(Pedido.this,Compra.class);
                intent.putExtra("informacion001",cadenaN);
                intent.putExtra("informacion002",cadenaD);
                startActivity(intent);
            }
        });
    }
    //Pizzas
    private void GettvOrden0() {
        Bundle extras=getIntent().getExtras();
        tvPizzaName.setText(extras.get("informacion0").toString());
    }
    private void GettvOrden3() {
        Bundle extras=getIntent().getExtras();
        tvOrden2.setText(extras.get("informacion3").toString());
    }
    private void GettvPrecio3() {
        Bundle extras = getIntent().getExtras();
        tvPrecio2.setText(extras.get("informacion4").toString());
    }
    private void GettvOrden2() {
        Bundle extras=getIntent().getExtras();
        tvOrden2.setText(extras.get("informacion1").toString());
    }
    private void GettvPrecio2() {
        Bundle extras=getIntent().getExtras();
        tvPrecio2.setText(extras.get("informacion2").toString());
    }
    private void GettvOrden4() {
        Bundle extras=getIntent().getExtras();
        tvOrden2.setText(extras.get("informacion5").toString());
    }
    private void GettvPrecio4() {
        Bundle extras = getIntent().getExtras();
        tvPrecio2.setText(extras.get("informacion6").toString());
    }

}

