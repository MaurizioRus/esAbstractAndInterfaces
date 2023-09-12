public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 5, 10000.0);
        Boat boat = new Boat(50.5, 2500);

        System.out.println("Car Details:");
        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("\nBoat Details:");
        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println("\nBoat Weight and Speed:");
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
