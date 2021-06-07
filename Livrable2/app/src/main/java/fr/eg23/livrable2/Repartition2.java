package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Repartition2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repartition2);

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