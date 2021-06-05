package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class GestionDesUesGraphiques extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_des_ues_graphiques);


        //ouverture 1er diagramme
        final Button ouverturebutton1= (Button) findViewById(R.id.buttondiagramme1);
        final ImageView diagramme1 = (ImageView) findViewById(R.id.diagramme1);
        // Création d’un évènement qui attend un clic sur le bouton
        ouverturebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                diagramme1.setImageResource(R.drawable.effectif_ue_full);
            }
        });

        //ouverture 2ème diagramme diagramme
        final Button ouverturebutton2= (Button) findViewById(R.id.buttondiagramme2);
        final ImageView diagramme2 = (ImageView) findViewById(R.id.diagramme2);
        // Création d’un évènement qui attend un clic sur le bouton
        ouverturebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                diagramme2.setImageResource(R.drawable.encadrement_ue_full);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

