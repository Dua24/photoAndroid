package com.example.photoapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.recyclerview.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(), ViewPhotoActivity.class);
            intent.putExtra("id", gridView.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyJsonParser jsonParser = new MyJsonParser(this);
        JSONArray arr = jsonParser.parseJson();



        gridView = findViewById(R.id.gridview);
        PhotoAdapter adapter = null;
        try {
            adapter = new PhotoAdapter((new PhotoData(arr).generatePhotoData()), getApplicationContext());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onItemClickListener);


    }

}