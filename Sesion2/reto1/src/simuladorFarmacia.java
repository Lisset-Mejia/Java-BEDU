import java.util.Scanner;

public class simuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitar datos
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // total
        double totalSinDescuento = precioUnitario * cantidad;

        // evaluar si aplica descuento
        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // total
        double totalConDescuento = totalSinDescuento - descuento;

        // mostrar resumen
        System.out.println("\n Resumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}