import entities.Students;
import entities.Teacher;
import services.StudentsService;
import services.TeacherServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentsService studentsService = new StudentsService();
        TeacherServices teacherServices = new TeacherServices();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n===== MENÚ ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar todos los estudiantes");
            System.out.println("3. Eliminar estudiante por código");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("5. Registrar profesor");
            System.out.println("6. Listar Profesores Activos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    saveStudent(scanner, studentsService);
                    break;
                case 2:
                    listAllStudents(studentsService);
                    break;

                case 3:
                    deleteStudent(scanner, studentsService);
                    break;

                case 4:
                    calculateAverage(studentsService);
                    break;

                case 5:
                    registerTeacher(scanner, teacherServices);
                    break;
                case 6:
                    listarTeacherActives(teacherServices);
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        scanner.close();
    }



    static void saveStudent(Scanner sc, StudentsService st){
        System.out.print("Ingrese el código: ");
        String code = sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese la nota (0-5): ");
        int note = sc.nextInt();

        Students s = new Students(name, code, note);

        st.saveService(s);
    }

    static void listAllStudents(StudentsService st){
        st.listAll();
    }

    static void deleteStudent(Scanner sc, StudentsService st){
        System.out.print("Ingrese el código: ");
        String code = sc.nextLine();

        if(st.deleteByCode(code)){
            System.out.println("Se Elimino correctamente el Estudiante");
        }else{
            System.out.println("Ocurrio un Error al eliminar el Estudiante");
        }
    }

    static void calculateAverage(StudentsService st){
        System.out.println("El promedio es: "+ st.calculateAverage());
    }

    static void  registerTeacher(Scanner sc, TeacherServices teacherServices){
        System.out.print("Ingrese el código: ");
        int code = sc.nextInt();
        System.out.print("Ingrese el nombre: ");
        String name = sc.next();
        System.out.print("Ingrese el Status: ");
        boolean status = sc.nextBoolean();

        Teacher t = new Teacher(code, name, status);
        teacherServices.register(t);
    }

    static void listarTeacherActives(TeacherServices teacherServices){
        teacherServices.getTeacherActive();
    }

}