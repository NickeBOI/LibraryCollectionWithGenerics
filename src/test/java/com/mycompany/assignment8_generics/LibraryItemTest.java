/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicholas
 */
public class LibraryItemTest {
    
    public LibraryItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setDescription method, of class LibraryItem.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        LibraryItem instance = new LibraryItem();
        String s = "Item ID: " + instance.id;
        instance.setDescription(s);
        
        assertEquals(instance.getDescription(), s);
        
    }

    /**
     * Test of getDescription method, of class LibraryItem.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        LibraryItem instance = new LibraryItem();
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        
    }
    
}
