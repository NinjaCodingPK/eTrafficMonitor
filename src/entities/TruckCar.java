package entities;

/**
 * Created by wookie on 5/20/16.
 */
public class TruckCar extends Model implements Car {
    private int maxCapacity;

    public TruckCar() {

    }

    public TruckCar(String name, String producer, String number, String color, int maxSpeed, int maxCapacity) {
        super(name, producer, number, color, maxSpeed);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void move() {
        System.out.println("Move like truck");
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

}
