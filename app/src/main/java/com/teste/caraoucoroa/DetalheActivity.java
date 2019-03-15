package com.teste.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class DetalheActivity extends AppCompatActivity {

    ImageView _imgCaraCoroa;
    ImageButton _btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        _imgCaraCoroa = findViewById(R.id.imgCaraCoroa);
        _btnVoltar = findViewById(R.id.BtnVoltar);

        GerarCaraOuCoroa();
        _btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VoltarTelaPrincipal();
            }
        });
    }

    private void GerarCaraOuCoroa() {
        Random random = new Random();
        int numRandom = random.nextInt(10);

        if (numRandom % 2 == 0)
            _imgCaraCoroa.setImageResource(R.drawable.moeda_coroa);
    }

    private void VoltarTelaPrincipal() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
