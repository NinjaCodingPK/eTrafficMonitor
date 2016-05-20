package model;

import entities.*;
/**
 * Created by wookie on 5/20/16.
 */
public class TrafficCounter {
    private Vehicle traffic[];

    public TrafficCounter(Vehicle[] traffic) {
        this.traffic = traffic;
    }

    public int countVehicles() {
        return traffic.length;
    }

    public int countTrucks() {
        int count = 0;

        for(Vehicle t : traffic) {
            if(t instanceof TruckCar)
                count++;
        }

        return count;
    }

    public boolean identifyBike(String name, String number) {
        for(Vehicle t : traffic) {
            if(t instanceof Bike) {
                if((((Bike) t).getProducer().equals(name) && (((Bike) t).getNumber().equals(number))))
                    return true;
            }
        }

        return false;
    }
}
