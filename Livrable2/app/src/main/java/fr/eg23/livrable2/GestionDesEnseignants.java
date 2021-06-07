package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class GestionDesEnseignants extends AppCompatActivity {

        RecyclerView recyclerView;
        RecyclerAdapter recyclerAdapter;

        List<String> ueList;
        List<String> ueListAll;

        @SuppressLint("ClickableViewAccessibility")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gestion_des_ues);

            ueList = new ArrayList<>();

            recyclerView = findViewById(R.id.recyclerView);
            recyclerAdapter = new RecyclerAdapter(ueList);

            // recyclerView.setLayoutManager((new LinearLayoutManager(this)));

            recyclerView.setAdapter(recyclerAdapter);

            ueList.add("Anaïs Leclère");
            ueList.add("Annie Masson");
            ueList.add("Baudouin Saint-Yves");
            ueList.add("Côme Bettencourt");
            ueList.add("Élodie Emmanuelli");
            ueList.add("Frederique Delsarte");
            ueList.add("Jacob Larousse");
            ueList.add("Joséphine Mallette");
            ueList.add("Marion Jacquemoud");
            ueList.add("Maxime Rapace");
            ueList.add("Nadège Charrier");

            ueListAll = ueList;

        //retour menu
        final Button retourMenu= (Button) findViewById(R.id.retourMenu);
        // Création d’un évènement qui attend un clic sur le bouton
        retourMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                finish();
            }
        });
    }
}