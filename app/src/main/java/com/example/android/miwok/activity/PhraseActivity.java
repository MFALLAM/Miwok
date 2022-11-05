package com.example.android.miwok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapter.PhraseAdapter;
import com.example.android.miwok.data.Phrase;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    /**
     * Holds media player
     */
    MediaPlayer mMediaPlayer;

    private final MediaPlayer.OnCompletionListener onCompletionListener = mediaPlayer -> releaseMediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        ArrayList<Phrase> phrases = new ArrayList<>();

        phrases.add(new Phrase("minto wuksus", "Where are you going?", -1, R.raw.phrase_where_are_you_going));
        phrases.add(new Phrase("tinnә oyaase'nә", "What is your name?", -1, R.raw.phrase_what_is_your_name));
        phrases.add(new Phrase("oyaaset", "My name is..", -1, R.raw.phrase_my_name_is));
        phrases.add(new Phrase("michәksәs?", "How are you feeling?", -1, R.raw.phrase_how_are_you_feeling));
        phrases.add(new Phrase("kuchi achit?", "I’m feeling good.", -1, R.raw.phrase_im_feeling_good));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?", -1, R.raw.phrase_are_you_coming));
        phrases.add(new Phrase("Yes, I’m coming.", "hәә’ әәnәm.", -1, R.raw.phrase_im_coming));
        phrases.add(new Phrase("I’m coming.", "әәnәm.", -1, R.raw.phrase_yes_im_coming));
        phrases.add(new Phrase("Let’s go.", "yoowutis.", -1, R.raw.phrase_lets_go));
        phrases.add(new Phrase("Come here.", "әnni'nem.", -1, R.raw.phrase_come_here));

        // Create a link phraseAdapter, whose data source is a list of objects
        PhraseAdapter phraseAdapter = new PhraseAdapter(PhraseActivity.this, 0, phrases, R.color.category_phrases);

        // Find the view ListView
        ListView listView = findViewById(R.id.phrase_list_view);

        // Set the view to the adapter
        listView.setAdapter(phraseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Phrase phrase = phrases.get(position);
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(PhraseActivity.this, phrase.getAudioSourceId());

                // Starting media player
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