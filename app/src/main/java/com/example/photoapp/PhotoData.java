package com.example.photoapp;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
public class PhotoData  {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();

        Log.d("as", "jsonData");
        photos.add(new Photo(0,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 0",
                "In botany, a tree is a perennial plant with an elongated stem, or trunk, usually supporting branches and leaves. In some usages, the definition of a tree may be narrower, including only woody plants with secondary growth, plants that are usable as lumber or plants above a specified height. In wider definitions, the taller palm"));
        photos.add(new Photo(1,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Ward_Cunningham_-_Commons-1.jpg/255px-Ward_Cunningham_-_Commons-1.jpg",
                "Apple 1",
                "have independently evolved a trunk and branches as a way to tower above other plants to compete for sunlight. The majority of tree species are angiosperms or hardwoods; of the rest, many are gymnosperms or softwoods. Trees tend to be long-lived, some reaching several thousand years old. Trees have b"));
        photos.add(new Photo(2,"https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/401_Gridlock.jpg/375px-401_Gridlock.jpg",
                "Apple 2",
                "A tree typically has many secondary branches supported clear of the ground by the trunk. This trunk typically contains woody tissue for strength, and vascular tissue to carry materials from one part of the tree to another. For most trees it is surrounded by a layer of bark which serves as a protective barrier. Below t"));
        photos.add(new Photo(3,"https://upload.wikimedia.org/wikipedia/commons/2/21/Apple_Watch_%28Space_Grey_42mm%29.png",
                "Apple 3",
                "Above ground, the branches divide into smaller branches and shoots. The shoots typically bear leaves, which capture light energy and convert it into sugars by photosynthesis, providing the food for the tree's growth and development.\n" +
                        "\n" +
                        "Trees usually reproduce using seeds. Flowers and fruit may be present, but some trees, such as conifers, instead have pollen cones and seed cones. Palms, bananas, and bamboos also produce seeds, but tree "));
        photos.add(new Photo(4,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Apple-tv-4k-1st-gen.jpg/300px-Apple-tv-4k-1st-gen.jpg",
                "Apple 4",
                "Trees play a significant role in reducing erosion and moderating the climate. They remove carbon dioxide from the atmosphere and store large quantities of carbon in their tissues. Trees and forests provide a habitat for many species of animals and plants. Tropical rainforests are among the mos"));
        photos.add(new Photo(5,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Mac_Mini_M1_chip.jpg/330px-Mac_Mini_M1_chip.jpg",
                "Apple 5",
                "provide shade and shelter, timber for construction, fuel for cooking and heating, and fruit for food as well as having many other uses. In parts of the world, forests are shrinking as trees are cleared to increase the amount of land"));
        photos.add(new Photo(6,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/2020_Audi_A3_Sport_30_TFSi_Saloon_1.0.jpg/420px-2020_Audi_A3_Sport_30_TFSi_Saloon_1.0.jpg",
                "Apple 5",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(7,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Mercury_in_true_color.jpg/330px-Mercury_in_true_color.jpg",
                "Apple 5",
                "Although \"tree\" is a term of common parlance, there is no universally recognised precise definition of what a tree is, either botanically or in common language.[1][2] In its broadest sense, a tree is any plant with t"));


        return photos;
    }



    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id)
                return phs.get(i);
        }
        return null;
    }
}