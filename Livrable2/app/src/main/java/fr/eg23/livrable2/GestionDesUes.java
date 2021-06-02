package fr.eg23.livrable2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

    }
}