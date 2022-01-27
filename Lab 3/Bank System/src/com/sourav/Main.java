package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String a_name = scan.nextLine();
        System.out.println("Enter Your Account Id: ");
        String a_id = scan.nextLine();
        System.out.println("Enter Your Balance: ");
        double a_balance = scan.nextDouble();

        BankAccount account = new BankAccount(a_name,a_id,a_balance);
        while (true){
            System.out.println("Enter Your Options: ");
            System.out.println("To Deposit: Press 1.");
            System.out.println("To Withdraw: Press 2.");
            System.out.println("To Know the Amount: Press 3.");
            System.out.println("To Display account information: Press 4.");
            System.out.println("To Exit: Press 0.");

            int n = scan.nextInt();
                if (n==1){
                    System.out.println("Enter the amount you want to Deposit :");
                    double dep = scan.nextDouble();
                    account.deposit(dep);
                }
                else if(n==2){
                    System.out.println("Enter the amount you want to  Withdraw: ");
                    double w_draw = scan.nextDouble();
                    account.withdraw(w_draw);
                }
                else if(n==3){
                    double balance = account.getBalance();
                    System.out.println("Your Current Balance is: "+ balance + "Tk");
                }
                else if (n==4){
                    account.display();
                }
                else if (n==0){
                    break;
                }

        }
    }
}
