package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    int[] image= {
            R.drawable.realmadrid, R.drawable.manu, R.drawable.barca, R.drawable.chelsea, R.drawable.liverpool,
    };
RecycleViewAdapter recycleViewAdapter;
    String[] title,description;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        title=getResources().getStringArray(R.array.Football_clubs);
        description=getResources().getStringArray(R.array.club_descriptions);


        recycleViewAdapter=new RecycleViewAdapter(this,title,description,image);

        recyclerView.setAdapter(recycleViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

}}