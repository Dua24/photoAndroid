package com.example.photoapp;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 0",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(1,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 1",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(2,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 2",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(3,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 3",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(4,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 4",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(5,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 5",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(6,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 5",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(7,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple 5",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));


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