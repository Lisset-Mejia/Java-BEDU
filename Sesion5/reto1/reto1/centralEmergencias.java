public class centralEmergencias {
    public static void main(String[] args) {
        ambulancia ambulancia = new ambulancia("Ambulancia", "Juan");
        patrulla patrulla = new patrulla("Patrulla", "Laura");
        unidadBomberos bomberos = new unidadBomberos("UnidadBomberos", "Marco");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}