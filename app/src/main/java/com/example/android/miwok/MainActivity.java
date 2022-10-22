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

        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Numbers clicked", Toast.LENGTH_LONG).show();
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

    }

    public void openFamilyMembersList(View view) {
        Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(intent);
    }

    public void openColorsList(View view) {
        Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(intent);
    }

    public void openPhrasesList(View view) {
        Intent intent = new Intent(MainActivity.this, PhraseActivity.class);
        startActivity(intent);
    }

}
