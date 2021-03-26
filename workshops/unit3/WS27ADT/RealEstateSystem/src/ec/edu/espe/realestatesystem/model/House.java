/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.realestatesystem.model;

/**
 *
 * @author hp
 */
public class House {
    private String color;
    private String form;
    private int size;
    private int age;
    private int price;

    public House(String color, String form, int size, int age, int price) {
        this.color = color;
        this.form = form;
        this.size = size;
        this.age = age;
        this.price = price;
    }
    
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the form
     */
    public String getForm() {
        return form;
    }

    /**
     * @param form the form to set
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the price
     */
    public float getPrince() {
        return price;
    }

    /**
     * @param prince the price to set
     */
    public void setPrince(int prince) {
        this.price = prince;
    }
    
    
    
}
