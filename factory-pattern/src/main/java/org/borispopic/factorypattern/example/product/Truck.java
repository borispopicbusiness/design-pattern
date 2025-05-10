package org.borispopic.factorypattern.example.product;

import org.borispopic.factorypattern.principle.Product;

public class Truck implements Product {
    @Override
    public void productMethod() {
        System.out.println("This is a truck!");
    }
}
