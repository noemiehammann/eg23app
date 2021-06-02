package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class GestionDesUes extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> ueList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_des_ues);

        ueList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(ueList);

       // recyclerView.setLayoutManager((new LinearLayoutManager(this)));

        recyclerView.setAdapter(recyclerAdapter);

        ueList.add("EG23");
        ueList.add("GE21");
        ueList.add("GE28");
        ueList.add("GE31");
        ueList.add("GE36");
        ueList.add("IF23");
        ueList.add("LO07");
        ueList.add("LO04");
        ueList.add("LO07");
        ueList.add("NF04");
        ueList.add("NF16");
        ueList.add("RE14");

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(GestionDesUes.this, GestionDesUesGraphiques.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });
    }
}