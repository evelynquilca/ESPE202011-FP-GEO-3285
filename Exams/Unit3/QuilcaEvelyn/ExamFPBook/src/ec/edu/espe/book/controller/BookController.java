/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.controller;

import Utils.FileManager;
import ec.edu.espe.book.model.Book;

/**
 *
 * @author hp
 */
public class BookController {
     public void save(Book book){
        
        String data = book.getTitle() + ";" + book.getColor() + ";" + book.getCharacterisc() + ";" + book.getPage()+ ";" + book.getChapters();
        FileManager.save(data, "book");
    }
    
    public String[] read(){
        String[] data= new String[FileManager.returnSize("book.csv")];
        data = FileManager.read("book.csv");
        return data;
    }
    
}
