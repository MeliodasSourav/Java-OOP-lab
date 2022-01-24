package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Your Number: ");

        int num = read.nextInt();

        if(num<0){
            System.out.println("NA");
        }
        else {
            int  fact = 1;
            for (int i=1; i<=num; i++){
                fact = fact*i;
            }
            System.out.println("Factorial of " + num+ " is: "+fact);

        }

    }
}