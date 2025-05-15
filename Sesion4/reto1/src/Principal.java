public class Principal {
    public static void main(String[] args) {

        // facturas con el mismo folio
        factura f1 = new factura("FAC001", "Juan Pérez", 1450);
        factura f2 = new factura("FAC001", "Comercial XYZ", 1450);

        System.out.println(f1);
        System.out.println(f2);

        // comparamos si son iguales
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}