/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5_jasvant_dosanjh;

/**
 *
 * @author jsdosanjh
 */
public class HW5_Jasvant_Dosanjh {

    public static void main(String[] args) {
        AbstractVehicle[] arr = new AbstractVehicle[4];

        //create parent and child objects
        CarVehicle c1 = new CarVehicle("4-Wheeler", "Black", "Mercedes", 240);
        CarVehicle c2 = new CarVehicle("4-Wheeler", "White", "Jeep", 190);
        SportsCars s1 = new SportsCars("4-Wheeler", "Red", "Bugatti", 340, "Chiron", 2998000);
        SportsCars s2 = new SportsCars("4-Wheeler", "Blue", "Audi", 220, "A6", 140000);

        //fill the array with these parent and child objects
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = s1;
        arr[3] = s2;

        System.out.println("C1:\n"+c1.toString() + "\n");
        System.out.println("C2:\n"+c2.toString() + "\n");
        System.out.println("S1:\n"+s1.toString() + "\n");
        System.out.println("S2:\n"+s2.toString() + "\n");

        //use instanceOf operator
        System.out.println("Print method specific to its class: ");
        for(int i =0; i<arr.length; i++) {
            if(arr[i] instanceof SportsCars) {
                ((SportsCars) arr[i]).numberOfSeater();
            } else if(arr[i] instanceof CarVehicle) {
                ((CarVehicle)arr[i]).topSpeed();
            }
        }

        //use getClass().getNmae()
        System.out.println("Print class of each object: ");
        for(int i =0; i<arr.length; i++) {
            System.out.println("Class is: " + arr[i].getClass().getName());
        }
    }
}
