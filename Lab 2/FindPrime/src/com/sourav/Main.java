package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = reader.nextInt();

        int i = 0;
        boolean isPrime = true;

        for (i = 2; i<= num/2; i++){
            int temp = num % i;
            if ( temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is Prime Number");
        }
        else {
            System.out.println(num + " is Not Prime Number");
        }


    }
}