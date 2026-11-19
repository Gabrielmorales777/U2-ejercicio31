
public class LectorPDF extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {

        System.out.println("\nAbriendo documento PDF...");

        if (ruta != null && ruta.toLowerCase().endsWith(".pdf")) {

            rutaArchivo = ruta;
            archivoAbierto = true;

            System.out.println("Archivo PDF abierto correctamente.");

        } else {

            archivoAbierto = false;
            System.out.println("Error: El archivo no tiene extension PDF.");

        }
    }

    @Override
    public String extraerTexto() {

        if (archivoAbierto) {
            return "Texto extraido del documento PDF: " + rutaArchivo;
        }

        return "Error: No hay ningun archivo PDF abierto.";
    }
}
