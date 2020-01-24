/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
// abhijeet awal

//  24 jan 2020   

public class Student {
    
    private String name;
    private int id;
    private double abhi;
    

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    
    public double getAbhi(){
        return abhi;
    }
    
    
    public String getName() {
        return name;
    }
      public void setAbhi(double abhi){
          this.abhi  = abhi;
      } 
    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
     public int getId() {
        return id;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setId(int id) {
        this.id = id;
    }

    
    
}
 
   
