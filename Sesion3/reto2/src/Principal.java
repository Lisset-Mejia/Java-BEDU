public class Principal {
    public static void main(String[] args) {
        // factura con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoria", "ABCC010101XYZ");

        // factura sin RFC
        Factura facturaSinRFC = new Factura(1800.0, "Reparacion de equipo", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}