package com.example.fazenda;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProdutoAdapter adapter;
    private List<Produto> listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Alface Crespa", 3.50, 150, "Alface orgânica, fresca e crocante.", R.drawable.alface_crespa));
        listaProdutos.add(new Produto("Tomate Cereja", 6.00, 200, "Tomates cereja colhidos diariamente.", R.drawable.tomate_cereja));
        listaProdutos.add(new Produto("Cenoura Orgânica", 4.50, 100, "Cenouras doces e nutritivas.", R.drawable.cenoura_organica));
        listaProdutos.add(new Produto("Batata Doce Roxa", 5.00, 80, "Batata doce rica em antioxidantes.", R.drawable.batata_doce_roxa));
        listaProdutos.add(new Produto("Abobrinha Italiana", 4.00, 120, "Abobrinhas frescas e saborosas.", R.drawable.abobrinha_italiana));
        listaProdutos.add(new Produto("Leite Artesanal", 8.50, 50, "Leite produzido localmente.", R.drawable.leite_artesanal));
        listaProdutos.add(new Produto("Mel Orgânico", 15.00, 40, "Mel puro, direto do apicultor.", R.drawable.mel_organico));

        adapter = new ProdutoAdapter(listaProdutos);
        recyclerView.setAdapter(adapter);
    }
}
