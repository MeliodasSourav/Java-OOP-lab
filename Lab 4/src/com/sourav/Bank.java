package com.sourav;
import java.util.ArrayList;
public class Bank {
    ArrayList<BankAccount> accountlist = new ArrayList<BankAccount>();

    void addAccount(String name,String id, double balance)
    {
        accountlist.add(new BankAccount(id,name,balance));
    }
    void displayAll()
    {
        for(int i=0;i< accountlist.size();i++)
        {
            accountlist.get(i).display();
        }
    }

    void deposit(double amount,String id)
    {
        Boolean found = false;
        for(int i=0;i<accountlist.size();i++)
        {
            if(accountlist.get(i).id==id)
            {
                found = true;
                accountlist.get(i).balance+=amount;
            }
        }
        if(!found)
        {
            System.out.println("This account doesn't exist.");
        }
    }

    void withdraw(double amount,String id)
    {
        Boolean found = false;
        for(int i=0;i<accountlist.size();i++)
        {
            if(accountlist.get(i).id==id)
            {
                found = true;
                accountlist.get(i).balance-=amount;
            }
        }
        if(!found)
        {
            System.out.println("This account doesn't exist.");
        }
    }

    double getBalance(String id)
    {
        Boolean found = false;
        for(int i=0;i<accountlist.size();i++)
        {
            if(accountlist.get(i).id==id)
            {
                found = true;
                return accountlist.get(i).balance;
            }
        }
        return -1;
    }

}
