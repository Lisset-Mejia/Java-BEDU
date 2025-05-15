import java.util.*;

public class registroMuestras {
    public static void main(String[] args) {

        // ArrayList para registrar el orden de las muestras genéticas
        ArrayList<String> muestras = new ArrayList<>();

        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // HashSet para obtener especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\n Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // HashMap para asociar el ID de muestra con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-001", "Dra. Gonalez");
        muestrasInvestigador.put("M-002", "Dr. Dominguez");
        muestrasInvestigador.put("M-003", "Dra. Enriquez");

        System.out.println("\n Asignacion de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // busqueda de investigador por ID
        String idBuscar = "M-002";
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}