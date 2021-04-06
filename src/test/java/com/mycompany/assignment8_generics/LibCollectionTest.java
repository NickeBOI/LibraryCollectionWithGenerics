/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
public class LibCollectionTest {
    
    public LibCollectionTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*
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
    */

    /**
     * Test of add method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        //Testing adding a non null item
        System.out.println("add");
        LibraryItem o = new Book("Refactoring");
        LibCollection instance = new LibCollection();
        boolean expResult = true;
        boolean result = instance.add(o);
        assertEquals(expResult, result);
        
        //Testing adding a null Item
        LibraryItem o2 = null;
        LibCollection instance2 = new LibCollection();
        boolean expResult2 = false;
        boolean result2 = instance2.add(o2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of addAll method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testAddAll() {
        //Testing adding a Non-Empty Collection
        System.out.println("addAll");
        Collection<LibraryItem> c = new ArrayList<>();
        c.add(new Book("Cracking the Coding Interview"));
        LibCollection instance = new LibCollection();
        boolean expResult = true;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        
        //Testing Adding an Empty Collection
        Collection<LibraryItem> c2 = null;
        LibCollection instance2 = new LibCollection();
        boolean expResult2 = false;
        boolean result2 = instance2.addAll(c2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of remove method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testRemove() {
        System.out.println("remove");
        Object o = null;
        LibraryItem o2 = new Book("Refactoring");
        LibCollection instance = new LibCollection();
        instance.add(o2);
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        
        boolean expResult2 = true;
        boolean result2 = instance.remove(o2);
        
        assertEquals(expResult2, result2);
    }

    /**
     * Test of clear method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testClear() {
        System.out.println("clear");
        Book book1 = new Book("The Bible");
        DVD movie1 = new DVD("The Life of Brian");
        LibCollection instance = new LibCollection();
        instance.add(book1);
        instance.add(movie1);
        instance.clear();
        assertEquals(instance.size(), 0);
        
    }

    /**
     * Test of removeAll method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        LibCollection c = null;
        LibCollection instance = new LibCollection();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        
        
        //Testing with a non-null LibCollection
        Book book1 = new Book("The Bible");
        LibCollection c2 = new LibCollection();
        c2.add(book1);
        instance.add(book1);
        boolean expResult2 = true;
        boolean result2 = instance.removeAll(c2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of retainAll method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testRetainAll() {
        LibCollection c = null;
        LibCollection instance = new LibCollection();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        
        
        //Testing with a non-null LibCollection
        Book book1 = new Book("The Bible");
        LibCollection c2 = new LibCollection();
        instance.add(book1);
        boolean expResult2 = true;
        boolean result2 = instance.retainAll(c2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of contains method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        LibCollection instance = new LibCollection();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        
        Book book1 = new Book("The Bible");
        Object o1 = book1;
        boolean expResult2 = false;
        boolean result2 = instance.contains(o1);
        assertEquals(expResult2, result2);
        
        instance.add(book1);
        boolean expResult3 = true;
        boolean result3 = instance.contains(o1);
        assertEquals(expResult3, result3);
        
        
    }

    /**
     * Test of containsAll method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testContainsAll() {
        System.out.println("containsAll");
        LibCollection c = null;
        LibCollection instance = new LibCollection();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        
        Book book1 = new Book("The Bible");
        Book book2 = new Book("The Giver");
        LibCollection c2 = new LibCollection();
        instance.add(book1);
        instance.add(book2);
        c2.add(book1);
        boolean expResult2 = true;
        boolean result2 = instance.containsAll(c2);
        assertEquals(expResult2, result2);
        
        instance.remove(book1);
        boolean expResult3 = false;
        boolean result3 = instance.containsAll(c2);
        assertEquals(expResult3, result3);
        
        
    }

    /**
     * Test of isEmpty method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LibCollection instance = new LibCollection();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        Book book1 = new Book("The Bible");
        instance.add(book1);
        boolean expResult2 = false;
        boolean result2 = instance.isEmpty();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of size method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testSize() {
        System.out.println("size");
        LibCollection instance = new LibCollection();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        
        Book book1 = new Book("The Giver");
        instance.add(book1);
        int expResult2 = 1;
        int result2 = instance.size();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getIterator method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testGetIterator() {
        System.out.println("getIterator");
        LibCollection instance = new LibCollection();
        boolean expResult = false;
        Iterator it = instance.getIterator();
        boolean result = it.hasNext();
        assertEquals(expResult, result);
        
        Book book1 = new Book("The Giver");
        Book book2 = new Book("The Call of the Wild");
        instance.add(book1);
        instance.add(book2);
        Iterator it2 = instance.getIterator();
        boolean expResult2 = true;
        boolean result2 = it2.hasNext();
        assertEquals(expResult2, result2);
        
        it2.next();
        it2.next();
        
        boolean expResult3 = false;
        boolean result3 = it2.hasNext();
        assertEquals(expResult3, result3);
    }

    /**
     * Test of toArray method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testToArray_0args() {
        System.out.println("toArray");
        Book book1 = new Book("The Bible");
        DVD movie1 = new DVD("The Life of Brian");
        LibCollection instance = new LibCollection();
        instance.add(book1);
        instance.add(movie1);
        Object[] expResult = new Object[2];
        expResult[0] = book1;
        expResult[1] = movie1;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toArray method, of class LibCollection.
     */
    @org.junit.jupiter.api.Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Book book1 = new Book("The Bible");
        DVD movie1 = new DVD("The Life of Brian");
        LibCollection<LibraryItem> instance = new LibCollection();
        instance.add(book1);
        instance.add(movie1);
        
        LibraryItem[] expResult = {book1, movie1};
        LibraryItem[] result = instance.<LibraryItem>toArray(new LibraryItem[instance.size()]);
        assertArrayEquals(expResult, result);
    }
    
}
