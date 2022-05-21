package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Let's write a story about a superhero.");
        Superhero supers = new Superhero();
        supers.setName();
        supers.setPower();
        supers.story();

        Superhero super2 = new Superhero("Spider-Man","Web Spinning");
        super2.story();
    }
}