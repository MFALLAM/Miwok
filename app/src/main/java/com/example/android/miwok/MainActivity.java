package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    public void openNumberList(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
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
