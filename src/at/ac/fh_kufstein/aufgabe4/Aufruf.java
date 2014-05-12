
package at.ac.fh_kufstein.aufgabe4;

public class Aufruf {
    
    public static void main(String[] args) {
        
        Liste list = new Liste(3);
        list.save(2.0);
        list.save(5.0);
        list.save(200.0);
        
        System.out.println(list.toString());
    }
    
}
