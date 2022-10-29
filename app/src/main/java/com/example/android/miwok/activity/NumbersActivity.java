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

        numbers.add(new Number("Lutti", "One", R.drawable.number_one));
        numbers.add(new Number("otiiko", "Two", R.drawable.number_two));
        numbers.add(new Number("tolookosu", "Three", R.drawable.number_three));
        numbers.add(new Number("oyysia", "Four", R.drawable.number_four));
        numbers.add(new Number("massokka", "Five", R.drawable.number_five));
        numbers.add(new Number("temmokka", "Six", R.drawable.number_six));
        numbers.add(new Number("kenekaku", "Seven", R.drawable.number_seven));
        numbers.add(new Number("kawinta", "Eight", R.drawable.number_eight));
        numbers.add(new Number("wo'e", "Nine", R.drawable.number_nine));
        numbers.add(new Number("na'aacha", "Ten", R.drawable.number_ten));

        // Create a link WordAdapter, whose data source is a list of objects
        NumberAdapter numbersAdapter = new NumberAdapter(NumbersActivity.this, 0, numbers, R.color.category_numbers);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_numbers_list_view);

        // Set the view to the adapter
        listView.setAdapter(numbersAdapter);

    }
}