public class Activity6 {
    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);
        plane.onboard("Jack");
        plane.onboard("Ram");
        plane.onboard("Hina");
        plane.onboard("Juli");

        System.out.println("Plane took off time: " + plane.takeOff());
        System.out.println("People on the plane are: " + plane.getPassengers());
        Thread.sleep(3000);
        plane.land();
        //Plane lands
        System.out.println("Plane landed at time : " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing are : " + plane.getPassengers());
    }
}
