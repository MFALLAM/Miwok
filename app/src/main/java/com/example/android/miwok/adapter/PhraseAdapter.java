package com.example.android.miwok.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.miwok.data.Phrase;

import java.util.List;

public class PhraseAdapter extends ArrayAdapter<Phrase> {
    public PhraseAdapter(@NonNull Context context, int resource, @NonNull List<Phrase> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
