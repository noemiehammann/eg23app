package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class StatistiquesFlux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiques_flux);

        // radio boutons

        RadioGroup radiogroup = findViewById(R.id.radiogroup);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int seltedid = radiogroup.getCheckedRadioButtonId();
                ImageView iv = findViewById(R.id.imageradio);
                switch (seltedid){
                    case R.id.radioButton:
                        //entree
                        iv.setImageResource(R.drawable.entree);
                        break;
                    case R.id.radioButton2:
                        // sortie
                        iv.setImageResource(R.drawable.sortie);
                        break;
                    case R.id.radioButton3:
                        //deux
                        iv.setImageResource(R.drawable.entree_sortie);
                        break;
                }

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