public class Principal {
    public static void main(String[] args) {
        // crear pasajero
        pasajero pasajero = new pasajero("Maria Gonzalez", "P123456");

        // crear vuelo
        vuelo vuelo = new vuelo("UX123", "Madrid", "16:00");

        // reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con exito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // nueva reservacion
        vuelo.reservarAsiento("Mario Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}