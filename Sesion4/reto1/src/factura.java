public class factura {

    // atributos
    private String folio;
    private String cliente;
    private double total;

    // constructor
    public factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // metodo equals() para comparar si dos facturas tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        factura otra = (factura) obj;
        return this.folio.equals(otra.folio); // comparamos el folio
    }

    // metodo hashCode() consistente con equals(), basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
