package com.example.nolan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class colors extends AppCompatActivity {
    int angryNum = 0;
    int afraidNum = 0;
    int confusedNum = 0;
    int romanticNum = 0;
    int positiveNum = 0;
    int happyNum = 0;
    int openNum = 0;
    int strongNum = 0;
    int sadNum = 0;
    public static String colorChange = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        View view = this.getWindow().getDecorView();

        MainActivity m = new MainActivity();
        if(m.moodOfTwitter == "Happy") view.setBackgroundColor(0xffe67e22);
        else if(m.moodOfTwitter == "Romantic") view.setBackgroundColor(0xffc0392b);
        else if(m.moodOfTwitter == "Positive") view.setBackgroundColor(0x7f8c8d);
        else if(m.moodOfTwitter == "Strong") view.setBackgroundColor(0xff34495e);
        else if(m.moodOfTwitter == "Angry") view.setBackgroundColor(0xff9b59b6);
        else if(m.moodOfTwitter == "Aad") view.setBackgroundColor(0xff3498db);
        else if(m.moodOfTwitter == "Afraid") view.setBackgroundColor(0xff2ecc71);
        else if(m.moodOfTwitter == "Confused") view.setBackgroundColor(0xff1abc9c);
        else if(m.moodOfTwitter == "Open") view.setBackgroundColor(0xfff39c12);
        else view.setBackgroundColor(0xffe67e22);

        final Button angryBot = (Button) findViewById(R.id.button);
        final Button afraidBot = (Button) findViewById(R.id.button1);
        final Button confusedBot = (Button) findViewById(R.id.button2);
        final Button romanticBot = (Button) findViewById(R.id.button3);
        final Button positiveBot = (Button) findViewById(R.id.button4);
        final Button happyBot = (Button) findViewById(R.id.button5);
        final Button openBot = (Button) findViewById(R.id.button6);
        final Button strongBot = (Button) findViewById(R.id.button7);
        final Button sadBot = (Button) findViewById(R.id.button8);


        if (angryBot != null) angryBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angryNum++;
                if (angryNum == 9) angryNum = 0;
                if (angryNum == 0) {
                    angryBot.setBackgroundResource(R.mipmap.popertranatlineddot);
                    String colorChange = "pomegranate";
                }
                else if (angryNum == 1) {
                    angryBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    String colorChange = "carrot";
                }
                else if (angryNum == 2) {
                    angryBot.setBackgroundResource(R.mipmap.orangelineddot);
                    String colorChange = "orange";
                }
                else if (angryNum == 3) {
                    angryBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    String colorChange = "turquoise";
                }
                else if (angryNum == 4) {
                    angryBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    String colorChange = "emerald";
                }
                else if (angryNum == 5) {
                    angryBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    String colorChange = "peterriver";
                }
                else if (angryNum == 6) {
                    angryBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    String colorChange = "amethyst";
                }
                else if (angryNum == 7) {
                    angryBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    String colorChange = "pomegranate";
                }
                else if (angryNum == 8) {
                    angryBot.setBackgroundResource(R.mipmap.concretelineddot);
                    String colorChange = "concrete";
                }
            }
        });

        afraidBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afraidNum++;
                if (afraidNum == 9) afraidNum = 0;
                if (afraidNum == 8) {
                    afraidBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (afraidNum == 0) {
                    afraidBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (afraidNum == 1) {
                    afraidBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (afraidNum == 2) {
                    afraidBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (afraidNum == 3) {
                    afraidBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (afraidNum == 4) {
                    afraidBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (afraidNum == 5) {
                    afraidBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (afraidNum == 6) {
                    afraidBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (afraidNum == 7) {
                    afraidBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        confusedBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confusedNum++;
                if (confusedNum == 9) confusedNum = 0;
                if (confusedNum == 7) {
                    confusedBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (confusedNum == 8) {
                    confusedBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (confusedNum == 0) {
                    confusedBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (confusedNum == 1) {
                    confusedBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (confusedNum == 2) {
                    confusedBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (confusedNum == 3) {
                    confusedBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (confusedNum == 4) {
                    confusedBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (confusedNum == 5) {
                    confusedBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (confusedNum == 6) {
                    confusedBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        romanticBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                romanticNum++;
                if (romanticNum == 9) romanticNum = 0;
                if (romanticNum == 6) {
                    romanticBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (romanticNum == 7) {
                    romanticBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (romanticNum == 8) {
                    romanticBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (romanticNum == 0) {
                    romanticBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (romanticNum == 1) {
                    romanticBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (romanticNum == 2) {
                    romanticBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (romanticNum == 3) {
                    romanticBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (romanticNum == 4) {
                    romanticBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (romanticNum == 5) {
                    romanticBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        positiveBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positiveNum++;
                if (positiveNum == 9) positiveNum = 0;
                if (positiveNum == 5) {
                    positiveBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (positiveNum == 6) {
                    positiveBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (positiveNum == 7) {
                    positiveBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (positiveNum == 8) {
                    positiveBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (positiveNum == 0) {
                    positiveBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (positiveNum == 1) {
                    positiveBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (positiveNum == 2) {
                    positiveBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (positiveNum == 3) {
                    positiveBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (positiveNum == 4) {
                    positiveBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        happyBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                happyNum++;
                if (happyNum == 9) happyNum = 0;
                if (happyNum == 4) {
                    happyBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (happyNum == 5) {
                    happyBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (happyNum == 6) {
                    happyBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (happyNum == 7) {
                    happyBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (happyNum == 8) {
                    happyBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (happyNum == 0) {
                    happyBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (happyNum == 1) {
                    happyBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (happyNum == 2) {
                    happyBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (happyNum == 3) {
                    happyBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        openBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNum++;
                if (openNum == 9) openNum = 0;
                if (openNum == 3) {
                    openBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (openNum == 4) {
                    openBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (openNum == 5) {
                    openBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (openNum == 6) {
                    openBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (openNum == 7) {
                    openBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (openNum == 8) {
                    openBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (openNum == 0) {
                    openBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (openNum == 1) {
                    openBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (openNum == 2) {
                    openBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        strongBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strongNum++;
                if (strongNum == 9) strongNum = 0;
                if (strongNum == 2) {
                    strongBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (strongNum == 3) {
                    strongBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (strongNum == 4) {
                    strongBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (strongNum == 5) {
                    strongBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (strongNum == 6) {
                    strongBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (strongNum == 7) {
                    strongBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (strongNum == 8) {
                    strongBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (strongNum == 0) {
                    strongBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (strongNum == 1) {
                    strongBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });

        sadBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sadNum++;
                if (sadNum == 9) sadNum = 0;
                if (sadNum == 1) {
                    sadBot.setBackgroundResource(R.mipmap.popertranatlineddot);

                }
                else if (sadNum == 2) {
                    sadBot.setBackgroundResource(R.mipmap.carrotlineddot);
                }
                else if (sadNum == 3) {
                    sadBot.setBackgroundResource(R.mipmap.orangelineddot);
                }
                else if (sadNum == 4) {
                    sadBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                }
                else if (sadNum == 5) {
                    sadBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                }
                else if (sadNum == 6) {
                    sadBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                }
                else if (sadNum == 7) {
                    sadBot.setBackgroundResource(R.mipmap.amethystlineddot);
                }
                else if (sadNum == 8) {
                    sadBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                }
                else if (sadNum == 0) {
                    sadBot.setBackgroundResource(R.mipmap.concretelineddot);
                }
            }
        });
    }

}
