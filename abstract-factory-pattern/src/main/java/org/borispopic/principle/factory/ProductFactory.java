package org.borispopic.principle.factory;

import org.borispopic.principle.products.FirstProduct;
import org.borispopic.principle.products.SecondProduct;

/**
 * The ProductFactory interface defines a contract for creating products.
 * It acts as an abstract factory for generating objects that implement
 * the FirstProduct and SecondProduct interfaces.
 *
 * Implementations of this interface are responsible for providing the
 * concrete instantiation logic for the products, adhering to the
 * abstract factory design pattern.
 */
public interface ProductFactory {
    FirstProduct createFirstProduct();
    SecondProduct createSecondProduct();
}
