
package at.ac.fh_kufstein.uebung_03;

import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.Vehicle.color;

public class Aufruf {
    
    public static void main(String[] args) {
    
    Car bmw = new Car((short) 4, (short) 4, (short) 220, (short) 0, (short)5, color.SILVER);
    Car audi = new Car((short) 4, (short) 8, (short) 180, (short) 0, (short)5, color.BLACK);
    Boat titanic = new Boat(10.54, 100000.00, (short) 3, (short) 0, (short) 51000, (short) 0, (short) 0, color.BLUE);
    
    System.out.println(bmw.toString());
    System.out.println(audi.toString());
    System.out.println(titanic.toString());
    }
}
