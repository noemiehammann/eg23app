package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

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

        //barre de recherche
       ImageButton searchbuttonUe = findViewById(R.id.rechercheUes);
       searchbuttonUe.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText searchtextUe = findViewById(R.id.barreTxtUes);
               String rechercheUe = searchtextUe.getText().toString().toLowerCase();
               recyclerAdapter.getFilter().filter(rechercheUe);

           }
       });



        }

        //pour aller sur une autre page -- NE FONCTIONNE PAS
        /*recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(GestionDesUes.this, GestionDesUesGraphiques.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        }); */

    }