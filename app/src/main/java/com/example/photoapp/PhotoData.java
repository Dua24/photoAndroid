package com.example.photoapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class PhotoData  {
    static JSONArray jsar1r;
    public PhotoData(JSONArray jsarr) {
        jsar1r = jsarr;
    }
    public static ArrayList<Photo> generatePhotoData() throws JSONException {
        ArrayList<Photo> photos = new ArrayList<>();

        for (int i = 0; i < jsar1r.length(); i++) {
            JSONObject jsonObject = jsar1r.getJSONObject(i);
            photos.add(new Photo(i,jsonObject.getString("source_photo"),jsonObject.getString("title_photo"),jsonObject.getString("description_photo")));
        }
        return photos;
    }




    public static Photo getPhotoFromId(int id) throws JSONException {
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id)
                return phs.get(i);
        }
        return null;
    }
}