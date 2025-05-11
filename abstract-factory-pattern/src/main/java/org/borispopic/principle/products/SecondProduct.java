package org.borispopic.principle.products;

/**
 * Represents the interface for the "SecondProduct" component in a product family.
 *
 * This interface defines a contract for the methods that all concrete implementations
 * of SecondProduct must provide. It is a part of the Abstract Factory design pattern,
 * enabling the consistent creation of products that belong to the same product family.
 *
 * Classes implementing this interface should provide specific logic for the
 * operations defined by the methods.
 */
public interface SecondProduct {
    void firstMethod();
    void secondMethod();
}
