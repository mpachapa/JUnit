package org.example;

public class mathFunc {

    public mathFunc(){    }

    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double c, double d) { return c + d;}

    public double sum(int e, double f) { return e + f; }

    public int sum(int [] arr){
        int sums = 0;
        for (int i = 0; i < arr.length; i++){
            sums += arr[i];
        }
        return sums;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double c, double d) { return c - d;  }

    public int multiply(int a, int b) { return a * b;}

    public double multiply(double e, double f) {
        return e * f;
    }

    public double division(double g, double h) {
        return g / h;
    }

    public double modus(double i, double j) {
        return i % j;
    }

    public void countTo11(int num){
        for (int i = num; i <= 11; i++){
            System.out.println(i);
        }
    }

}
