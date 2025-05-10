package org.borispopic.factorypattern.principle;

/**
 * Base interface for products created by factories in the Factory pattern.
 * Concrete product classes should implement this interface to provide
 * specific functionality. The interface acts as a contract ensuring all
 * products share a common API, enabling loose coupling between product
 * creation and product usage.
 *
 * @see AbstractProductFactory
 */
public interface Product {
    void productMethod();
}