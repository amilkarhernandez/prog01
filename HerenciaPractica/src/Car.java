public class Car extends Vehicle {
    private int numberDoor;

    public Car(String brand, String model, int velocityMax, int numberDoor) {
        super(brand, model, velocityMax);
        this.numberDoor = numberDoor;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }
}
