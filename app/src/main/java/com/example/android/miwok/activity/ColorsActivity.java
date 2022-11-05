package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Color;
import com.example.android.miwok.adapter.ColorAdapter;
import com.example.android.miwok.data.Number;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private final MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(new Color("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colors.add(new Color("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colors.add(new Color("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Color("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Color("black", "kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new Color("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        colors.add(new Color("dusty yellow ", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new Color("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        // Create a link WordAdapter, whose data source is a list of objects
        ColorAdapter colorAdapter = new ColorAdapter(ColorsActivity.this, 0, colors, R.color.category_colors);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_colors_list_view);

        // Set the view to the adapter
        listView.setAdapter(colorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Getting the position of the color
                Color currentObject = colors.get(position);

                // Creating the MediaPlayer object
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, currentObject.getAudioResourceId());

                // Starting the Media player
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // Regardless of the current state of the media player, release its resources and free up the memory
                        // because we no longer need it. This is memory-efficient.
                        mediaPlayer.setOnCompletionListener(onCompletionListener);
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
}