package org.borispopic.principle.factory.impl;

import org.borispopic.principle.factory.ProductFactory;
import org.borispopic.principle.implementations.secondimpl.FirstProductSecondImpl;
import org.borispopic.principle.implementations.secondimpl.SecondProductSecondImpl;
import org.borispopic.principle.products.FirstProduct;
import org.borispopic.principle.products.SecondProduct;

/**
 * Implementation of the ProductFactory interface responsible for creating products
 * defined in the "second" family of implementations.
 *
 * This class creates specific instances of FirstProduct and SecondProduct
 * which belong to the second family of products. The concrete product implementations
 * returned by this factory are {@link FirstProductSecondImpl} and {@link SecondProductSecondImpl}.
 *
 * Designed to follow the abstract factory pattern, this implementation encapsulates
 * the creation logic for the second set of related products, ensuring consistency in
 * object behavior and design within this family.
 */
public class SecondFactoryImpl implements ProductFactory {

    @Override
    public FirstProduct createFirstProduct() {
        return new FirstProductSecondImpl();
    }

    @Override
    public SecondProduct createSecondProduct() {
        return new SecondProductSecondImpl();
    }
}
