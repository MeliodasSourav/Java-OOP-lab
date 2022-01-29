package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Product Name: ");
        String p_name = scan.nextLine();
        System.out.println("Enter Product ID: ");
        String p_id = scan.nextLine();
        System.out.println("Enter Product Category: ");
        String p_category = scan.nextLine();
        System.out.println("Enter The Price: ");
        double p_price = scan.nextDouble();

        UapBazar system = new UapBazar(p_name,p_id,p_category,p_price);

        while (true){
            System.out.println("Choose the options: ");
            System.out.println("Update Product Price: Press 1.");
            System.out.println("Check The Product Price: Press 2.");
            System.out.println("The Discounted Price: Press 3.");
            System.out.println("The Product Info: Press 4.");
            System.out.println("To Exit: Press 0");

            int num=scan.nextInt();
            if (num==1){
                System.out.println("Update Product Price: ");
                double update = scan.nextDouble();
                system.updatePrice(update);
            }
            else if (num==2){
                double price = system.getPrice();
                System.out.println("The Product Price: "+price+"Tk.");
            }
            else if (num==3){
                System.out.println("Enter Discount Price: ");
                double discount = scan.nextDouble();
                double amount = system.getDiscountedPrice(discount);
                System.out.println("Amount after discount : " + amount);

            }
            else if (num==4){
                system.display();
            }
            else if (num==0){
                break;
            }
        }

    }
}
