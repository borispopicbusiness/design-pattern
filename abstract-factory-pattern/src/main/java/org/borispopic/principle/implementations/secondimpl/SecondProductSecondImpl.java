package org.borispopic.principle.implementations.secondimpl;

import org.borispopic.principle.products.SecondProduct;

/**
 * Concrete implementation of the SecondProduct interface for the "second" family of products.
 *
 * This class provides specific behaviors for the methods defined in the SecondProduct
 * interface. It is a part of the second family of product implementations conforming
 * to the Abstract Factory design pattern.
 *
 * Instances of this class are typically created by the SecondFactoryImpl and are used
 * in scenarios requiring the "second" family of SecondProduct implementations.
 */
public class SecondProductSecondImpl implements SecondProduct {
    @Override
    public void firstMethod() {
        System.out.println("SecondProductSecondImpl: firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("SecondProductSecondImpl: secondMethod()");
    }
}
