import entities.Students;
import services.StudentsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando La paridera");

        StudentsService studentsService = new StudentsService();

        System.out.println("Ingrese Codigo: ");
        String code = sc.next();

        System.out.println("Ingrese Nombre: ");
        String name = sc.next();

        System.out.println("Ingrese Nota: ");
        int note = sc.nextInt();

        Students students = new Students(name, code, note);

        studentsService.saveService(students);

        System.out.println("Guardando---- >");

        System.out.println("------------------------");
        System.out.println("Datos Guardados");
        System.out.println("-------------------------");
        for (Students s: studentsService.listAllServices()){
            System.out.println(s);
        }
    }
}