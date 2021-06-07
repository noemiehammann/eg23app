package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RepartitionDesEtudiants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repartition_des_etudiants);


        //ouverture 1er diagramme
        final Button ouverturebutton3= (Button) findViewById(R.id.buttondiagramme3);
        // Création d’un évènement qui attend un clic sur le bouton
        ouverturebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                Intent intent = new Intent(RepartitionDesEtudiants.this, Repartition2.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        //ouverture 2ème diagramme diagramme
        final Button ouverturebutton4= (Button) findViewById(R.id.buttondiagramme4);
        // Création d’un évènement qui attend un clic sur le bouton
        ouverturebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                Intent intent = new Intent(RepartitionDesEtudiants.this, Repartition2.class);
            }
        });

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