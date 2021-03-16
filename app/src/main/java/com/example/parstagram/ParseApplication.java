package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("lNf4xzU7xElVP5q2JbDqwz0znCAqLlJkzb2Wws8p")
                .clientKey("bdrudXngFnby7WZ0KgtgvxtHK6V9YwsrxGWJeZ5r")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
