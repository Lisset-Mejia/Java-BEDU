import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class planeacionEducativa {
    public static void main(String[] args) {

        // lista concurrente de temas usando CopyOnWriteArrayList
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matematicas basicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // ordenamos los temas usando Comparable
        Collections.sort(temas);
        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // ordenamos los temas por prioridad usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\n Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // creamos un mapa concurrente de recursos usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        System.out.println("\n Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}