/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public class LibraryTest {
    public static void main(String[] args) {
        
    }
    
    public void Welcome(){
        LibCollection library = new LibCollection();
        Book book1 = new Book("Cracking the Coding Interview");
        Book book2 = new Book("Refactoring");
        DVD movie1 = new DVD("Forest Gump");
        DVD movie2 = new DVD("Saving Private Ryan");
        
        library.add(book1);
        library.add(book2);
        library.add(movie1);
        library.add(movie2);
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Library");
        System.out.println("1. Search for a Book");
        System.out.println("2. Search for a Movie");
        int choice = in.nextInt();
        if(choice == 1){
            System.out.println("Enter a Book Title: ");
        }
    }
}
