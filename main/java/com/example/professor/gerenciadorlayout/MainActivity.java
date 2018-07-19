package com.example.professor.gerenciadorlayout;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enviarButton = findViewById(R.id.enviarButton);

        View.OnClickListener onClickListener = this;
        enviarButton.setOnClickListener(onClickListener);
    }

    @Override
    public void onClick(View v) {

        EditText nomeEditText = findViewById(R.id.nomeEditText);
        Context contexto = getApplicationContext();
        String texto = nomeEditText.getText().toString();
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
        Intent it = new Intent(this,HomeActivity.class);
        startActivity(it);

    }
}
