package com.sourav;

public class UapBazar {
    String name, id, category;
    double price;
    double s, amount;

    public UapBazar(String name,String id, String category,double price){
        this.name=name;
        this.id=id;
        this.category=category;
        this.price=price;
    }

    public void updatePrice(double newPrice){
        price=newPrice;
    }

    double getPrice(){
        return price;
    }
    double getDiscountedPrice(double discountPercentage){
        double discount = (discountPercentage/100)*price;

        amount = price-discount;
        return amount;
    }
    public void display(){
        System.out.println("Name: "+name+"\n"+"ID: "+id+"\nCategory: "+category+"\nPrice: "+price);
    }


}
