/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5_jasvant_dosanjh;
//Top most abstract class
public abstract class AbstractVehicle {
    private String color;
    private String type;

    public AbstractVehicle() {
        //Constructor
        color="";
        type="";
    }

    public AbstractVehicle(String type, String color) {
        //Constructor
        this.type = type;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        String str = "The vehicle is a " + this.type + " which is " + this.color + " in color!!";
        return str;
    }
}
