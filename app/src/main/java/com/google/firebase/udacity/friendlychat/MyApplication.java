package com.google.firebase.udacity.friendlychat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Raghvendra on 09-03-2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
