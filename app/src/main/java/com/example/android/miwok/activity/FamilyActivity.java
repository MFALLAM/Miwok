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

        family.add(new Family("father", "әpә", R.drawable.family_father));
        family.add(new Family("mother", "әṭa", R.drawable.family_mother));
        family.add(new Family("son", "angsi", R.drawable.family_son));
        family.add(new Family("daughter", "tune", R.drawable.family_daughter));
        family.add(new Family("older brother", "taachi",R.drawable.family_older_brother));
        family.add(new Family("younger brother", "chalitti", R.drawable.family_younger_brother));
        family.add(new Family("older sister", "teṭe", R.drawable.family_younger_sister));
        family.add(new Family("younger sister", "kolliti",R.drawable.family_younger_sister));
        family.add(new Family("grandmother", "ama",R.drawable.family_grandmother));
        family.add(new Family("grandfather", "paapa", R.drawable.family_grandfather));

        // Create a link WordAdapter, whose data source is a list of objects
        FamilyAdapter familyAdapter = new FamilyAdapter(FamilyActivity.this, 0, family, R.color.category_family);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_family_list_view);

        // Set the view to the adapter
        listView.setAdapter(familyAdapter);
    }
}


