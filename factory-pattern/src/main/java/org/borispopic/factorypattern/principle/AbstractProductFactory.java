package org.borispopic.factorypattern.principle;

/**
 * Abstract factory for creating products.
 * @param <T> type of product this factory creates
 */
public abstract class AbstractProductFactory<T extends Product> {
    
    /**
     * Template method that handles the complete product creation process.
     * @return newly created product instance
     */
    public final T createAndInitialize() {
        T product = createProduct();
        initializeProduct(product);
        return product;
    }

    /**
     * Creates a new product instance.
     * @return newly created product
     */
    protected abstract T createProduct();
    
    /**
     * Initializes the newly created product.
     * Can be overridden by concrete factories to provide specific initialization.
     * @param product product to initialize
     */
    protected void initializeProduct(T product) {
        // Default implementation does nothing
    }
}