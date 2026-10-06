package defensaqtz2.model;

public class ModuloEnergia extends Modulo {

    private String tipoEnergia;
    private double energiaGenerada;

    public ModuloEnergia(int id, String nombre, int salud, double costoConstruccion,
        String tipoEnergia, double energiaGenerada) {

        super(id, nombre, salud, costoConstruccion);

        this.tipoEnergia = tipoEnergia;
        this.energiaGenerada = energiaGenerada;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public double getEnergiaGenerada() {
        return energiaGenerada;
    }

    @Override
    public String procesarCiclo() {
        return getNombre() + " genera " + energiaGenerada + " kWh de energia.";
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Energia"
                + " | Fuente: " + tipoEnergia
                + " | Generacion: " + energiaGenerada + " kWh";
    }
}