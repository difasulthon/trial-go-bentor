package com.example.trialgobentor.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SessionManager {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    public SessionManager(Context context) {
        prefs = context.getSharedPreferences("AppKey", 0);
        editor = prefs.edit();
        editor.apply();
    }

    public void setLogin(boolean login) {
        editor.putBoolean("login", login);
        editor.commit();
    }

    public boolean getLogin() {
        return prefs.getBoolean("login", false);
    }

    public void setType(String type) {
        editor.putString("type", type);
        editor.commit();
    }

    public String getType() {
        return prefs.getString("type", "");
    }
}
