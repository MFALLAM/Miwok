package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.miwok.activity.ColorsActivity;
import com.example.android.miwok.activity.FamilyActivity;
import com.example.android.miwok.activity.NumbersActivity;
import com.example.android.miwok.activity.PhraseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("MainActivity", "onCreate Called().!");
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
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Setting click listener on family textview
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Setting click listener on colors textview
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // Setting click phrases on family textview
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phraseIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "onStart Called().!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "onResume Called().!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "onPause Called().!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "onStop Called().!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "onDestroy Called().!");
    }
}
