package com.careerit.jfs.cj.day14;

public final class Product {

    private final int pid;
    private final String pname;
    private final double price;

    public Product(int pid,String pname,double price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Product id :"+pid);
        System.out.println("Product name :"+pname);
        System.out.println("Product price :"+price);
    }

    public Product updatePrice(double price){
        return new Product(this.pid,this.pname,price);
    }


}
