package com.example.nolan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MainActivity extends AppCompatActivity {
    Twitter twitter;
    TextView whatTweet;
    TextView theMood;
    public static String moodOfTwitter;

    public static int happy, romantic, positive, strong, angry, sad, afraid, confused, open;
    TextView textViewInfo;
    GifView gifView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        whatTweet = (TextView) findViewById(R.id.whatTweet);
        theMood = (TextView) findViewById(R.id.theMood);
        Button toSettings = (Button) findViewById(R.id.toSettings);

        toSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, settings.class));
            }
        });

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("1oH0TljZMX2JXVDTPgyPGXQH6")
                .setOAuthConsumerSecret("GaYp0TNZrBdjcKuIiVHZFMJ93aCyKT04lwhj9KDKpITC84Oz5u")
                .setOAuthAccessToken("4870958294-D9cxRtxrb3uyDPhWAL4KYJE8fJhTFXOU19krBX3")
                .setOAuthAccessTokenSecret("nLTKCCvN0AmKBH6Gxb32ZXHrLDRFdzYhkRBSTsKbwUlmm");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
        moodOfTwitter = "Neutral";
        int maxCount;

        int great, glad, thankful, lucky; //happy
        int loving, affectionate, attracted, comforted; //romantic
        int excited, brave, confident, inspired; //positive
        int certain, unique, secure, dynamic; //strong
        int annoyed, upset, irritated, unpleasant; //angry
        int lonely, desperate, unhappy, pained; //sad
        int fearful, terrified, anxious, nervous; //afraid
        int perplexed, skeptical, lost, unsure; //confused
        int understanding, sympathetic, accepting, interested; //open

        //happy
        great = search("great");
        glad = search("glad");
        thankful = search("thankful");
        lucky = search("lucky");
        happy = great + glad + thankful + lucky;

        //romantic
        loving = search("loving");
        affectionate = search("affectionate");
        attracted = search("attracted");
        comforted = search("comforted");
        romantic = loving + affectionate + attracted + comforted;

        //positive
        excited = search("excited");
        brave = search("brave");
        confident = search("confident");
        inspired = search("inspired");
        positive = excited + confident + brave + inspired;

        //strong
        certain = search("certain");
        unique = search("unique");
        secure = search("secure");
        dynamic = search("dynamic");
        strong = certain + unique + secure + dynamic;

        //angry
        annoyed = search("annoyed");
        upset = search("upset");
        irritated = search("irritated");
        unpleasant = search("unpleasant");
        angry = annoyed + upset + irritated + unpleasant;

        //sad
        lonely = search("lonely");
        desperate = search("desperate");
        unhappy = search("unhappy");
        pained = search("pained");
        sad = lonely + unhappy + desperate + pained;

        //afraid
        fearful = search("fearful");
        terrified = search("terrified");
        anxious = search("anxious");
        nervous = search("nervous");
        afraid = fearful + terrified + anxious + nervous;

        //confused
        perplexed = search("perplexed");
        skeptical = search("skeptical");
        lost = search("lost");
        unsure = search("unsure");
        confused = perplexed + skeptical + lost + unsure;

        //open
        understanding = search("understanding");
        sympathetic = search("sympathetic");
        accepting = search("accepting");
        interested = search("interested");
        open = understanding + sympathetic + accepting + interested;

        //maxCount = Math.max(Math.max(happy, positive), Math.max(angry, sad));
        maxCount = Math.max(Math.max(Math.max(Math.max(happy, romantic), Math.max(positive, strong)), Math.max(Math.max(angry, sad), Math.max(afraid, confused))), open);
        Log.d("maxCount", maxCount + "");
        if (maxCount == happy) moodOfTwitter = "Happy";
        else if(maxCount == romantic) moodOfTwitter = "Romantic";
        else if (maxCount == positive) moodOfTwitter = "Positive";
        else if(maxCount == strong) moodOfTwitter = "Strong";
        else if (maxCount == angry) moodOfTwitter = "Angry";
        else if (maxCount == sad) moodOfTwitter = "Sad";
        else if(maxCount == afraid) moodOfTwitter = "Afraid";
        else if(maxCount == confused) moodOfTwitter = "Confused";
        else if(maxCount == open) moodOfTwitter = "Open";
        else moodOfTwitter = "Neutral";


        Log.d("Mood of Twitter", moodOfTwitter + "");

        theMood.setText(moodOfTwitter + "!");

        View view = this.getWindow().getDecorView();

        if(moodOfTwitter == "Happy") view.setBackgroundColor(0xff3498db);
        else if(moodOfTwitter.equals("Romantic")) view.setBackgroundColor(0xff1abc9c);
        else if(moodOfTwitter.equals("Positive")) view.setBackgroundColor(0x2ecc71);
        else if(moodOfTwitter.equals("Strong")) view.setBackgroundColor(0xff34495e);
        else if(moodOfTwitter.equals("Angry")) view.setBackgroundColor(0xffc0392b);
        else if(moodOfTwitter.equals("Sad")) view.setBackgroundColor(0xff95a5a6);
        else if(moodOfTwitter.equals("Afraid")) view.setBackgroundColor(0xffe67e22);
        else if(moodOfTwitter.equals("Confused")) view.setBackgroundColor(0xfff39c12);
        else if(moodOfTwitter.equals("Open")) view.setBackgroundColor(0xff9b59b6);
        else view.setBackgroundColor(0xffe67e22);

    }

    public int search(String toSearch) {

        Query query = new Query(toSearch);
        query.setCount(35);
        query.resultType(Query.ResultType.recent);

        ArrayList<String> seconds = new ArrayList<String>();
        String min = "aa";
        String lastMin = "aa";
        int lastMinFirst = 1;
        int whatSpot = 0;

        try {
            QueryResult result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                min = tweet.getCreatedAt().toString().substring(tweet.getCreatedAt().toString().length() - 14, tweet.getCreatedAt().toString().length() - 12);
                if (lastMinFirst == 1) {
                    lastMin = min;
                    lastMinFirst = 0;
                }
                if (!min.equals(lastMin)) {
                    break;
                } else {
                    seconds.add(tweet.getCreatedAt().toString().substring(tweet.getCreatedAt().toString().length() - 11, tweet.getCreatedAt().toString().length() - 9));
                    lastMin = tweet.getCreatedAt().toString().substring(tweet.getCreatedAt().toString().length() - 14, tweet.getCreatedAt().toString().length() - 12);
                    Log.d("size", String.valueOf("swwwww"));
                }
                whatSpot++;
            }
            //Log.d("count", count(seconds) + "");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return count(seconds);
    }

    public int count(ArrayList<String> times) {
        int[] second = new int[50];
        int num = 61;
        int lastNum = 61;
        int lastNumFirst = 1;
        int whatNum = 1;
        int theCount = 0;
        for(int i = 0; i < times.size(); i++) {
            second[i] = Integer.parseInt(times.get(i));
            num = second[i];
            if(lastNumFirst == 1) {
                lastNum = num;
                lastNumFirst = 0;
            }
            Log.d("values", "num: " + num + " lastNum: " + lastNum);
            if(lastNum != num) {
                whatNum++;
                Log.d("what", whatNum + "");
            }
            if(whatNum == 2) {
                theCount++;
            } else if(whatNum > 2) {
                break;
            }
            lastNum = second[i];
        }
        return theCount;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
