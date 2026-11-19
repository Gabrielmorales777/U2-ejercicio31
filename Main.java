
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> archivos = new ArrayList<>();

        archivos.add("informe.pdf");
        archivos.add("contrato.docx");
        archivos.add("notas.txt");

        List<LectorDocumento> lectores = new ArrayList<>();

        lectores.add(new LectorPDF());
        lectores.add(new LectorWord());
        lectores.add(new LectorTextoPlano());

        System.out.println("==================================");
        System.out.println("    SISTEMA DE LECTURA DIGITAL");
        System.out.println("==================================");

        for (int i = 0; i < lectores.size(); i++) {

            LectorDocumento lector = lectores.get(i);
            String archivo = archivos.get(i);

            lector.abrirArchivo(archivo);

            System.out.println(lector.extraerTexto());

            System.out.println("----------------------------------");
        }

        System.out.println("\n=== PRUEBA DE VALIDACION ===");

        LectorDocumento lectorPDF = new LectorPDF();

        lectorPDF.abrirArchivo("documento.txt");

        System.out.println(lectorPDF.extraerTexto());
    }
}

