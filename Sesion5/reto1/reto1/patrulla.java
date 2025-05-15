
public class patrulla extends unidadEmergencia {
    private sistemaGPS gps;
    private sirena sirena;
    private operador operador;

    public patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new sistemaGPS();
        this.sirena = new sirena();
        this.operador = new operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
    }
}

