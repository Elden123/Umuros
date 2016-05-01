package com.example.nolan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.nolan.myapplication.MainActivity;

public class values extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlaues);

        View view = this.getWindow().getDecorView();
        int total = MainActivity.happy + MainActivity.sad + MainActivity.romantic + MainActivity.positive + MainActivity.strong + MainActivity.angry + MainActivity.afraid + MainActivity.confused + MainActivity.open;
        int happyPer = (int) ((MainActivity.happy / (double)total) * 100);
        int sadPer = (int) ((MainActivity.sad / (double)total) * 100);
        int romanticPer = (int) ((MainActivity.romantic / (double)total) * 100);
        int positivePer = (int) ((MainActivity.positive / (double)total) * 100);
        int strongPer = (int) ((MainActivity.strong / (double)total) * 100);
        int angryPer = (int) ((MainActivity.angry / (double)total) * 100);
        int afraidPer = (int) ((MainActivity.afraid / (double)total) * 100);
        int confusedPer = (int) ((MainActivity.confused / (double)total) * 100);
        int openPer =  (100 - (happyPer + sadPer + romanticPer + positivePer + strongPer + angryPer + afraidPer + confusedPer));

        TextView happyPerText = (TextView) findViewById(R.id.happyPer);
        TextView sadPerText = (TextView) findViewById(R.id.sadPer);
        TextView romanticPerText = (TextView) findViewById(R.id.romanticPer);
        TextView positivePerText = (TextView) findViewById(R.id.positivePer);
        TextView strongPerText = (TextView) findViewById(R.id.strongPer);
        TextView angryPerText = (TextView) findViewById(R.id.angryPer);
        TextView afraidPerText = (TextView) findViewById(R.id.afraidPer);
        TextView confusedPerText = (TextView) findViewById(R.id.confusePer);
        TextView openPerText = (TextView) findViewById(R.id.openPer);

        happyPerText.setText(happyPer + "%");
        sadPerText.setText(sadPer + "%");
        romanticPerText.setText(romanticPer + "%");
        positivePerText.setText(positivePer + "%");
        strongPerText.setText(strongPer + "%");
        angryPerText.setText(angryPer + "%");
        afraidPerText.setText(afraidPer + "%");
        confusedPerText.setText(confusedPer + "%");
        openPerText.setText(openPer + "%");

        MainActivity m = new MainActivity();
        if(m.moodOfTwitter == "Happy") view.setBackgroundColor(0xff3498db);
        else if(m.moodOfTwitter == ("Romantic")) view.setBackgroundColor(0xff1abc9c);
        else if(m.moodOfTwitter == ("Positive")) view.setBackgroundColor(0x2ecc71);
        else if(m.moodOfTwitter == ("Strong")) view.setBackgroundColor(0xff34495e);
        else if(m.moodOfTwitter == ("Angry")) view.setBackgroundColor(0xffc0392b);
        else if(m.moodOfTwitter == ("Sad")) view.setBackgroundColor(0xff95a5a6);
        else if(m.moodOfTwitter == ("Afraid")) view.setBackgroundColor(0xffe67e22);
        else if(m.moodOfTwitter == ("Confused")) view.setBackgroundColor(0xfff39c12);
        else if(m.moodOfTwitter == ("Open")) view.setBackgroundColor(0xff9b59b6);
        else view.setBackgroundColor(0xffe67e22);
    }

}
