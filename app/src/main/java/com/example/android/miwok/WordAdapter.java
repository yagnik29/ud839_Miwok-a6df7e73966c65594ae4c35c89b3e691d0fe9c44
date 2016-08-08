package com.example.android.miwok;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yagnik on 28-Jul-16.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * This is our own custom constructor (it does not mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param numbersActivity used to inflate the layout file.
     * @param words           A list of word objects to display in a list
     */

    public WordAdapter(NumbersActivity numbersActivity, ArrayList<Word> words) {
        super(numbersActivity, 0, words);
    }

    public WordAdapter(ColorsActivity colorsActivity, ArrayList<Word> words) {
        super(colorsActivity, 0, words);
    }

    public WordAdapter(FamilyActivity familyActivity, ArrayList<Word> words) {
        super(familyActivity, 0, words);
    }

    public WordAdapter(PhrasesActivity phrasesActivity, ArrayList<Word> words) {
        super(phrasesActivity,0,words);
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
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link words } object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the miwok text view from the current Word object and set this text on the name
        // TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the default text view from the current Word object and set this text on the name
        // TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Return the whole list item layout  ( Containing 2 TextViews)
        // so that it can be shown in the ListView.

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}
