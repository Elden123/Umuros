package com.example.nolan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        View view = this.getWindow().getDecorView();

        MainActivity m = new MainActivity();
        colors c = new colors();

        if(m.moodOfTwitter == "Happy"){
            if(c.happyColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.happyColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.happyColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.happyColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.happyColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.happyColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.happyColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.happyColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.happyColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Romantic") {
            if(c.romanticColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.romanticColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.romanticColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.romanticColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.romanticColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.romanticColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.romanticColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.romanticColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.romanticColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Positive") {
            if(c.positiveColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.positiveColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.positiveColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.positiveColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.positiveColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.positiveColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.positiveColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.positiveColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.positiveColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Strong") {
            if(c.strongColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.strongColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.strongColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.strongColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.strongColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.strongColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.strongColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.strongColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.strongColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Angry") {
            if(c.angryColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.angryColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.angryColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.angryColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.angryColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.angryColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.angryColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.angryColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.angryColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Sad") {
            if(c.sadColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.sadColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.sadColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.sadColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.sadColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.sadColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.sadColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.sadColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.sadColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Afraid") {
            if(c.afraidColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.afraidColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.afraidColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.afraidColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.afraidColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.afraidColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.afraidColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.afraidColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.afraidColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Confused") {
            if(c.confusedColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.confusedColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.confusedColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.confusedColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.confusedColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.confusedColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.confusedColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.confusedColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.confusedColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Open") {
            if(c.openColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.openColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.openColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.openColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.openColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.openColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.openColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.openColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.openColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }

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

    @Override
    protected void onResume() {
        super.onResume();
        View view = this.getWindow().getDecorView();

        MainActivity m = new MainActivity();
        colors c = new colors();

        if(m.moodOfTwitter == "Happy"){
            if(c.happyColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.happyColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.happyColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.happyColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.happyColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.happyColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.happyColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.happyColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.happyColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Romantic") {
            if(c.romanticColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.romanticColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.romanticColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.romanticColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.romanticColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.romanticColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.romanticColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.romanticColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.romanticColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Positive") {
            if(c.positiveColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.positiveColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.positiveColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.positiveColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.positiveColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.positiveColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.positiveColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.positiveColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.positiveColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Strong") {
            if(c.strongColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.strongColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.strongColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.strongColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.strongColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.strongColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.strongColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.strongColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.strongColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Angry") {
            if(c.angryColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.angryColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.angryColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.angryColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.angryColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.angryColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.angryColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.angryColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.angryColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Sad") {
            if(c.sadColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.sadColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.sadColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.sadColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.sadColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.sadColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.sadColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.sadColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.sadColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Afraid") {
            if(c.afraidColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.afraidColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.afraidColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.afraidColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.afraidColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.afraidColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.afraidColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.afraidColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.afraidColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Confused") {
            if(c.confusedColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if(c.confusedColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            }
            else if(c.confusedColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            }
            else if(c.confusedColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            }
            else if(c.confusedColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            }
            else if(c.confusedColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            }
            else if(c.confusedColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            }
            else if(c.confusedColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            }
            else if(c.confusedColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
        else if(m.moodOfTwitter == "Open") {
            if (c.openColor == "Pomegranate") {
                view.setBackgroundColor(0xffc0392b);
            } else if (c.openColor == "Carrot") {
                view.setBackgroundColor(0xffe67e22);
            } else if (c.openColor == "Orange") {
                view.setBackgroundColor(0xfff39c12);
            } else if (c.openColor == "Turquoise") {
                view.setBackgroundColor(0xff1abc9c);
            } else if (c.openColor == "Emerald") {
                view.setBackgroundColor(0xff2ecc71);
            } else if (c.openColor == "PeterRiver") {
                view.setBackgroundColor(0xff3498db);
            } else if (c.openColor == "Amethyst") {
                view.setBackgroundColor(0xff9b59b6);
            } else if (c.openColor == "WetAsphalt") {
                view.setBackgroundColor(0xff34495e);
            } else if (c.openColor == "Concrete") {
                view.setBackgroundColor(0xff95a5a6);
            }
        }
    }
}
