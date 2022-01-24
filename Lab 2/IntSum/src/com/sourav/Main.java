package com.sourav;

import java.util.Scanner;

public class Main {
    static int solve(int n)
    {
        if(n<10)return n;
        return n%10+solve(n/10);
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = read.nextInt();
        int res = solve(n);
        System.out.println(res);


    }
}