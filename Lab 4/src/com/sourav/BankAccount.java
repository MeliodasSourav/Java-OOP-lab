package com.sourav;

public class BankAccount {
    String name, id;
    double balance;
    public BankAccount(String name,String id,double balance)
    {
        this.name =name;
        this.id =id;
        this.balance =balance;
    }


    public void display(){
        System.out.println("Name: " +name+"\n"+"ID: "+id+"\nBalance: "+balance+" Tk.");
    }
//    public String toString(){
//        return String.format("Name: " +name+"\n"+"ID: "+id+"\nBalance: "+balance+" Tk.");
//    }
}
