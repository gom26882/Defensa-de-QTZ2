package defensaqtz2.model;

public final class EstadoMision {

    private final double capacidadEnergia;
    private double energiaDisponible;
    private double datosPendientes;
    private double datosDescargados;
    private int cicloActual;

    public EstadoMision(double capacidadEnergia, double energiaDisponible,
                        double datosPendientes, double datosDescargados) {
        if (capacidadEnergia <= 0) {
            throw new IllegalArgumentException("la energia no puede ser negativa");
        }
        if (energiaDisponible < 0 || energiaDisponible > capacidadEnergia
                || datosPendientes < 0 || datosDescargados < 0) {
            throw new IllegalArgumentException("recursos invalidos");
        }
        this.capacidadEnergia = capacidadEnergia;
        this.energiaDisponible = energiaDisponible;
        this.datosPendientes = datosPendientes;
        this.datosDescargados = datosDescargados;
    }

    public void iniciarNuevoCiclo() {
        cicloActual++;
    }

    public double agregarEnergia(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("la energia no puede ser negativa");
        }

        double energiaAnterior = energiaDisponible;
        energiaDisponible = Math.min(capacidadEnergia, energiaDisponible + cantidad);
        return energiaDisponible - energiaAnterior;
    }

    public boolean consumirEnergia(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("la energia consumida no puede ser negativa");
        }
        if (energiaDisponible + 0.000001 < cantidad) {
            return false;
        }
        energiaDisponible -= cantidad;
        return true;
    }

    public void registrarDatos(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("los datos no pueden ser negativos");
        }

        datosPendientes += cantidad;
    }

    public double descargarDatos(double cantidadMaxima) {
        if (cantidadMaxima < 0) {
            throw new IllegalArgumentException("la descarga no puede ser negativa");
        }
        
        double cantidadReal = Math.min(cantidadMaxima, datosPendientes);
        datosPendientes -= cantidadReal;
        datosDescargados += cantidadReal;
        return cantidadReal;
    }

    public double getCapacidadEnergia() {
        return capacidadEnergia;
    }

    public double getEnergiaDisponible() {
        return energiaDisponible;
    }

    public double getDatosPendientes() {
        return datosPendientes;
    }

    public double getDatosDescargados() {
        return datosDescargados;
    }

    public int getCicloActual() {
        return cicloActual;
    }

    @Override
    public String toString() {
        return String.format(
                "Ciclo: %d | Energia: %.2f/%.2f kWh | Datos pendientes: %.2f MB"
                        + " | Datos descargados: %.2f MB",
                cicloActual, energiaDisponible, capacidadEnergia,
                datosPendientes, datosDescargados);
    }
}

