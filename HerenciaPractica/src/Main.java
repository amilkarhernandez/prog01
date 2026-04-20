import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> listVehicles = new ArrayList<>();

        listVehicles.add(new Car("Chevrolet", "2020", 230, 5));
        listVehicles.add(new MotorCycle("Honda", "2021", 150, "Deportiva"));
        listVehicles.add(new Truck("Foton", "2026", 120, 200.00));


        for(Vehicle v: listVehicles){
            System.out.println("Marca: "+v.getBrand());
        }
    }
}