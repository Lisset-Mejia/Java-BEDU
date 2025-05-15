public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de BEDU", 800);
        Entrada entrada2 = new Entrada("Obra de Teatro de BEDU", 450);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_Record entrada3 = new Entrada_Record("Sinfonica de BEDU", 1200);
        entrada3.mostrarInformacion();
    }
}