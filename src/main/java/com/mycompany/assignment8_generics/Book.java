/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

/**
 *
 * @author Nicholas
 */
public class Book extends BorrowableItem {
    private final String bookTitle;
    
    public Book(String title){
        bookTitle = title;
    }
    
    public String getTitle(){
        return bookTitle;
    }
}
