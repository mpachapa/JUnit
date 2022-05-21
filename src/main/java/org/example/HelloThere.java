package org.example;

import java.util.Scanner;

public class HelloThere {
    public static String globalName;
    public static void main(String [] args){
//        System.out.println("Greetings! Please tell me your name");
//        String name = getName();
        System.out.println("Enter your name again");
        setGlobalName();
        System.out.println("Hello " + globalName);
        System.out.println(globalName);
    }

    public static String getName(){
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        return Name;
    }

    public static void setGlobalName() {
        Scanner scan = new Scanner(System.in);
        globalName = scan.nextLine();
    }
}
