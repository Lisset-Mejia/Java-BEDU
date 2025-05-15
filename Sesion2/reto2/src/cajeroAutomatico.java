import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0; // saldo inicial
        int opcion; // almacena la opción del menu

        // repetir el menu mientras no se salgo
        do {
            // mostrar menu
            System.out.println("\n Bienvenido al cajero automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Por favor selecciona una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // consulta saldo
                    System.out.println(" Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    // deposita dinero
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; // volver al menu sin modificar el saldo
                    }

                    saldo += deposito; // aumentar el saldo
                    System.out.println("Deposito realizado. Saldo actual: $" + saldo);
                }
                case 3 -> {
                    // retirar dinero
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; // volver al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo actual es: $" + saldo);
                    } else {
                        saldo -= retiro; // restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
                    // salir
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                }
                default -> {
                    // opción no válida
                    System.out.println("Opcion no valida, intenta nuevamente.");
                }
            }

        } while (opcion != 4); // salir en la opción 4

        scanner.close();
    }
}