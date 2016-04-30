package com.example.nolan.myapplication;

import android.app.DownloadManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import android.app.DownloadManager.*;

public class MainActivity extends AppCompatActivity {
    Twitter twitter;
    TextView whatTweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        whatTweet = (TextView) findViewById(R.id.whatTweet);
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("1oH0TljZMX2JXVDTPgyPGXQH6")
                .setOAuthConsumerSecret("GaYp0TNZrBdjcKuIiVHZFMJ93aCyKT04lwhj9KDKpITC84Oz5u")
                .setOAuthAccessToken("4870958294-D9cxRtxrb3uyDPhWAL4KYJE8fJhTFXOU19krBX3")
                .setOAuthAccessTokenSecret("nLTKCCvN0AmKBH6Gxb32ZXHrLDRFdzYhkRBSTsKbwUlmm");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
        String moodOfTwitter = "neutral";
        int maxCount;
        int happy, romantic, positive, strong, angry, sad, afraid, confused, open;

        int great, glad, thankful, lucky; //happy
        int loving, affectionate, attracted, comforted; //romantic
        int excited, brave, confident, inspired; //positive
        int certain, unique, secure, dynamic; //strong
        int annoyed, upset, irritated, unpleasant; //angry
        int lonely, desperate, unhappy, pained; //sad
        int fearful, terrified, anxious, nervous; //afraid
        int perplexed, skeptical, lost, unsure; //confused
        int understanding, sympathetic, accepting, interested;

        //happy
        great = search("great");
        glad = search("glad");
        //thankful = search("thankful");
        //lucky = search("lucky");
        happy = great + glad;

        //romantic
        /*loving = search("loving");
        affectionate = search("affectionate");
        attracted = search("attracted");
        comforted = search("comforted");
        romantic = loving + affectionate + attracted + comforted;*/

        //positive
        excited = search("excited");
        //brave = search("brave");
        confident = search("confident");
        //inspired = search("inspired");
        positive = excited + confident;

        //strong
        /*certain = search("certain");
        unique = search("unique");
        secure = search("secure");
        dynamic = search("dynamic");
        strong = certain + unique + secure + dynamic;*/

        //angry
        annoyed = search("annoyed");
        upset = search("upset");
        //irritated = search("irritated");
        //unpleasant = search("unpleasant");
        angry = annoyed + upset;

        //sad
        lonely = search("lonely");
        //desperate = search("desperate");
        unhappy = search("unhappy");
        //pained = search("pained");
        sad = lonely + unhappy;

        //afraid
        /*fearful = search("fearful");
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
        open = understanding + sympathetic + accepting + interested;*/

        /*for(int i = 0; i < seconds.size(); i++) {
            Log.d("seconds", seconds.get(i));
        }*/

        maxCount = Math.max(Math.max(happy, positive), Math.max(angry, sad));
        //maxCount = Math.max(Math.max(Math.max(Math.max(happy, romantic), Math.max(positive, strong)), Math.max(Math.max(angry, sad), Math.max(afraid, confused))), open);
        Log.d("maxCount", maxCount + "");
        if(maxCount == happy) moodOfTwitter = "happy";
        //else if(maxCount == romantic) moodOfTwitter = "romantic";
        else if(maxCount == positive) moodOfTwitter = "positive";
        //else if(maxCount == strong) moodOfTwitter = "strong";
        else if(maxCount == angry) moodOfTwitter = "angry";
        else if(maxCount == sad) moodOfTwitter = "sad";
        //else if(maxCount == afraid) moodOfTwitter = "afraid";
        //else if(maxCount == confused) moodOfTwitter = "confused";
        //else if(maxCount == open) moodOfTwitter = "open";
        else moodOfTwitter = "neutral";

        Log.d("Mood of Twitter", moodOfTwitter + "");

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
                    whatTweet.setText("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
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
