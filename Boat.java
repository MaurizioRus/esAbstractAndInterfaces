class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat makes splash");
    }

    public String getBoatWeightAndSpeed() {
        return "Total Kg : " + boatKilosWeight + " kg\nMaximum Knots Speed: " + maxKnotsSpeed + " knots";
    }
}