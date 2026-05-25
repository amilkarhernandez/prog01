import java.util.Scanner;

import static utils.Constants.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println(BLUE + "\n╔══════════════════════════════════╗" + RESET);
            System.out.println(BLUE + "║" + BOLD + "       SISTEMA FLUXIOAIR          " + RESET + BLUE + "║" + RESET);
            System.out.println(BLUE + "╠══════════════════════════════════╣" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 1. Registrar pasajero           " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 2. Registrar Vuelos             " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 3. Registrar reservas           " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 4. Cancelar una reserva         " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 5. Buscar Reserva por código    " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 6. Listar Pasajeros             " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + CYAN + " 7. Buscar Reserva por pasajero  " + BLUE + "║" + RESET);
            System.out.println(BLUE + "║ " + YELLOW + " 0. Salir                        " + BLUE + "║" + RESET);
            System.out.println(BLUE + "╚══════════════════════════════════╝" + RESET);
            System.out.print(BOLD + "  >> Seleccione una opcion: " + RESET);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;

                case 0:
                    System.out.println("¡Buena Suerte!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        scanner.close();

    }
}