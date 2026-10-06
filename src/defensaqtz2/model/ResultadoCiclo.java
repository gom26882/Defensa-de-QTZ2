package defensaqtz2.model;

public final class ResultadoCiclo {

    private final int moduloId;
    private final String moduloNombre;
    private final String mensaje;

    public ResultadoCiclo(int moduloId, String moduloNombre, String mensaje) {
        this.moduloId = moduloId;
        this.moduloNombre = moduloNombre;
        this.mensaje = mensaje;
    }

    public int getModuloId() {
        return moduloId;
    }

    public String getModuloNombre() {
        return moduloNombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return String.format("[%d - %s] %s", moduloId, moduloNombre, mensaje);
    }
}

