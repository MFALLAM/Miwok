package com.example.android.miwok.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Color;

import java.util.List;

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(@NonNull Context context, int resource, @NonNull List<Color> objects) {
        super(context, 0, objects);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
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
        Color currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_textview);
        // set this text on the name TextView
        // Get the name from the current Color object and
        miwokTextView.setText(currentObject.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView defaultTextView = listItemView.findViewById(R.id.default_textview);
        // set this text on the name TextView
        // Get the name from the current Color object and
        defaultTextView.setText(currentObject.getMiwokDefault());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
