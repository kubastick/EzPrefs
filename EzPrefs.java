package com.jakubtomana;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class EzPrefs {

    ///Set boolean value by key
    public static void putBoolean(String key,Boolean value,Context context){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(key,value).commit();
    }

    ///Set String value by key
    public static void putString(String key,String value,Context context) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, value).commit();
    }

    ///Set integer value by key
    public static void putInteger(String key,int value,Context context){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key,value).commit();
    }

    ///Get boolean value by key
    public static boolean getBoolean(String key,Context context){
        SharedPreferences preferences =PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return preferences.getBoolean(key,false);
    }

    ///Get int value by key
    public static int getInt(String key,Context context){
        SharedPreferences preferences =PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return preferences.getInt(key,0);
    }

    ///Get String value by key
    public static String getString(String key,Context context){
        SharedPreferences preferences =PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return preferences.getString(key, "");
    }

}
