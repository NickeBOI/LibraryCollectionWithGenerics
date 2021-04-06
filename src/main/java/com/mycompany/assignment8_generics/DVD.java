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
public class DVD extends BorrowableItem {
    private String movieTitle;
    
    public DVD(String title){
        movieTitle = title;
    }
    
    public String getTitle(){
        return movieTitle;
    }
}
