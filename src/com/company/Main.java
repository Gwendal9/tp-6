package com.company;

import java.io.IOException;

public class Main {

    public static void exercice1(int a,int b) {
        Division div1 = new Division();
        System.out.println(div1.division1(a,b));
    }

    public static void exercice2(int a, int b){
        Division div2 = new Division();
        System.out.println(div2.division2(a,b));
    }

    public  static void exercice3(int a, int b) throws IOException{
        Division div3 = new Division();
        System.out.println(div3.division3(a,b));
    }


    public static void main(String[] args){
        exercice1(10,0);
        exercice2(10,0);
        exercice3(10,0);
    }
}
