/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5_jasvant_dosanjh;
//Car type class representation
public class CarVehicle extends AbstractVehicle {
    private String brand;
    private double speed;
    public CarVehicle() {
        brand="";
    }

    public CarVehicle(String type, String color, String brand, double speed) {
        super(type,color);
        this.brand = brand;
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public String toString() {
        String str = super.toString();
        str += "\nThe vahicle is a car and its brand is " + this.brand;
        return str;
    }

    public void topSpeed() {
        System.out.println("Top speed of this car is: " + this.speed + " kmph");
    }
}
