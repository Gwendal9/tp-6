package com.company;

import java.io.IOException;

public class Division {
    int a,b;

    public double division1(int a, int b){
        return a/b;
    }

    public double division2(int a, int b){
        double resultat = 0;
        try{
            resultat = a / b;
        } catch (Exception e) {
            System.out.println("non divisible par 0");
        }
        return resultat;
    }

    public double division3(int a, int b) throws IOException{
        try{
            return (a / b;
        } catch (ArithmeticException e) {
            throw new IOException();
        }

    }

}
