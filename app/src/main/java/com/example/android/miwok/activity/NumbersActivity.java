package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Number;
import com.example.android.miwok.adapter.NumberAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private final MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Log.v("NumbersActivity", "onCreate Called().!");

        final ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(new Number("Lutti", "One", R.drawable.number_one, R.raw.number_one));
        numbers.add(new Number("otiiko", "Two", R.drawable.number_two, R.raw.number_two));
        numbers.add(new Number("tolookosu", "Three", R.drawable.number_three, R.raw.number_three));
        numbers.add(new Number("oyysia", "Four", R.drawable.number_four, R.raw.number_four));
        numbers.add(new Number("massokka", "Five", R.drawable.number_five, R.raw.number_five));
        numbers.add(new Number("temmokka", "Six", R.drawable.number_six, R.raw.number_six));
        numbers.add(new Number("kenekaku", "Seven", R.drawable.number_seven, R.raw.number_seven));
        numbers.add(new Number("kawinta", "Eight", R.drawable.number_eight, R.raw.number_eight));
        numbers.add(new Number("wo'e", "Nine", R.drawable.number_nine, R.raw.number_nine));
        numbers.add(new Number("na'aacha", "Ten", R.drawable.number_ten, R.raw.number_ten));

        // Create a link WordAdapter, whose data source is a list of objects
        NumberAdapter numbersAdapter = new NumberAdapter(NumbersActivity.this, 0, numbers, R.color.category_numbers);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_numbers_list_view);

        // Set the view to the adapter
        listView.setAdapter(numbersAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the current object at this position
                Number currentObject = numbers.get(position);

                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, currentObject.getAudioResourceId());

                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Regardless of the current state of the media player, release its resources and free up the memory
                        // because we no longer need it. This is memory-efficient.
                        mMediaPlayer.setOnCompletionListener(mCompletionListener);
                    }
                });
            }
        });
    }

    /**
     * Clean up the media player by releasing its resources.
     *
     * @return void
     */
    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("NumbersActivity", "onStart Called().!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("NumbersActivity", "onResume Called().!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("NumbersActivity", "onPause Called().!");
        releaseMediaPlayer();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("NumbersActivity", "onStop Called().!");
        releaseMediaPlayer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("NumbersActivity", "onDestroy Called().!");
    }
}