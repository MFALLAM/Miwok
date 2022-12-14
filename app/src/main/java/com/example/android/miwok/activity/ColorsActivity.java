package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Color;
import com.example.android.miwok.adapter.ColorAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(new Color("red", "weṭeṭṭi"));
        colors.add(new Color("green", "chokokki"));
        colors.add(new Color("brown", "ṭakaakki"));
        colors.add(new Color("gray", "ṭopoppi"));
        colors.add(new Color("black", "kululli"));
        colors.add(new Color("white", "kelelli"));
        colors.add(new Color("dusty yellow ", "ṭopiisә"));
        colors.add(new Color("mustard yellow", "chiwiiṭә"));

        // Create a link WordAdapter, whose data source is a list of objects
        ColorAdapter colorAdapter = new ColorAdapter(ColorsActivity.this, 0, colors);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_colors_list_view);

        // Set the view to the adapter
        listView.setAdapter(colorAdapter);
    }
}