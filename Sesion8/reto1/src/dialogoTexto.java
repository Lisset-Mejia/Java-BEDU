public class dialogoTexto implements gestorDialogo {
    public void mostrarDialogo(paqueteNarrativo paquete) {
        System.out.println("🎙️ Escena actual: " + paquete.getEscenaActual());
        System.out.println("Una figura misteriosa aparece y te ofrece dos caminos...");
    }
}
