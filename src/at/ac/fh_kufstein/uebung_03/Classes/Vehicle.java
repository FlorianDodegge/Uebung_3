
package at.ac.fh_kufstein.uebung_03.Classes;

public class Vehicle {
    
    private short wheels, ps, doors, speed;
    private boolean started;
    private color c;
    
    public enum color {
        BLACK, SILVER, RED, GREY, YELLOW, BLUE;
    }
    
    public void start() {
        setStarted(true);
    }
    
    public void stop() {
        setStarted(false);
    }
    
    public void accelerate(short s) {
        if(started) {
            speed += s;
            if(speed > 250) {
                speed = 250;
            }
        }
    }
    
    public void stop(short s) {
        if(started) {
            speed -= s;
            if(speed < 0) {
                speed = 0;
            }
        }
    }

    public Vehicle(short wheels, short ps, short doors, short speed, color c) {
        this.wheels = wheels;
        this.ps = ps;
        this.doors = doors;
        this.speed = 0;
        this.started = false;
        this.c = c;
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public color getFarbe() {
        return c;
    }

    public void setFarbe(color c) {
        this.c = c;
    }
    
    
    
}
