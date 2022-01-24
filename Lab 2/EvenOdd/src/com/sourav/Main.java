package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int numb = reader.nextInt();

        if (numb %2 == 0)
        {
            System.out.println(numb + " is even");
        }
        else {
            System.out.println(numb + " is Odd");
        }

    }
}