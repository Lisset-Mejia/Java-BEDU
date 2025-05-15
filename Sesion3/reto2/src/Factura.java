import java.util.Optional;

public class Factura {
    // atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Manejo seguro del valor nulo

    // constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // metodo público que devuelve un resumen
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripcion: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si hay RFC se muestra, si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}