package org.borispopic.principle.implementations.secondimpl;

import org.borispopic.principle.products.FirstProduct;

/**
 * Concrete implementation of the FirstProduct interface for the "second" family of products.
 *
 * This class provides specific behavior for the methods defined in the FirstProduct
 * interface. It is part of the second family of product implementations, conforming
 * to the Abstract Factory design pattern.
 *
 * Instances of this class are typically created by the SecondFactoryImpl and are used
 * when objects from the "second" product family are needed.
 */
public class FirstProductSecondImpl implements FirstProduct {
    @Override
    public void firstMethod() {
        System.out.println("FirstProductSecondImpl: firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("FirstProductSecondImpl: secondMethod()");
    }
}
