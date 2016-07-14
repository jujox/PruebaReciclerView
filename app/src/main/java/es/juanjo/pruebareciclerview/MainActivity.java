package es.juanjo.pruebareciclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
    List mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaMascotas();
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerViewPrincipal);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new Adaptador(mascotas);
        this.recyclerView.setAdapter(this.adapter);

    }

    private void inicializaMascotas() {
        this.mascotas = new ArrayList();
        this.mascotas.add(new Mascota(R.drawable.perrete1, "perrete1", "raza 1"));
        this.mascotas.add(new Mascota(R.drawable.perrete2, "perrete2", "raza 2"));
        this.mascotas.add(new Mascota(R.drawable.perrete3, "perrete3", "raza 3"));
        this.mascotas.add(new Mascota(R.drawable.perrete4, "perrete4", "raza 4"));
    }
}
