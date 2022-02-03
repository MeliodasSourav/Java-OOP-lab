package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank mybank= new Bank();


        while (true){
            System.out.println("Enter Your Options: ");
            System.out.println("To Create an account : press 1 .");
            System.out.println("To Deposit: Press 2.");
            System.out.println("To Withdraw: Press 3.");
            System.out.println("To Know the Amount: Press 4.");
            System.out.println("To Display all account information: Press 5.");
            System.out.println("To Exit: Press 0.");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if (n==2){
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Enter the amount you want to Deposit :");
                double dep = scan2.nextDouble();
                System.out.println("Enter the id of the account you want to Deposit :");
                String id  = scan2.nextLine();
                mybank.deposit(dep,id);
            }
            else if(n==3){
                Scanner scan3 = new Scanner(System.in);
                System.out.println("Enter the amount you want to  Withdraw: ");
                double w_draw = scan3.nextDouble();
                System.out.println("Enter the id of the account you want to Withdraw :");
                String id  = scan3.nextLine();
                mybank.withdraw(w_draw,id);
            }
            else if(n==4){
                Scanner scan4 = new Scanner(System.in);
                System.out.println("Enter the id of the account you want to know the balance of :");
                String id  = scan4.nextLine();
                double balance = mybank.getBalance(id);
                if(balance==-1)
                {
                    System.out.println("This account doesn't exist.");
                }
                else
                {
                    System.out.println("Your Current Balance is: "+ balance + "Tk");
                }

            }
            else if (n==5){
                mybank.displayAll();
            }
            else if (n==1){
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Enter Your Name: ");
                String a_name = scan1.nextLine();
                System.out.println("Enter Your Account Id: ");
                String a_id = scan1.nextLine();
                System.out.println("Enter Your Balance: ");
                double a_balance = scan1.nextDouble();

                mybank.addAccount(a_name,a_id,a_balance);
            }
            else if (n==0){
                break;
            }

        }

    }
}
