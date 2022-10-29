package com.example.android.miwok.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.android.miwok.R;
import com.example.android.miwok.data.Family;

import java.util.List;

public class FamilyAdapter extends ArrayAdapter<Family> {

    /**
     * Holds resource ID for tha background color of list item
     */
    private int mColor;

    private static final String LOG_TAG = FamilyAdapter.class.getSimpleName();

    public FamilyAdapter(@NonNull Context context, int resource, @NonNull List<Family> objects, int colorResourceId) {
        super(context, 0, objects);
        mColor = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Checking if the existing View is begin reused, otherwise inflate the view from the layout inflater.
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        // Get the current object at this position
        Family currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView textView = listViewItem.findViewById(R.id.miwok_textview);

        // Get the name from the current word object and
        // set this text on the name TextView
        textView.setText(currentObject.getMiwokTranslation());

        TextView defaultTextView = listViewItem.findViewById(R.id.default_textview);

        // Get the name from the current word object and
        // set this text on the name TextView
        defaultTextView.setText(currentObject.getDefaultTranslation());

        // Set the theme color for the list item
        View textContainer = listViewItem.findViewById(R.id.text_container);

        // Find the color that resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColor);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listViewItem;
    }
}
