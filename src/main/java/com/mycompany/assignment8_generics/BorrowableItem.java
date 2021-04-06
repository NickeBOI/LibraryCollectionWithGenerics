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
public class BorrowableItem extends LibraryItem implements Borrowable {
    
    private String borrowerID;
    private boolean checkedOut = false;
    private Date borrowDate;
    private Date returnDate;
    
    @Override
    public void setBorrowerID(String s){
        borrowerID = s;
    }
    @Override
    public void setBorrowDate(Date d){
        borrowDate = d;
    }
    @Override
    public void setReturnDate(Date d) {
        returnDate = d;
    }
    
    public String getBorrowerID(){
        return borrowerID;
    }
    
    public boolean isCheckedOut(){
        return checkedOut;
    }
    
    public void checkedOut(){
        checkedOut = true;
    }
    
    public Date getBorrowDate(){
        return borrowDate;
    }
    
    public Date getReturnDate(){
        return returnDate;
    }
    
    
}
