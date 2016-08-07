package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("father", "lutti"));
        words.add(new Word("mother", "otiiko"));
        words.add(new Word("son", "tolookosu"));
        words.add(new Word("daughter", "oyyisa"));
        words.add(new Word("older brother", "massokka"));
        words.add(new Word("younger brother", "temmokka"));
        words.add(new Word("younger brother", "temmokka"));
        words.add(new Word("younger brother", "temmokka"));


        WordAdapter adapter= new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
