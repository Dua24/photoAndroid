package com.example.photoapp;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

public class MyJsonParser {
    private Context mContext;

    public MyJsonParser(Context context) {
        mContext = context;
    }

    public JSONArray parseJson() {
        JSONArray jsonArray = null;
        try {
            InputStream is = mContext.getAssets().open("dataphoto.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            jsonArray = new JSONArray(json);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        return jsonArray;
    }

}
