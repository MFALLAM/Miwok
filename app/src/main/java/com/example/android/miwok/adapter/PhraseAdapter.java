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
import com.example.android.miwok.data.Phrase;

import java.util.List;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    /**
     * Holds resource ID for tha background color of list item
     */
    private int mColor;

    private static final String LOG_TAG = PhraseAdapter.class.getSimpleName();

    public PhraseAdapter(@NonNull Context context, int resource, @NonNull List<Phrase> objects, int colorResourceId) {
        super(context, 0, objects);
        mColor = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Checking if the existing view is begin reused, otherwise inflate the view.
        // if null inflate the layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        /**
         * Get the {@link Colors} object located at this position in the list
         */
        Phrase currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_textview);

        // set this text on the name TextView
        // Get the name from the current Color object and
        miwokTextView.setText(currentObject.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView defaultTextView = listItemView.findViewById(R.id.default_textview);

        // set this text on the name TextView
        // Get the name from the current Color object and
        defaultTextView.setText(currentObject.getDefaultTranslation());

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

        // set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
