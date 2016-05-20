package entities;

/**
 * Created by wookie on 5/20/16.
 */
public class Bike extends Model implements Vehicle {
    private boolean wheelchair;

    public Bike() {

    }

    public Bike(String name, String producer, String number, String color, int maxSpeed, boolean wheelchair) {
        super(name, producer, number, color, maxSpeed);
        this.wheelchair = wheelchair;
    }

    public boolean isWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(boolean wheelchair) {
        this.wheelchair = wheelchair;
    }

    @Override
    public void move() {
        System.out.println("Move like bike");
    }

}
