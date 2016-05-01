package com.example.nolan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setings);

        View view = this.getWindow().getDecorView();

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

        Button theValues = (Button) findViewById(R.id.theValues);
        Button theColors = (Button) findViewById(R.id.theColors);

        theValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(settings.this, values.class));
            }
        });

        theColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(settings.this, colors.class));
            }
        });

    }

}
