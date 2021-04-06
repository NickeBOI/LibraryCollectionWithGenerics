/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

import java.util.Date;
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
public class BorrowableItemTest {
    
    public BorrowableItemTest() {
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
     * Test of setBorrowerID method, of class BorrowableItem.
     */
    @Test
    public void testSetBorrowerID() {
        System.out.println("setBorrowerID");
        String s = "myexamplelibraryID";
        BorrowableItem instance = new BorrowableItem();
        instance.setBorrowerID(s);
        
        assertEquals(instance.getBorrowerID(), s);
    }

    /**
     * Test of setBorrowDate method, of class BorrowableItem.
     */
    @Test
    public void testSetBorrowDate() {
        System.out.println("setBorrowDate");
        Date d = null;
        BorrowableItem instance = new BorrowableItem();
        instance.setBorrowDate(d);
        
        assertEquals(instance.getBorrowDate(), d);
        
        Date d2 = new Date();
        
        instance.setBorrowDate(d2);
        assertEquals(instance.getBorrowDate(), d2);
    }

    /**
     * Test of setReturnDate method, of class BorrowableItem.
     */
    @Test
    public void testSetReturnDate() {
        System.out.println("setReturnDate");
        Date d = null;
        BorrowableItem instance = new BorrowableItem();
        instance.setReturnDate(d);
        
        assertEquals(instance.getReturnDate(), d);
        
        Date d2 = new Date();
        
        instance.setReturnDate(d2);
        assertEquals(instance.getReturnDate(), d2);
    }

    /**
     * Test of getBorrowerID method, of class BorrowableItem.
     */
    @Test
    public void testGetBorrowerID() {
        System.out.println("getBorrowerID");
        
        String s = "myexamplelibraryID";
        BorrowableItem instance = new BorrowableItem();
        instance.setBorrowerID(s);
        
        assertEquals(instance.getBorrowerID(), s);

    }

    /**
     * Test of isCheckedOut method, of class BorrowableItem.
     */
    @Test
    public void testIsCheckedOut() {
        System.out.println("isCheckedOut");
        BorrowableItem instance = new BorrowableItem();
        boolean expResult = false;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of checkedOut method, of class BorrowableItem.
     */
    @Test
    public void testCheckedOut() {
        System.out.println("checkedOut");
        BorrowableItem instance = new BorrowableItem();
        boolean expResult = true;
        instance.checkedOut();
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBorrowDate method, of class BorrowableItem.
     */
    @Test
    public void testGetBorrowDate() {
        System.out.println("getBorrowDate");
        Date d = null;
        BorrowableItem instance = new BorrowableItem();
        instance.setBorrowDate(d);
        
        assertEquals(instance.getBorrowDate(), d);
        
        Date d2 = new Date();
        
        instance.setBorrowDate(d2);
        assertEquals(instance.getBorrowDate(), d2);
    }

    /**
     * Test of getReturnDate method, of class BorrowableItem.
     */
    @Test
    public void testGetReturnDate() {
        System.out.println("getReturnDate");
        Date d = null;
        BorrowableItem instance = new BorrowableItem();
        instance.setReturnDate(d);
        
        assertEquals(instance.getReturnDate(), d);
        
        Date d2 = new Date();
        
        instance.setReturnDate(d2);
        assertEquals(instance.getReturnDate(), d2);
    }
    
}
