import java.util.Objects;

public class cuentaFiscal {

    private final String rfc;
    private double saldoDisponible;

    // constructor con validacion
    public cuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo; Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // metodo que valida si el RFC coincide con el de la cuenta
    public boolean validarRFC(declaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // metodo para mostrar información de la cuenta
    public void mostrarCuenta() {
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}