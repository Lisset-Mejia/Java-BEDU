public class MainNarrativa {
    public static void main(String[] args) {
        paqueteNarrativo paquete = new paqueteNarrativo("Inicio del viaje");

        transicionHistoria transicion = new transicionSimple();
        gestorDialogo dialogo = new dialogoTexto();
        logicaDecision decision = new decisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}