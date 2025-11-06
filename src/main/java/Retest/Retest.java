package Retest;


import java.util.HashMap;
import java.util.Scanner;

public class Retest {
    public static void main(String[] args) {
        //Java program to store and count the string array input using Hashmap
        int num = 121;
        boolean result = true;
        if(num <= 1)
            result = false;
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0)
                result = false;
        }

        if(result)
            System.out.println(num + " is a prime number");
        else
            System.out.print(num + " is not a prime number");
    }
}


