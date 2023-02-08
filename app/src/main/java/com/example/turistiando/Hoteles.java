package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    // Atributos de la Clase
    ArrayList<Hotel> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica = findViewById(R.id.recycle);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);
    }
    public void crearListaHoteles(){
        lista.add(new Hotel(R.drawable.hoteles1,"Hotel","$150000"));
        lista.add(new Hotel(R.drawable.hoteles2,"Hotel","$200000"));
        lista.add(new Hotel(R.drawable.hoteles3,"Hotel","$350000"));
        lista.add(new Hotel(R.drawable.hoteles4,"Hotel","$500000"));
    }
}

