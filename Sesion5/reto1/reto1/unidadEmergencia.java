public abstract class unidadEmergencia {
    String nombre;

    public unidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }

    public abstract void responder();
}

