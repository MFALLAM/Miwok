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
import com.example.android.miwok.data.Number;

import java.util.List;

public class NumberAdapter extends ArrayAdapter<Number> {

    private static final String LOG_TAG = NumberAdapter.class.getSimpleName();

    public NumberAdapter(@NonNull Context context, int resource, @NonNull List<Number> objects) {
        super(context, 0, objects);
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
        Number currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_textview
        TextView miworkTv = listItemView.findViewById(R.id.miwok_textview);

        // Get the name from the current word object and
        // set this text on the name TextView
        miworkTv.setText(currentWord.getMiwokWord());

        TextView defaultTv = listItemView.findViewById(R.id.default_textview);

        defaultTv.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
