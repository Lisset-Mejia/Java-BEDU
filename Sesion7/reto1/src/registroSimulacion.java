import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class registroSimulacion {

    public static void main(String[] args) {
        // definir la ruta del archivo parametros.txt dentro de la carpeta config/
        Path rutaCarpeta = Paths.get("./config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        // crear un String con los parámetros
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        try {
            // crear la carpeta si no existe
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta 'config' creada.");
            }

            // escribir el contenido en el archivo
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            // validar si el archivo fue creado
            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}