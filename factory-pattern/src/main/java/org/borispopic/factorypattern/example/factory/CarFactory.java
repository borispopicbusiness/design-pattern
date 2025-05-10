package org.borispopic.factorypattern.example.factory;

import org.borispopic.factorypattern.example.product.Car;
import org.borispopic.factorypattern.principle.AbstractProductFactory;

public class CarFactory extends AbstractProductFactory<Car> {
    @Override
    protected Car createProduct() {
        return new Car();
    }
}
