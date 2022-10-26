package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapter.PhraseAdapter;
import com.example.android.miwok.data.Phrase;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        ArrayList<Phrase> phrases = new ArrayList<>();

        // Create a link WordAdapter, whose data source is a list of objects
        PhraseAdapter phraseAdapter = new PhraseAdapter(PhraseActivity.this, 0, phrases);

        // Find the view ListView
        ListView listView = findViewById(R.id.phrase_list_view);

        // Set the view to the adapter
        listView.setAdapter(phraseAdapter);
    }
}