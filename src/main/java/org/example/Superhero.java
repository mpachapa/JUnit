package org.example;

import java.util.Scanner;

public class Superhero {
    private String name;
    private String power;
    private Scanner scanner = new Scanner(System.in);

    public Superhero(){
        this.name = "";
        this.power = "";
    }

    public Superhero(String pName, String pPower){
        this.name = pName;
        this.power = pPower;
    }

    public void story(){
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + this.getName() + "," + " who had the power of " + this.getPower() + ".");
        System.out.println("As they grew older, " + this.getName() + " saw that the world needed them.");
        System.out.println(this.getName() + " used their ability to " +  this.getPower() + " to save the world.");
    }

    public void setName(){
        System.out.println("What is your name?");
        this.name = scanner.nextLine();
    }

    public void setPower(){
        System.out.println("What is your power?");
        this.power = scanner.nextLine();
    }


    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }
}
