package com.example.myagenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myagenda.controller.ContatoController;
import com.example.myagenda.model.Contato;
import com.example.myagenda.model.ContatoDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //propriedades referentes aos componentes View no layout
    private Toolbar toolbar;
    private ListView listView;
    private FloatingActionButton fabAdicionar;
    private List<Contato> contatos;
    private ArrayAdapter<Contato> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inicializarViews();
        carregarContatos();
    }

    private void inicializarViews(){
        //inicalizar os componentes
        toolbar = findViewById(R.id.toolbar);
        listView = findViewById(R.id.listView);
        fabAdicionar = findViewById(R.id.fabAdicionar);

        fabAdicionar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AdicionarContatoActivity.class);
            startActivity(intent);
        });
    }

}