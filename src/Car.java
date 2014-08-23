/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Car {
    private String carName;
    private String color;
    public int price;
    
    public void setCarName(String carName){
        this.carName = carName;
    }
    
    public String getCarName(){
        return carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
