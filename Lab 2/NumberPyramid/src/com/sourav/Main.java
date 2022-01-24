package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the rows Number: ");
        int rows = read.nextInt();
        System.out.println("");


        if (rows>9){
            rows = 9;
        }
        int count = rows;
        if (rows<=9){
            for (int i=0; i<=rows; i++){
                for (int j=1; j<=i*2; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=count; j++) {
                    System.out.print(j+" ");
                }
                for(int j=count-1; j>=1; j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
                count--;
            }

        }

    }
}