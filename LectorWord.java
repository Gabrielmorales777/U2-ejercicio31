
public class LectorWord extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {

        System.out.println("\nAbriendo documento Word...");

        if (ruta != null && ruta.toLowerCase().endsWith(".docx")) {

            rutaArchivo = ruta;
            archivoAbierto = true;

            System.out.println("Archivo Word abierto correctamente.");

        } else {

            archivoAbierto = false;
            System.out.println("Error: El archivo no tiene extension DOCX.");

        }
    }

    @Override
    public String extraerTexto() {

        if (archivoAbierto) {
            return "Texto extraido del documento Word: " + rutaArchivo;
        }

        return "Error: No hay ningun archivo Word abierto.";
    }
}
