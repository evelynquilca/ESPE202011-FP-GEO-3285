/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.realestatesystem.controller;

import ec.edu.espe.realestatesystem.model.House;
import utils.FileManager;

/**
 *
 * @author hp
 */
public class HouseController {
    public void save(House house){
        
        String data = house.getColor() + ", " + house.getForm() + ", " + house.getAge() + ", " + house.getSize()+ ", " + house.getPrince();
        FileManager.save(data, "houses");
    }
    
    public String[] read(){
        String[] data= new String[FileManager.returnSize("houses.csv")];
        data = FileManager.read("houses.csv");
        return data;
    }
    
}
    
