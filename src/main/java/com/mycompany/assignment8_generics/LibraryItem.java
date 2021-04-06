/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;
import java.util.Date;

/**
 *
 * @author Nicholas
 */
public class LibraryItem {
    public static int nextID = 1;
    public final int id;
    
    private String description;
    
    public LibraryItem(){
        id = nextID++;
    }
    
    public void setDescription(String s){
        description = s;
    }
    
    public String getDescription(){
        return description;
    }
}

interface Borrowable {
    void setBorrowerID(String s);
    void setBorrowDate(Date d);
    void setReturnDate(Date d);
}
