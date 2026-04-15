public class Vehicle {

    private String brand;
    private String model;
    private int velocityMax;

    public Vehicle(String brand, String model, int velocityMax) {
        this.brand = brand;
        this.model = model;
        this.velocityMax = velocityMax;
    }

    public void showInformation(){
        System.out.println("Marca: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Velocidad Maxima: " + velocityMax);
    }

    public double calculateConsumeGas(){
        return 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(int velocityMax) {
        this.velocityMax = velocityMax;
    }
}
