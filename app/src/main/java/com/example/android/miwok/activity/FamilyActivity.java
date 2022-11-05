package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapter.FamilyAdapter;
import com.example.android.miwok.data.Family;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_family);

        ArrayList<Family> families = new ArrayList();

        families.add(new Family("father", "әpә", R.drawable.family_father, R.raw.family_father));
        families.add(new Family("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        families.add(new Family("son", "angsi", R.drawable.family_son, R.raw.family_son));
        families.add(new Family("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        families.add(new Family("older brother", "taachi",R.drawable.family_older_brother, R.raw.family_older_brother));
        families.add(new Family("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        families.add(new Family("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        families.add(new Family("younger sister", "kolliti",R.drawable.family_younger_sister, R.raw.family_younger_sister));
        families.add(new Family("grandmother", "ama",R.drawable.family_grandmother, R.raw.family_grandmother));
        families.add(new Family("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        // Create a link WordAdapter, whose data source is a list of objects
        FamilyAdapter familyAdapter = new FamilyAdapter(FamilyActivity.this, 0, families, R.color.category_family);

        // Find the view ListView
        ListView listView = findViewById(R.id.activity_family_list_view);

        // Set the view to the adapter
        listView.setAdapter(familyAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Family family = families.get(position);

                // Release the media player if it currently exists because we are about to play another different sound file
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, family.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(onCompletionListener);
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


