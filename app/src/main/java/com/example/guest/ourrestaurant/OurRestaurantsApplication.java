package com.example.guest.ourrestaurant;


import android.app.Application;

import com.firebase.client.Firebase;

public class OurRestaurantsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
