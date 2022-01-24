package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int i;
        System.out.println("Input n integer numbers:");
        int num = scan.nextInt();

        for ( i=1; i<=num; i++){
            System.out.println("Enter the numbers: ");
            int a = scan.nextInt();

            if ( i % 2 == 0){
                sum +=a;
            }


        }
        System.out.println("Even Numbers Sum:" + sum);

    }
}