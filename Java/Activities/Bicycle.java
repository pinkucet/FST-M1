public class Bicycle implements BicycleParts,BicycleOperations{
    public int gears;
    public int currentSpeed;

    //initialising gear and current speed by constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }


    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Speed after Decrement Gear: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Speed after Increment Gear: " + currentSpeed);
    }


    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
