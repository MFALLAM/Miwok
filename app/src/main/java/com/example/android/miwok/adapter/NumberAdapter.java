package com.example.android.miwok.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Number;

import java.util.List;

public class NumberAdapter extends ArrayAdapter<Number> {

    /**
     * Holds resource ID for tha background color of list item
     */
    private int mColor;

    private static final String LOG_TAG = NumberAdapter.class.getSimpleName();

    public NumberAdapter(@NonNull Context context, int resource, @NonNull List<Number> objects, int colorsResourceId) {
        super(context, 0, objects);
        mColor = colorsResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Checking if the existing view is begin reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the current object at this position
        Number currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView miworkTv = listItemView.findViewById(R.id.miwok_textview);

        // Get the name from the current word object and
        // set this text on the name TextView
        miworkTv.setText(currentObject.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView defaultTv = listItemView.findViewById(R.id.default_textview);

        // Get the name from the current word object and
        // set this text on the name TextView
        defaultTv.setText(currentObject.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.miwok_image);

        if (currentObject.hasImage()) {
            // Set the image view to the image resource specified in the current object
            imageView.setImageResource(currentObject.getMiwiokImage());

            // Show image and set visibility to VISIBLE
            imageView.setVisibility(View.VISIBLE);
        } else {
            // hide image and set visibility to GONE
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColor);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

//        listItemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "You click on position:" + position, Toast.LENGTH_SHORT).show();
//                mMediaPlayer = MediaPlayer.create(getContext(), currentObject.getAudioResourceId());
//                mMediaPlayer.start();
//            }
//        });

        return listItemView;
    }
}
