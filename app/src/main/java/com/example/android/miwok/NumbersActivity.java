package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.word.Word;
import com.example.android.miwok.word.WordAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Lutti", "One"));
        words.add(new Word("otiiko", "Two"));
        words.add(new Word("tolookosu", "Three"));
        words.add(new Word("oyysia", "Four"));
        words.add(new Word("massokka", "Five"));
        words.add(new Word("temmokka", "Six"));
        words.add(new Word("kenekaku", "Seven"));
        words.add(new Word("kawinta", "Eight"));
        words.add(new Word("wo'e", "Nine"));
        words.add(new Word("na'aacha", "Ten"));

        // Create a link WordAdapter, whose data source is a list of objects
        WordAdapter wordAdapter = new WordAdapter(NumbersActivity.this, 0, words);

        //
        ListView listView = findViewById(R.id.activity_numbers_list_view);

        //
        listView.setAdapter(wordAdapter);

    }
}