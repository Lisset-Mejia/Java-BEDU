public class pagoTransferencia extends metodoPago {
    private boolean validadoExternamente;

    public pagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}