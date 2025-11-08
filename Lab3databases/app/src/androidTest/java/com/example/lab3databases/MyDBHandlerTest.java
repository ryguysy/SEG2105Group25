package com.example.lab3databases;

import junit.framework.TestCase;

import android.content.Context;
import android.database.Cursor;
import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyDBHandlerTest {

    private MyDBHandler dbHandler;

    @Before
    public void setUp() {
        Context context = ApplicationProvider.getApplicationContext();
        dbHandler = new MyDBHandler(context);
    }

    @After
    public void tearDown() {
        dbHandler.close();
    }

    @Test
    public void testAddAndFindProduct() {
        Product product = new Product("Milk", 3.49);
        dbHandler.addProduct(product);

        Cursor cursor = dbHandler.findProduct(new Product("Milk", -1));
        assertNotNull(cursor);
        assertTrue(cursor.moveToFirst());

        String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        double price = cursor.getDouble(cursor.getColumnIndexOrThrow("price"));

        assertEquals("Milk", name);
        assertEquals(3.49, price, 0.001);

        cursor.close();
    }
}
