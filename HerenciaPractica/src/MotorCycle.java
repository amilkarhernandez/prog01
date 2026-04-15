public class MotorCycle extends Vehicle{

    private String type;

    public MotorCycle(String brand, String model, int velocityMax) {
        super(brand, model, velocityMax);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
