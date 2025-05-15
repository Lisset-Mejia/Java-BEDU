public class unidadBomberos extends unidadEmergencia {
  private sistemaGPS gps;
  private sirena sirena;
  private operador operador;

  public unidadBomberos(String nombre, String nombreOperador) {
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
    System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
  }
}