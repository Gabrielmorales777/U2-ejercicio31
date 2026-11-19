
public abstract class LectorDocumento {

    protected String rutaArchivo;
    protected boolean archivoAbierto;

    public LectorDocumento() {
        this.archivoAbierto = false;
    }

    public abstract void abrirArchivo(String ruta);

    public abstract String extraerTexto();
}
