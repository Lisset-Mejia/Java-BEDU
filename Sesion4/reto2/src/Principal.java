public class Principal {
    public static void main(String[] args) {

        // declaracion de impuestos
        declaracionImpuestos declaracion = new declaracionImpuestos("XAXX100101000", 8700);

        // cuenta fiscal
        cuentaFiscal cuenta = new cuentaFiscal("XAXX100101000", 9500);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // validamos si el RFC es valido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}