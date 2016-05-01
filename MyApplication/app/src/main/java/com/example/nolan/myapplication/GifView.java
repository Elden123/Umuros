//if (m.moodOfTwitter == ("Happy"))
//if (colors.colorChange == ("Romantic"))
//is = getResources().openRawResource(+R.mipmap.turquoise_resized);
           /* else if (colors.colorChange == ("Sad"))
                is = getResources().openRawResource(+R.mipmap.gray_resized);
            else if (colors.colorChange == ("Positive"))
                is = getResources().openRawResource(+R.mipmap.green_resized);
            else if (colors.colorChange == ("Angry"))
                is = getResources().openRawResource(+R.mipmap.red_resized);
            else if (colors.colorChange == ("Strong"))
                is = getResources().openRawResource(+R.mipmap.dark_gray_resized);
            else if (colors.colorChange == ("Afraid"))
                is = getResources().openRawResource(+R.mipmap.carrot_resized);
            else if (colors.colorChange == ("Confused"))
                is = getResources().openRawResource(+R.mipmap.orange_resized);
            else if (colors.colorChange == ("Open"))
                is = getResources().openRawResource(+R.mipmap.purple_resized);
            else is = getResources().openRawResource(+R.mipmap.blue_resized);

        }*/
//mMovie = Movie.decodeStream(is);
package com.example.nolan.myapplication;

import java.io.InputStream;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;

import com.example.nolan.myapplication.R;

public class GifView extends View {
    public Movie mMovie;
    public long movieStart;

    public GifView(Context context) {
        super(context);
        initializeView(+R.mipmap.blue_resized);
    }

    public GifView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeView(+R.mipmap.blue_resized);
    }

    public GifView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initializeView(+R.mipmap.blue_resized);
    }

    private void initializeView(int i) {
//R.drawable.loader - our animated GIF
        InputStream is = getResources().openRawResource(i);
        mMovie = Movie.decodeStream(is);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT);
        super.onDraw(canvas);
        long now = android.os.SystemClock.uptimeMillis();
        if (movieStart == 0) {
            movieStart = now;
        }
        if (mMovie != null) {
            int relTime = (int) ((now - movieStart) % mMovie.duration());
            mMovie.setTime(relTime);
            mMovie.draw(canvas, getWidth() - mMovie.width(), getHeight() - mMovie.height());
            this.invalidate();
        }
    }
    private int gifId;

    public void setGIFResource(int resId) {
        this.gifId = resId;
        initializeView(+R.mipmap.blue_resized);
    }

    public int getGIFResource() {
        return this.gifId;
    }
}