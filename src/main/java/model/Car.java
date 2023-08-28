package model;

public class Car {
    private int coast;
    private String name;
    private int speed;

    public Car(int coast, String name, int speed) {
        this.coast = coast;
        this.name = name;
        this.speed = speed;
    }

    public int getCoast() { return coast; }

    public String getName() { return name; }

    public int getSpeed() { return speed; }
}
