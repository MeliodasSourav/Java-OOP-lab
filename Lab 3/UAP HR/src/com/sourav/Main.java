package com.sourav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String e_name = scan.nextLine();
        System.out.println("Enter Employee ID: ");
        String e_id = scan.nextLine();
        System.out.println("Enter Employee Designation: ");
        String e_designation = scan.nextLine();
        System.out.println("Enter The Salary: ");
        Double e_salary = scan.nextDouble();

        UapHr profile = new UapHr(e_name,e_id,e_designation,e_salary);
        while (true){
            System.out.println("Enter Your Options: ");
            System.out.println("Update the Salary: Press 1.");
            System.out.println("Check the Salary: Press 2.");
            System.out.println("Display Profile: Press 3.");
            System.out.println("To Exit: Press 0.");

            int num = scan.nextInt();
            if (num==1){
                System.out.println("Update the Salary: ");
                double update= scan.nextDouble();
                profile.updateSalary(update);
            }
            else if (num==2){
                double salary = profile.getSalary();
                System.out.println("The Current Salary: "+salary+ "Tk");
            }
            else if (num==3){
                profile.display();
            }
            else if (num==0){
                break;
            }
        }
    }
}
