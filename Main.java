package com.metanit;

interface Vehicle {
    void go();
}
class Automobile implements Vehicle {
    public void go() {
        System.out.println("Automobile go!");
    }
}
class Truck implements Vehicle {
    public Truck(int i) {
        super();
    }
    public void go() {
        System.out.println("Truck go!");
    }
}
public class VehicleStarter {
    public static void main(String[] args) {
        Vehicle vehicle;
        try {
            System.out.println ("look for class for: " + "demo.lang.Automobile");
            Class<?> aClass;
            aClass = Class.forName ("demo.lang.Automobile");
            System.out.println ("creating vehicle...");
            vehicle = (Vehicle) aClass.newInstance ();
            System.out.println ("create vehicle: " + vehicle.getClass ());
            vehicle.go ();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println ("Exception: " + e);
        }
        try {
            System.out.println ("look for class for: " + "demo.lang.Truck");
            Class<?> aClass;
            aClass = Class.forName ("demo.lang.Truck");
            System.out.println ("creating vehicle...");
            vehicle = (Vehicle) aClass.newInstance ();
            System.out.println ("create vehicle: " + vehicle.getClass ());
            vehicle.go ();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println ("Exception: " + e);
        }
        try {
            System.out.println ("look for class for: " + "demo.lang.Tank");
            Class<?> aClass;
            aClass = Class.forName ("demo.lang.Tank");
            System.out.println ("creating vehicle...");
            vehicle = (Vehicle) aClass.newInstance ();
            System.out.println ("create vehicle: " + vehicle.getClass ());
            vehicle.go ();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println ("Exception: " + e);
        }
    }
}