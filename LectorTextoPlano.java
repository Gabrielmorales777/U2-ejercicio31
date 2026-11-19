
public class LectorTextoPlano extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {

        System.out.println("\nAbriendo archivo de texto...");

        if (ruta != null && ruta.toLowerCase().endsWith(".txt")) {

            rutaArchivo = ruta;
            archivoAbierto = true;

            System.out.println("Archivo de texto abierto correctamente.");

        } else {

            archivoAbierto = false;
            System.out.println("Error: El archivo no tiene extension TXT.");

        }
    }

    @Override
    public String extraerTexto() {

        if (archivoAbierto) {
            return "Texto extraido del archivo TXT: " + rutaArchivo;
        }

        return "Error: No hay ningun archivo TXT abierto.";
    }
}
