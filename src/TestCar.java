/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class TestCar {
    
    static void print(Car obj){
        obj.getCarName();
        obj.getColor();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car toyota = new Car();
        Car nissan = new Car();
        
        toyota.setCarName("Hilux");
        toyota.setColor("Red");
        toyota.price = 550000;
        print(toyota);
        System.out.println(toyota.getCarName());
        System.out.println(toyota.getColor());
        System.out.println(toyota.price);
    }
    
}
