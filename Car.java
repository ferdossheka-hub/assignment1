import java.awt.*;

public abstract class Car implements Movable {
    private final int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private  Color color; // Color of the car
    public String modelName; // The car model name

    private double x;
    private double  y;

    private String direction = "UP";

    @Override
    public void move(){
        if (direction.equals ("UP")) {
            y += currentSpeed;
        }
        else if (direction.equals ("DOWN")){
            x +=currentSpeed;
        }
        else if (direction.equals ("RIGHT")) {
            x -= currentSpeed;
        }
        else if (direction.equals ("LEFT")) {
        x -= currentSpeed;
        }
    }

    @Override
    public void turnLeft() {
        if (direction.equals ("UP")) {
            direction = "LEFT";
        }
        else if (direction.equals ("LEFT")) {
           direction = "DOWN";
        }
        else if (direction.equals("DOWN")){
            direction = "Right";
        }
        else if (direction.equals("Right")){
            direction = "UP";
        }

    }

    @Override
    public void turnRight() {

    }


    public Car(int nrDoors, double enginePower, Color color, String modelName)
    {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this. color = color;
        this. modelName = modelName;
        stopEngine();

        this.x = 0;
        this.y= 0;
        this.direction = "North";
    }
    public int getNrDoors() {return nrDoors;}
    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }


    public abstract double speedFactor();



}
