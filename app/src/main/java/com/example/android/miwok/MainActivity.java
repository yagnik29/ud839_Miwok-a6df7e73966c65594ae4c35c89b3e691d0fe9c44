/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clicklistener on the View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        //set a clicklistener on the view
        family.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //Start the new activity
                startActivity(familyIntent);

            }

        });

        //Find the View that shows the Colors category
        TextView color = (TextView) findViewById(R.id.colors);

        //set a clicklistener on the view
        color.setOnClickListener(new View.OnClickListener(){
            //the code in theis method will be executed when the color category is clicked on.
            @Override
            public void onClick(View view){
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //start the new activity
                startActivity(colorIntent);
            }
        });

        //Find the View that shows the Phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //set a clicklistener on the view
        phrases.setOnClickListener(new View.OnClickListener(){
            //the vode in this method will be executed when the phrases category is clicke on.
            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}
