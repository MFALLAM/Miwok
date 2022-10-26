package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapter.FamilyAdapter;
import com.example.android.miwok.data.Family;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Family> family = new ArrayList();

        family.add(new Family("father", "әpә"));
        family.add(new Family("mother", "әṭa"));
        family.add(new Family("son", "angsi"));
        family.add(new Family("daughter", "tune"));
        family.add(new Family("older brother", "taachi"));
        family.add(new Family("younger brother", "chalitti"));
        family.add(new Family("older sister", "teṭe"));
        family.add(new Family("younger sister", "kolliti"));
        family.add(new Family("grandmother", "ama"));
        family.add(new Family("grandfather", "paapa"));

        // Create a link WordAdapter, whose data source is a list of objects
        FamilyAdapter familyAdapter = new FamilyAdapter(FamilyActivity.this, 0, family);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_family_list_view);

        // Set the view to the adapter
        listView.setAdapter(familyAdapter);
    }
}


