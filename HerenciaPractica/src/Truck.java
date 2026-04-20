public class Truck extends Vehicle{

    private double capacityCargo;

    public Truck(String brand, String model, int velocityMax, double capacityCargo) {
        super(brand, model, velocityMax);
        this.capacityCargo = capacityCargo;
    }

    public double getCapacityCargo() {
        return capacityCargo;
    }

    public void setCapacityCargo(double capacityCargo) {
        this.capacityCargo = capacityCargo;
    }

}
