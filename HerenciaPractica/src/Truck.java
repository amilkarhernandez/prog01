public class Truck extends Vehicle{

    private double capacityCargo;

    public Truck(String brand, String model, int velocityMax) {
        super(brand, model, velocityMax);
    }

    public double getCapacityCargo() {
        return capacityCargo;
    }

    public void setCapacityCargo(double capacityCargo) {
        this.capacityCargo = capacityCargo;
    }

}
