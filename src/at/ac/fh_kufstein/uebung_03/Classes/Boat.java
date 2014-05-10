
package at.ac.fh_kufstein.uebung_03.Classes;

public class Boat extends Vehicle {
    
    private double draft, cargo;
    private short propeller;
    
    public void unload() throws InterruptedException {
        Thread.sleep(5000);
        setCargo(0);
    }

    public Boat(double draft, double cargo, short propeller, short wheels, short ps, short doors, short speed, color c) {
        super(wheels, ps, doors, speed, c);
        this.draft = draft;
        this.cargo = cargo;
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + this.getPs() + " PS und einen Tiefgang von " + getDraft();
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }
    
    
}
