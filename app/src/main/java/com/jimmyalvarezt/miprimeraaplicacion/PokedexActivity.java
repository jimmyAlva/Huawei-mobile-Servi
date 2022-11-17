package com.jimmyalvarezt.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import entities.Pokemon;

public class PokedexActivity extends AppCompatActivity {

    //componentes
    private ImageView imageViewpoke;
    private TextView textViewPokemon;
    private TextView textViewpokemonDescripcion;
    private Button botonsiguiente;
    private Button botonanterior;

    private ArrayList<Pokemon> lstPokemon = new ArrayList<>();
    private int currenIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        initView();
    }

    private void initView(){
        imageViewpoke = findViewById(R.id.imageViewpoke);
        textViewPokemon = findViewById(R.id.textViewpokemon);
        textViewpokemonDescripcion = findViewById(R.id.textViewpokemonDescripcion);

        botonsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currenIndex ++;
                setCurrentPokemon(currenIndex);
            }
        }
        );

        botonanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currenIndex > 0) {
                    currenIndex--;
                    setCurrentPokemon(currenIndex);
                }
            }
        }
        );
    }

    private void setCurrentPokemon(int index){

        imageViewpoke.setImageResource(lstPokemon.get(index).getImage());
        textViewPokemon.setText(lstPokemon.get(index).getName());
        textViewpokemonDescripcion.setText(lstPokemon.get(index).getDescrip());
    }

    // simula una conexion a base de datos
    private ArrayList<Pokemon> getpokemons() {

        ArrayList<Pokemon> newPokemons = new ArrayList<>();

        newPokemons.add(new Pokemon("pepe", "Es un pokemon lejendario",R.drawable.poke2));
        newPokemons.add(new Pokemon("guilo", "Es un pokemon de agua",R.drawable.poke3));
        newPokemons.add(new Pokemon("carmen", "Es un pokemon de tierra",R.drawable.pica));
        newPokemons.add(new Pokemon("rogelio", "Es un pokemon triste",R.drawable.fuego));

        return newPokemons;
    }
}