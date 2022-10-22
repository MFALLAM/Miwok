package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbersTextView = findViewById(R.id.numbers_textview);
        TextView familyTextView = findViewById(R.id.family_textview);
        TextView colorsTextView = findViewById(R.id.colors_textview);
        TextView phrasesTextView = findViewById(R.id.phrases_textview);

        // Setting click listener on numbers textview
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Numbers clicked", Toast.LENGTH_LONG).show();
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Setting click listener on family textview
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Family clicked", Toast.LENGTH_LONG).show();
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Setting click listener on colors textview
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Colors clicked", Toast.LENGTH_LONG).show();
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // Setting click phrases on family textview
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Phrases clicked", Toast.LENGTH_LONG).show();
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phraseIntent);
            }
        });

    }
}
