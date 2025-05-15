public class operador {
    String nombre;

    public operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }
}
