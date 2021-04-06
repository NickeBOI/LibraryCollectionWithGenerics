/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment8_generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Nicholas
 * @param <E>
 */
public class LibCollection<E extends LibraryItem> {
    
    private int size = 0;
    ArrayList<E> library_collection = new ArrayList<>();
    
    boolean add(E o){
        if(o == null) return false;
        library_collection.add(o);
        size++;
        return true;
    }
    
    boolean addAll(Collection<? extends E> c){
        if(c == null) return false;
        boolean modified = false;
        Iterator it = c.iterator();
        while(it.hasNext()){
            library_collection.add((E)it.next());
            modified = true;
        }
        return modified;
    }
    
    boolean remove(Object o){
        if(o == null) return false;
        for(E e : library_collection){
            if(e.equals(o)){
                library_collection.remove(e);
                size--;
                return true;
            }
        }
        return false;
    }
    
    void clear(){
        for(E e : library_collection){
            library_collection.remove(e);
        }
        size = 0;
    }
    
    boolean removeAll(LibCollection<? super E> c){
        if(c == null) return false;
        boolean modified = false;
        Iterator it = this.getIterator();
        while(it.hasNext()){
            if(c.contains((E)it.next())){
                it.remove();
                size--;
                modified = true;
            }
        }
        return modified;
    }
    
    boolean retainAll(LibCollection<?> c){
        if(c == null) return false;
        boolean modified = false;
        Iterator it = this.getIterator();
        while(it.hasNext()){
            if(!c.contains((E)it.next())){
                it.remove();
                size--;
                modified = true;
            }
        }
        return modified;
    }
    
    boolean contains(Object o){
        if(o == null) return false;
        for(E e : library_collection){
            if(e.equals(o))
                return true;
        }
        return false;
    }
    
    boolean containsAll(LibCollection<?> c){
        if(c == null) return false;
        Iterator it = c.getIterator();
        while(it.hasNext()){
            if(!this.contains(it.next()))
                return false;
        }
        return true;
    }
    
    boolean isEmpty() {
        return size == 0;
    }
    
    int size() {
        return size;
    }
    
    Iterator<E> getIterator(){
        return new libraryIterator();
    }
    
    Object[] toArray(){
        return library_collection.toArray();
    }
    
    <T> T[] toArray(T[] a) {
        for (int i = 0; i < size; i++) {
            a[i] = (T) library_collection.get(i);
        }
        return a;
    }
    class libraryIterator<E> implements Iterator<E> {
        private int i = 0;
        @Override
        public E next(){
            if(hasNext())
                return (E) library_collection.get(i++);
            return null;
        }
        @Override
        public boolean hasNext(){
            return i < size();
        }
        
        public boolean isEmpty(){
            return i == 0;
        }
        @Override
        public void remove(){
            library_collection.remove(library_collection.get(--i));
        }
    }
}
