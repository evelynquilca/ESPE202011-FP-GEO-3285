/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

/**
 *
 * @author hp
 */
public class Book {
    private String title;
    private String color;
    private String characterisc;
    private int page;
    private int chapters;

    public Book(String title, String color, String characterisc, int page, int chapters) {
        this.title = title;
        this.color = color;
        this.characterisc = characterisc;
        this.page = page;
        this.chapters = chapters;
    }
    
    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return the characterisc
     */
    public String getCharacterisc() {
        return characterisc;
    }

    /**
     * @param characterisc the characterisc to set
     */
    public void setCharacterisc(String characterisc) {
        this.characterisc = characterisc;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the chapters
     */
    public int getChapters() {
        return chapters;
    }

    /**
     * @param chapters the chapters to set
     */
    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

}
