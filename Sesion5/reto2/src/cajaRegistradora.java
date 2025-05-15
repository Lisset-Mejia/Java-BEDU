public class cajaRegistradora {
    public static void main(String[] args) {
        metodoPago[] pagos = {
                new pagoEfectivo(150),
                new pagoTarjeta(320, 500),
                new pagoTransferencia(250, false)
        };

        for (metodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo en la autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}