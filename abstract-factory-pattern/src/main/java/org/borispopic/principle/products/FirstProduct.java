package org.borispopic.principle.products;

/**
 * Represents the interface for the "FirstProduct" component in a product family.
 *
 * This interface defines a contract for the methods that all concrete implementations
 * of FirstProduct must provide. It is a part of the Abstract Factory design pattern,
 * enabling the consistent creation of products that belong to the same product family.
 *
 * Classes implementing this interface should provide specific logic for the
 * operations defined by the methods.
 */
public interface FirstProduct {
    void firstMethod();
    void secondMethod();
}
