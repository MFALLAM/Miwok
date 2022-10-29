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

        phrases.add(new Phrase("minto wuksus", "Where are you going?", -1));
        phrases.add(new Phrase("tinnә oyaase'nә", "What is your name?", -1));
        phrases.add(new Phrase("oyaaset", "My name is..", -1));
        phrases.add(new Phrase("michәksәs?", "How are you feeling?", -1));
        phrases.add(new Phrase("kuchi achit?", "I’m feeling good.", -1));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?", -1));
        phrases.add(new Phrase("Yes, I’m coming.", "hәә’ әәnәm.", -1));
        phrases.add(new Phrase("I’m coming.", "әәnәm.", -1));
        phrases.add(new Phrase("Let’s go.", "yoowutis.", -1));
        phrases.add(new Phrase("Come here.", "әnni'nem.", -1));

        // Create a link phraseAdapter, whose data source is a list of objects
        PhraseAdapter phraseAdapter = new PhraseAdapter(PhraseActivity.this, 0, phrases, R.color.category_phrases);

        // Find the view ListView
        ListView listView = findViewById(R.id.phrase_list_view);

        // Set the view to the adapter
        listView.setAdapter(phraseAdapter);
    }
}