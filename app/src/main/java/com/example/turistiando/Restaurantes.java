package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    // Atributos de la Clase
    ArrayList<Restaurante> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica = findViewById(R.id.recycle2);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaRestaurantes();
        Adaptador2 adaptador2 = new Adaptador2(lista);
        listaLogica.setAdapter(adaptador2);
    }

    private void crearListaRestaurantes() {
        lista.add(new Restaurante(R.drawable.restaurante1,"Restaurante","$10000"));
        lista.add(new Restaurante(R.drawable.restaurante2,"Restaurante","$20000"));
        lista.add(new Restaurante(R.drawable.restaurante3,"Restaurante","$35000"));
        lista.add(new Restaurante(R.drawable.restaurante4,"Restaurante","$50000"));
    }
}