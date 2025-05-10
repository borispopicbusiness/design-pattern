package org.borispopic.factorypattern.example.factory;

import org.borispopic.factorypattern.example.product.Truck;
import org.borispopic.factorypattern.principle.AbstractProductFactory;

public class TruckFactory extends AbstractProductFactory<Truck> {
    @Override
    protected Truck createProduct() {
        return new Truck();
    }
}
