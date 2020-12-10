package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.ask_button);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int[] ballMessageArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8ball","Button Pressed");

                Random randomNumberGeneratorForLeftDice = new Random();
                int number = randomNumberGeneratorForLeftDice.nextInt(5);
                ballDisplay.setImageResource(ballMessageArray[number]);
            }
        });
    }
}
