package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class StarRating extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_rating);

        addListinerOnButtonClick();
    }

    private void addListinerOnButtonClick() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.buttonStarRating);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_LONG).show();
            }
        });



    }
}
