package com.example.eqs.projectlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private ListView listviewPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "marcel", 50,"14451145511"));

        listviewPessoas = findViewById(R.id.listviewPessoas);
        ArrayAdapter<Pessoa> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pessoas);
        listviewPessoas.setAdapter(arrayAdapter);
    }
}
