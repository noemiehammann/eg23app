package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menu : liaison bouton de menu et autres pages

        // Menu 1
        final Button menu1= (Button) findViewById(R.id.menu1);
        // Création d’un évènement qui attend un clic sur le bouton
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(MainActivity.this, GestionDesEnseignants.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // Menu 2
        final Button menu2= (Button) findViewById(R.id.menu2);
        // Création d’un évènement qui attend un clic sur le bouton
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(MainActivity.this, GestionDesUes.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // Menu 3
        final Button menu3= (Button) findViewById(R.id.menu3);
        // Création d’un évènement qui attend un clic sur le bouton
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(MainActivity.this, RepartitionDesEtudiants.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // Menu 4
        final Button menu4= (Button) findViewById(R.id.menu4);
        // Création d’un évènement qui attend un clic sur le bouton
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(MainActivity.this, StatistiquesFlux.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // Menu 5
        final Button menu5= (Button) findViewById(R.id.menu5);
        // Création d’un évènement qui attend un clic sur le bouton
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(MainActivity.this, GestionDuSemestreEnCours.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });
    }
}