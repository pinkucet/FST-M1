public class Car {
        //Instance Variables
        public String color;
        public int make;
        public String transmission;
        public int tyres;
        public int doors;

        //Constructor
        Car() {
            tyres = 4;
            doors = 4;
        }


        public void displayCharacterstics(){
            System.out.println("Color of the Car is: " + color);
            System.out.println("Make of the Car is: " + make);
            System.out.println("Transmission of the Car is: " + transmission);
            System.out.println("Number of doors on the car are: " + doors);
            System.out.println("Number of tyres on the car are: " + tyres);
        }

        public void accelerate() {
            System.out.println("Car is moving ");
        }

        public void brake() {
            System.out.println("Break Applied");
        }
    }

