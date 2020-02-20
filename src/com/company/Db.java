package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Db implements databaseEntity {


    Db() {
    }

    static void save(Object object){
        System.out.println(object.toString());
    }

    //denna ska returnera en lista av objekt (om det finns något)
    static ArrayList<Object> makeArrayListFromPath(Path currentPath) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        //om den finns
        if (Files.exists(currentPath)) {
            File[] files = new File(String.valueOf(currentPath)).listFiles();
            if (files != null) {
                objectArrayList.addAll(Arrays.asList(files));
            }
        } else { //skapa path om den inte finns
            System.out.println(currentPath + " does not exist... creating...");
            try {
                Files.createDirectories(currentPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return objectArrayList;
    }
}
