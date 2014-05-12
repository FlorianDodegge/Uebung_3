
package at.ac.fh_kufstein.aufgabe4;

public class Liste <T> {
    T[] array;
    
    public Liste(int size) {
        array=(T[]) (new Object [size]);
    }
    public void save(T value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==null) {
                array[i] = value;
                System.out.println("Wurde gespeichert");
                break;
            }
        }
    }

    @Override
    public String toString() {
        String listeninhalt="";
        for(T a: array) {
            listeninhalt += a + "\n";
        }
        return listeninhalt; 
    }
    
}

