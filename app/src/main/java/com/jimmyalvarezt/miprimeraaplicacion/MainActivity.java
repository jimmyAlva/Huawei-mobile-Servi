package com.jimmyalvarezt.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittextName;
    private EditText editTextPassword;
    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    //se va encargar de iniciar los componentes de la vista
    private void initView(){
        edittextName = findViewById(R.id.edittextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonlogin = findViewById(R.id.buttonlogin);

        buttonlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );
    }

    //funcion que inicia el login
    private void login(){
        String username = edittextName.getText().toString();
        String password = editTextPassword.getText().toString();

        if(username.contentEquals("Jimmy.alvarez") && password.contentEquals("1234")){
            // mensaje de logeo
            edittextName.setError(null);
            editTextPassword.setError(null);
            Toast.makeText(this, "Bienvenido a la POKEDEX", Toast.LENGTH_LONG).show();
            goTopokedex();

        }else{
            //mensaje de error

            edittextName.setError("tu usuario no existe");
            editTextPassword.setError("Contraseña incorrecta");
        }
    }

    private void goTopokedex(){
        //cambio de ventana atraves de una peticion
        //se crea la transacion

        Intent transaction = new Intent(this, PokedexActivity.class);
        //se ejecuta la transacion
        startActivity(transaction);
    }
}