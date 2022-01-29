package com.sourav;

public class UapHr {
    String name, id, designation;
    double salary;
    public UapHr(String name, String designation, String id, Double salary){
        this.name = name;
        this.id= id;
        this.designation= designation;
        this.salary=salary;
    }

    //update salary
    public void updateSalary(double newSal){
        salary +=newSal;
    }

    //return the salary
    public double getSalary(){
        return salary;
    }

    //display
    public void display(){
        System.out.println("Name: "+name+"\n"+"ID: "+id+"\nDesignation: "+designation+"\nSalary: "+salary+" Tk.");
    }


}
