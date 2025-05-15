
public class vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    pasajero asientoReservado;

    public vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // metodo con sobrecarga
    public boolean reservarAsiento(String nombre, String pasaporte) {
        pasajero nuevoPasajero = new pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // metodo sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // metodo que retorna string
    public String obtenerItinerario() {
        String info = "Itinerario de vuelo:\n";
        info += "Codigo: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}