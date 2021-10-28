package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    EditText campologin, camposenha;
    Button botaologin, botaocadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        campologin = findViewById(R.id.campologinc);
        camposenha = findViewById(R.id.camposenhac);

        botaocadastro = findViewById(R.id.botaocadastroc);


        botaocadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = campologin.getText().toString();
                senha = camposenha.getText().toString();

                Toast.makeText(getApplicationContext(), "Cadastro realizado!! Usuario: "+usuario+"Senha: "+senha, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);

                startActivity(intent);
                finish();
            }
        });



    }
}