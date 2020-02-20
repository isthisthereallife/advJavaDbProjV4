package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Menu {
    private static Menu instance = new Menu();
    String menuChoice = "";

    private Menu() {
        do {
            System.out.println("Where go?");
            System.out.println("1. View authors.");
            System.out.println("2. View Books.");
            System.out.println("0. Quit.");
            menuChoice = new Scanner(System.in).nextLine();


        } while (!menuChoice.equals("0"));


    }

    public static Menu getInstance() {
        return instance;
    }
}
