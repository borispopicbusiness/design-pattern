package org.borispopic.principle.implementations.firstimpl;

import org.borispopic.principle.products.FirstProduct;

/**
 * Concrete implementation of the FirstProduct interface for the "first" family of products.
 *
 * This class provides specific behavior for the methods defined in the FirstProduct
 * interface. It is a part of the first family of product implementations conforming
 * to the Abstract Factory design pattern.
 *
 * Instances of this class are typically created by the FirstFactoryImpl and are used
 * when objects from the "first" product family are needed.
 */
public class FirstProductFirstImpl implements FirstProduct {
    @Override
    public void firstMethod() {
        System.out.println("FirstProductFirstImpl: firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("FirstProductFirstImpl: secondMethod()");
    }
}
