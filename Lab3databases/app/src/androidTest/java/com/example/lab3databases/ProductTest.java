package com.example.lab3databases;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testProductConstructorAndGetters() {
        Product product = new Product("Apple", 1.99);

        assertEquals("Apple", product.getProductName());
        assertEquals(1.99, product.getProductPrice(), 0.001);
    }

    @Test
    public void testSettersAndId() {
        Product product = new Product();
        product.setProductName("Banana");
        product.setProductPrice(0.99);
        product.setId(42);

        assertEquals("Banana", product.getProductName());
        assertEquals(0.99, product.getProductPrice(), 0.001);
        assertEquals(42, product.getId());
    }
}
