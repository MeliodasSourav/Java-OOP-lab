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

    //balance deposit
    public void deposit (double depAmount){
        balance +=depAmount;
    }
    // balance withdraw
    public void withdraw(double withAmount){
        if (balance - withAmount > 0){
            balance -= withAmount;
        }
        else {
            System.out.println("Your Account balance is insufficient");
        }
    }

    //return balance
    public double getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("Name: " +name+"\n"+"ID: "+id+"\nBalance: "+balance+" Tk.");
    }

}
