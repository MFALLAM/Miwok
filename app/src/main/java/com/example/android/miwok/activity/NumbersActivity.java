package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Number;
import com.example.android.miwok.adapter.NumberAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(new Number("Lutti", "One"));
        numbers.add(new Number("otiiko", "Two"));
        numbers.add(new Number("tolookosu", "Three"));
        numbers.add(new Number("oyysia", "Four"));
        numbers.add(new Number("massokka", "Five"));
        numbers.add(new Number("temmokka", "Six"));
        numbers.add(new Number("kenekaku", "Seven"));
        numbers.add(new Number("kawinta", "Eight"));
        numbers.add(new Number("wo'e", "Nine"));
        numbers.add(new Number("na'aacha", "Ten"));

        // Create a link WordAdapter, whose data source is a list of objects
        NumberAdapter wordAdapter = new NumberAdapter(NumbersActivity.this, 0, numbers);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_numbers_list_view);

        // Set the view to the adapter
        listView.setAdapter(wordAdapter);

    }
}