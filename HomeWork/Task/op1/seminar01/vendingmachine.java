package org.example.gb.op1.seminar01;

public interface vendingmachine {

    void addproduct(product product);

    product getproduct(String name);
    product getproduct(String name, Integer volume, Integer temp);

}