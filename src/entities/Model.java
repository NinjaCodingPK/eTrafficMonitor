package entities;

/**
 * Created by wookie on 5/20/16.
 */
public abstract class Model {
    protected String name;
    protected String producer;
    protected String number;
    protected String color;
    protected int maxSpeed;

    public Model() {

    }

    public Model(String name, String producer, String number, String color, int maxSpeed) {
        this.name = name;
        this.producer = producer;
        this.number = number;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
