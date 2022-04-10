public class MountainBike extends Bicycle{
    public int seatHeight;


    public MountainBike(int gears, int currentSpeed, int startHeight) {

        super(gears, currentSpeed);
        seatHeight = startHeight;
    }


    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
