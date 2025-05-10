package org.borispopic.factorypattern;

import org.borispopic.factorypattern.example.factory.CarFactory;
import org.borispopic.factorypattern.example.factory.TruckFactory;
import org.borispopic.factorypattern.example.product.Car;
import org.borispopic.factorypattern.example.product.Truck;
import org.borispopic.factorypattern.principle.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {
    @Test
    void carFactoryCreatesCarProduct() {
        CarFactory carFactory = new CarFactory();
        Product product = carFactory.createAndInitialize();

        assertNotNull(product);
        assertTrue(product instanceof Car);
    }

    @Test
    void differentProductsHaveDifferentBehavior() {
        Car car = new Car();
        Truck truck = new Truck();

        assertNotEquals(car.getClass(), truck.getClass());
    }

    @Test
    void productMethodExecutesWithoutError() {
        CarFactory carFactory = new CarFactory();
        TruckFactory truckFactory = new TruckFactory();
        Product product = carFactory.createAndInitialize();

        assertDoesNotThrow(product::productMethod);

        product = truckFactory.createAndInitialize();

        assertDoesNotThrow(product::productMethod);
    }
}
