public class Car extends Vehicle {
    private int numberDoor;

    public Car(String brand, String model, int velocityMax) {
        super(brand, model, velocityMax);
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }
}
