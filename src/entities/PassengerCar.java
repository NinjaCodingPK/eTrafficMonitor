package entities;

/**
 * Created by wookie on 5/20/16.
 */
public class PassengerCar extends Model implements Car {
    private int maxPassengers;

    public PassengerCar() {

    }

    public PassengerCar(String name, String producer, String number, String color, int maxSpeed, int maxPassengers) {
        super(name, producer, number, color, maxSpeed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void move() {
        System.out.println("Move like passenger car");
    }


    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
