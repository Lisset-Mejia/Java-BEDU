public class paqueteNarrativo {
    private String escenaActual;

    public paqueteNarrativo(String escenaActual) {
        this.escenaActual = escenaActual;
    }

    public String getEscenaActual() {
        return escenaActual;
    }

    public void setEscenaActual(String nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}