package com.sourav;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Week Number: ");
        int week = scan.nextInt();

        if (week%7 == 0){
            System.out.println("Saturday");
        }
        else if (week%7 == 1){
            System.out.println("Sunday");
        }
        else if (week%7 == 2){
            System.out.println("Monday");
        }
        else if (week%7 ==3){
            System.out.println("Tuesday");
        }
        else if (week%7 == 4){
            System.out.println("Wednesday");
        }
        else if (week%7 == 5){
            System.out.println("Thursday");
        }
        else{
            System.out.println("Friday");

        }
    }
}