package br.com.etecia.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText campologin, camposenha;
    Button botaologin, botaocadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        campologin = findViewById(R.id.campologin);
        camposenha = findViewById(R.id.camposenha);

        botaologin = findViewById(R.id.botaologin);
        botaocadastro = findViewById(R.id.botaocadastro);

        botaologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = campologin.getText().toString();
                senha = camposenha.getText().toString();
                if (usuario.equals("abelhinha") && senha.equals("123456789")) {
                    Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                    startActivity(intent);
                    finish();
                }
                else {

                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();
                    campologin.setText("");
                    camposenha.setText("");
                    campologin.requestFocus();

                }
            }
        });

        botaocadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CadastroActivity.class);

                startActivity(intent);
                finish();
            }
        });

    }

}