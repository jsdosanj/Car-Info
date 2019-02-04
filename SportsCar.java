/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5_jasvant_dosanjh;

/*
Sports car type class representation
 */

public class SportsCars extends CarVehicle{
    private String name;
    private double price;

    public SportsCars(){}

    public SportsCars(String type, String color, String brand, double speed, String name, double price) {
        super(type, color, brand, speed);
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        String str = super.toString();
        str += "\nThe name of the Car is " + this.name + " and its price is " + this.price + "$.";
        return str;
    }

    public void numberOfSeater() {
        if(this.price >150000) {
            System.out.println("This is a 2-seater car");
        } else {
            System.out.println("This is a 5-setear car");
        }
    }
}
