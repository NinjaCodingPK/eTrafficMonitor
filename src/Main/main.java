package Main;

import entities.*;

import model.TrafficCounter;
import java.util.ArrayList;

/**
 * Created by wookie on 5/20/16.
 */
public class main {
    public static void main(String[] args) {
        Vehicle[] traffic = {new Bike("Y", "YAMAHA", "СА 234-34 В", "Red", 120, false),
                            new TruckCar("some", "no matter", "also000", "Red", 60, 100),
                            new PassengerCar("Impreza", "Subaru", "AA001-A", "Blue", 200, 4),
                            new TruckCar("some", "no matter", "also000", "Red", 60, 100),
                            new TruckCar("some", "no matter", "also000", "Red", 60, 100)};

        TrafficCounter counter = new TrafficCounter(traffic);
        System.out.println("Vehicles: " + counter.countVehicles());
        System.out.println("Trucks: " + counter.countTrucks());
        System.out.println("Identify Bike: " + counter.identifyBike("YAMAHA", "СА 234-34 В"));
    }
}
