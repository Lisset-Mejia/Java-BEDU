public abstract class metodoPago implements autenticable {
    protected double monto;

    public metodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen() {
        System.out.println("nTipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}