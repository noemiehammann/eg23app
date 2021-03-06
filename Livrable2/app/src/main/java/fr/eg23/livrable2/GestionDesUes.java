package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
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

        ueListAll = ueList;

        //barre de recherche -- filtrage
       ImageButton searchbuttonUe = findViewById(R.id.rechercheUes);
       searchbuttonUe.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText searchtextUe = findViewById(R.id.barreTxtUes);
               String rechercheUe = searchtextUe.getText().toString().toLowerCase();

               List<String> filteredList = new ArrayList<>();
               if (rechercheUe.isEmpty()){
                   filteredList.addAll(ueList);
               } else{
                   for (String ue: ueListAll){
                       if (ue.toLowerCase().contains(rechercheUe.toLowerCase())){
                           filteredList.add(ue);
                       }
                   }
               }

               ueList.clear();
               ueList.addAll(filteredList);
               recyclerAdapter.notifyDataSetChanged();

           }
       });

       //passage aux graphismes
       recyclerView.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               // Cr??ation d???une activit?? associ??e ?? l???ex??cution de MaGestionListe.class
               Intent intent = new Intent(GestionDesUes.this, GestionDesUesGraphiques.class);
               // Ex??cution de l???activit?? : ouverture de la fen??tre
               startActivity(intent);
               return false;
           }
       });

       //retour menu
        final Button retourMenu= (Button) findViewById(R.id.retourMenu);
        // Cr??ation d???un ??v??nement qui attend un clic sur le bouton
        retourMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction d??clench??e sur le clic du bouton

                finish();
            }
        });
    }
}