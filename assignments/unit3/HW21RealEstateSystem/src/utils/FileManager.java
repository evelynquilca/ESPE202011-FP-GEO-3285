/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileManager {
    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;} catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }
    public static int returnSize(String fileName){
        int numbersOfLines= 0;     
       try{
           Scanner s= new Scanner( new File(fileName));
           while (s.hasNextLine()){
               numbersOfLines++;               
           }
       } catch (FileNotFoundException e){
           System.out.println("file not found");
       }
        return numbersOfLines;
    }
    
    
    public static String[] read(String fileName) {
       int numbersOfLines= 0;
       String[] results= null;
       int counter= 0;
       try{
           Scanner s= new Scanner( new File(fileName));
           results = new String[numbersOfLines];
           while (s.hasNextLine()){
               results[counter] = s.nextLine();
               
           }
       } catch (FileNotFoundException e){
           System.out.println("file not found");
       }
        return results;
    }
    

}
    

