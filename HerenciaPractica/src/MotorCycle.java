public class MotorCycle extends Vehicle{

    private String type;

    public MotorCycle(String brand, String model, int velocityMax, String type) {
        super(brand, model, velocityMax);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
