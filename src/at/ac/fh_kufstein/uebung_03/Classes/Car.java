
package at.ac.fh_kufstein.uebung_03.Classes;

public class Car extends Vehicle {
    
    private boolean aircondition;
    private short airbag;
    
    public void startAircondition() {
        
        if(!aircondition) {
            setAircondition(true);
        }
        else {
            System.err.println("Klimaanlage läuft bereits!");
        }
    }
    
    public void stopAircondition() {
        
        if(aircondition) {
            setAircondition(false);
        }
        else {
            System.err.println("Klimaanlage ist bereits aus!");
        }
    }
    
    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h";
    }

    public Car(short airbag, short wheels, short ps, short doors, short speed, color c) {
        super(wheels, ps, doors, speed, c);
        this.aircondition = false;
        this.airbag = airbag;
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
    
}
