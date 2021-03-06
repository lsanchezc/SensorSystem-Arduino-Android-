package com.sensorsystem.sensorsystem;

/**
 * Created by Lazaro on 7/26/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 6000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Show the splash screen
        setContentView(R.layout.splash);

        //Create a Timer
        Timer runSplash = new Timer();

        //Task to do when the timer ends
        TimerTask showSplash = new TimerTask() {
            @Override
            public void run() {
                //Close Splash.class
                finish();

                //Start QuoteReaderActivity.class
                Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                startActivity(mainIntent);
            }
        };
        //Start the timer
        runSplash.schedule(showSplash,SPLASH_DISPLAY_LENGTH);
    }
}