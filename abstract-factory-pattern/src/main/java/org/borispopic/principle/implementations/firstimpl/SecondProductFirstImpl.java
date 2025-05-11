package org.borispopic.principle.implementations.firstimpl;

import org.borispopic.principle.products.SecondProduct;

/**
 * Concrete implementation of the SecondProduct interface for the "first" family of products.
 *
 * This class provides specific behaviors for the methods defined in the SecondProduct
 * interface. It is a part of the first family of product implementations conforming
 * to the Abstract Factory design pattern.
 *
 * Instances of this class are typically created by the FirstFactoryImpl and are used
 * in scenarios requiring the "first" family of SecondProduct implementations.
 */
public class SecondProductFirstImpl implements SecondProduct {

    @Override
    public void firstMethod() {
        System.out.println("SecondProductFirstImpl: firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("SecondProductFirstImpl: secondMethod()");
    }
}
