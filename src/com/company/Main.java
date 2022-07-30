package com.company;

import org.jetbrains.annotations.Contract;

public class Main {


    public static void main(String[] args) {
        boolean result = contains(86, 12, 25, 64, 35, 86, 5, 26, 54, 3, 6);
        System.out.println(result);
    }

    static boolean contains(int a, int... varargs) {
    int k = 0;
        for ( int d : varargs) {
            if (d==a) {
            k=d;
                if (k>0) {return true;}
            }
        }
            return false;
    }

}


