package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class ReadFromDisk {
    public static Object read(Path path) {

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error reading from path \"" + path + "\"");
            return null;
        }
    }
}