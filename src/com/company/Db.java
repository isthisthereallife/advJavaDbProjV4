package com.company;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Db implements databaseEntity {


    Db() {
    }

    static void save(Object object) {

    }

    static Object findOne(String key, String value, Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error reading from path \"" + path + "\"");
            return null;
        }

    /*

        for(Object object :makeArrayListFromPath(path)){
            //kolla om object har en key som matchar key
            try {
                System.out.println("object.getclass = " + object.getClass());
                Field[] a = object.getClass().getDeclaredFields();
                for(Field c : a){
                    System.out.println("c = " + c);
                }
                if (object.getClass().getDeclaredField(key).equals(value))
                    System.out.println("HEJ");
                    return object;
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return o;


    }
    */

    }


    //denna ska returnera en lista av objekt (om det finns något)
    static ArrayList<Object> makeArrayListFromPath(Path currentPath) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        //om den finns
        if (Files.exists(currentPath)) {
            File[] files = new File(String.valueOf(currentPath)).listFiles();

            if (files != null) {
                for(File f : files){
                    objectArrayList.add(Deserializer.read(f.toPath()));
                }
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
