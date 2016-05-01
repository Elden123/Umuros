package com.example.nolan.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
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
    static String angryColor = "Pomegranate";
    static String afraidColor = "Carrot";
    static String confusedColor = "Orange";
    static String romanticColor = "Turquoise";
    static String positiveColor = "Emerald";
    static String happyColor = "PeterRiver";
    static String openColor = "Amethyst";
    static String strongColor = "WetAsphalt";
    static String sadColor = "Concrete";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        View view = this.getWindow().getDecorView();

        MainActivity m = new MainActivity();
        if(m.moodOfTwitter == "Happy"){
            if(happyColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(happyColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(happyColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(happyColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(happyColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(happyColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(happyColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(happyColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(happyColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Romantic") {
            if(romanticColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(romanticColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(romanticColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(romanticColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(romanticColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(romanticColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(romanticColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(romanticColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(romanticColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Positive") {
            if(positiveColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(positiveColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(positiveColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(positiveColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(positiveColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(positiveColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(positiveColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(positiveColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(positiveColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Strong") {
            if(strongColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(strongColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(strongColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(strongColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(strongColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(strongColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(strongColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(strongColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(strongColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Angry") {
            if(angryColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(angryColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(angryColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(angryColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(angryColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(angryColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(angryColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(angryColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(angryColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Sad") {
            if(sadColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(sadColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(sadColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(sadColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(sadColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(sadColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(sadColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(sadColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(sadColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Afraid") {
            if(afraidColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(afraidColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(afraidColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(afraidColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(afraidColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(afraidColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(afraidColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(afraidColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(afraidColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Confused") {
            if(confusedColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(confusedColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(confusedColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(confusedColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(confusedColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(confusedColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(confusedColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(confusedColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(confusedColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Open") {
            if(openColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(openColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(openColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(openColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(openColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(openColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(openColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(openColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(openColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }



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
                    angryColor = "Pomegranate";

                }
                else if (angryNum == 1) {
                    angryBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    angryColor = "Carrot";
                }
                else if (angryNum == 2) {
                    angryBot.setBackgroundResource(R.mipmap.orangelineddot);
                    angryColor = "Orange";
                }
                else if (angryNum == 3) {
                    angryBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    angryColor = "Turquoise";
                }
                else if (angryNum == 4) {
                    angryBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    angryColor = "Emerald";
                }
                else if (angryNum == 5) {
                    angryBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    angryColor = "PeterRiver";
                }
                else if (angryNum == 6) {
                    angryBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    angryColor = "Amethyst";
                }
                else if (angryNum == 7) {
                    angryBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    angryColor = "WetAsphalt";
                }
                else if (angryNum == 8) {
                    angryBot.setBackgroundResource(R.mipmap.concretelineddot);
                    angryColor = "Concrete";
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
                    afraidColor = "Pomegranate";

                }
                else if (afraidNum == 0) {
                    afraidBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    afraidColor = "Carrot";
                }
                else if (afraidNum == 1) {
                    afraidBot.setBackgroundResource(R.mipmap.orangelineddot);
                    afraidColor = "Orange";
                }
                else if (afraidNum == 2) {
                    afraidBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    afraidColor = "Turquoise";
                }
                else if (afraidNum == 3) {
                    afraidBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    afraidColor = "Emerald";
                }
                else if (afraidNum == 4) {
                    afraidBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    afraidColor = "PeterRiver";
                }
                else if (afraidNum == 5) {
                    afraidBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    afraidColor = "Amethyst";
                }
                else if (afraidNum == 6) {
                    afraidBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    afraidColor = "WetAsphalt";
                }
                else if (afraidNum == 7) {
                    afraidBot.setBackgroundResource(R.mipmap.concretelineddot);
                    afraidColor = "Concrete";
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
                    confusedColor = "Pomegranate";

                }
                else if (confusedNum == 8) {
                    confusedBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    confusedColor = "Carrot";
                }
                else if (confusedNum == 0) {
                    confusedBot.setBackgroundResource(R.mipmap.orangelineddot);
                    confusedColor = "Orange";
                }
                else if (confusedNum == 1) {
                    confusedBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    confusedColor = "Turquoise";
                }
                else if (confusedNum == 2) {
                    confusedBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    confusedColor = "Emerald";
                }
                else if (confusedNum == 3) {
                    confusedBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    confusedColor = "PeterRiver";
                }
                else if (confusedNum == 4) {
                    confusedBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    confusedColor = "Amethyst";
                }
                else if (confusedNum == 5) {
                    confusedBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    confusedColor = "WetAsphalt";
                }
                else if (confusedNum == 6) {
                    confusedBot.setBackgroundResource(R.mipmap.concretelineddot);
                    confusedColor = "Concrete";
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
                    romanticColor = "Pomegranate";

                }
                else if (romanticNum == 7) {
                    romanticBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    romanticColor = "Carrot";
                }
                else if (romanticNum == 8) {
                    romanticBot.setBackgroundResource(R.mipmap.orangelineddot);
                    romanticColor = "Orange";
                }
                else if (romanticNum == 0) {
                    romanticBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    romanticColor = "Turquoise";
                }
                else if (romanticNum == 1) {
                    romanticBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    romanticColor = "Emerald";
                }
                else if (romanticNum == 2) {
                    romanticBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    romanticColor = "PeterRiver";
                }
                else if (romanticNum == 3) {
                    romanticBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    romanticColor = "Amethyst";
                }
                else if (romanticNum == 4) {
                    romanticBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    romanticColor = "WetAsphalt";
                }
                else if (romanticNum == 5) {
                    romanticBot.setBackgroundResource(R.mipmap.concretelineddot);
                    romanticColor = "Concrete";
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
                    positiveColor = "Pomegranate";

                }
                else if (positiveNum == 6) {
                    positiveBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    positiveColor = "Carrot";
                }
                else if (positiveNum == 7) {
                    positiveBot.setBackgroundResource(R.mipmap.orangelineddot);
                    positiveColor = "Orange";
                }
                else if (positiveNum == 8) {
                    positiveBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    positiveColor = "Turquoise";
                }
                else if (positiveNum == 0) {
                    positiveBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    positiveColor = "Emerald";
                }
                else if (positiveNum == 1) {
                    positiveBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    positiveColor = "PeterRiver";
                }
                else if (positiveNum == 2) {
                    positiveBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    positiveColor = "Amethyst";
                }
                else if (positiveNum == 3) {
                    positiveBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    positiveColor = "WetAsphalt";
                }
                else if (positiveNum == 4) {
                    positiveBot.setBackgroundResource(R.mipmap.concretelineddot);
                    positiveColor = "Concrete";
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
                    happyColor = "Pomegranate";

                }
                else if (happyNum == 5) {
                    happyBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    happyColor = "Carrot";
                }
                else if (happyNum == 6) {
                    happyBot.setBackgroundResource(R.mipmap.orangelineddot);
                    happyColor = "Orange";
                }
                else if (happyNum == 7) {
                    happyBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    happyColor = "Turquoise";
                }
                else if (happyNum == 8) {
                    happyBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    happyColor = "Emerald";
                }
                else if (happyNum == 0) {
                    happyBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    happyColor = "PeterRiver";
                }
                else if (happyNum == 1) {
                    happyBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    happyColor = "Amethyst";
                }
                else if (happyNum == 2) {
                    happyBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    happyColor = "WetAsphalt";
                }
                else if (happyNum == 3) {
                    happyBot.setBackgroundResource(R.mipmap.concretelineddot);
                    happyColor = "Concrete";
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
                    openColor = "Pomegranate";

                }
                else if (openNum == 4) {
                    openBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    openColor = "Carrot";
                }
                else if (openNum == 5) {
                    openBot.setBackgroundResource(R.mipmap.orangelineddot);
                    openColor = "Orange";
                }
                else if (openNum == 6) {
                    openBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    openColor = "Turquoise";
                }
                else if (openNum == 7) {
                    openBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    openColor = "Emerald";
                }
                else if (openNum == 8) {
                    openBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    openColor = "PeterRiver";
                }
                else if (openNum == 0) {
                    openBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    openColor = "Amethyst";
                }
                else if (openNum == 1) {
                    openBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    openColor = "WetAsphalt";
                }
                else if (openNum == 2) {
                    openBot.setBackgroundResource(R.mipmap.concretelineddot);
                    openColor = "Concrete";
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
                    strongColor = "Pomegranate";

                }
                else if (strongNum == 3) {
                    strongBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    strongColor = "Carrot";
                }
                else if (strongNum == 4) {
                    strongBot.setBackgroundResource(R.mipmap.orangelineddot);
                    strongColor = "Orange";
                }
                else if (strongNum == 5) {
                    strongBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    strongColor = "Turquoise";
                }
                else if (strongNum == 6) {
                    strongBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    strongColor = "Emerald";
                }
                else if (strongNum == 7) {
                    strongBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    strongColor = "PeterRiver";
                }
                else if (strongNum == 8) {
                    strongBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    strongColor = "Amethyst";
                }
                else if (strongNum == 0) {
                    strongBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    strongColor = "WetAsphalt";
                }
                else if (strongNum == 1) {
                    strongBot.setBackgroundResource(R.mipmap.concretelineddot);
                    strongColor = "Concrete";
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
                    sadColor = "Pomegranate";

                }
                else if (sadNum == 2) {
                    sadBot.setBackgroundResource(R.mipmap.carrotlineddot);
                    sadColor = "Carrot";
                }
                else if (sadNum == 3) {
                    sadBot.setBackgroundResource(R.mipmap.orangelineddot);
                    sadColor = "Orange";
                }
                else if (sadNum == 4) {
                    sadBot.setBackgroundResource(R.mipmap.turquoiselineddot);
                    sadColor = "Turquoise";
                }
                else if (sadNum == 5) {
                    sadBot.setBackgroundResource(R.mipmap.emeraldlineddot);
                    sadColor = "Emerald";
                }
                else if (sadNum == 6) {
                    sadBot.setBackgroundResource(R.mipmap.peterriverlineddot);
                    sadColor = "PeterRiver";
                }
                else if (sadNum == 7) {
                    sadBot.setBackgroundResource(R.mipmap.amethystlineddot);
                    sadColor = "Amethyst";
                }
                else if (sadNum == 8) {
                    sadBot.setBackgroundResource(R.mipmap.wetasphaltlineddot);
                    sadColor = "WetAsphalt";
                }
                else if (sadNum == 0) {
                    sadBot.setBackgroundResource(R.mipmap.concretelineddot);
                    sadColor = "Concrete";
                }
            }
        });
    }

}
