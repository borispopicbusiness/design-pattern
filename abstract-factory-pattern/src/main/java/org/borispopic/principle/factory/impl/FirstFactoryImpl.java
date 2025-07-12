package org.borispopic.principle.factory.impl;

import org.borispopic.principle.factory.ProductFactory;
import org.borispopic.principle.implementations.firstimpl.FirstProductFirstImpl;
import org.borispopic.principle.implementations.firstimpl.SecondProductFirstImpl;
import org.borispopic.principle.products.FirstProduct;
import org.borispopic.principle.products.SecondProduct;

/**
 * Implementation of the ProductFactory interface responsible for creating products
 * defined in the "first" family of implementations.
 *
 * This class creates specific instances of FirstProduct and SecondProduct
 * which belong to the first family of products. The concrete product implementations
 * returned by this factory are FirstProductFirstImpl and SecondProductFirstImpl.
 *
 * Designed to adhere to the abstract factory pattern, this implementation provides
 * encapsulated logic for generating a consistent set of related product objects
 * within the first product family.
 */
public class FirstFactoryImpl implements ProductFactory {

    @Override
    public FirstProduct createFirstProduct() {
        return new FirstProductFirstImpl();
    }

    @Override
    public SecondProduct createSecondProduct() {
        return new SecondProductFirstImpl();
    }
}
