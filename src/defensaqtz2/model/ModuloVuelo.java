package defensaqtz2.model;

public class ModuloVuelo extends Modulo {

    private String instrumento;
    private double datosGenerados;
    private double energiaConsumida;

    public ModuloVuelo(int id, String nombre, int salud, double costoConstruccion, 
        String instrumento, double datosGenerados, double energiaConsumida) {

        super(id, nombre, salud, costoConstruccion);

        this.instrumento = instrumento;
        this.datosGenerados = datosGenerados;
        this.energiaConsumida = energiaConsumida;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public double getDatosGenerados() {
        return datosGenerados;
    }

    public double getEnergiaConsumida() {
        return energiaConsumida;
    }

    @Override
    public String procesarCiclo() {
        return getNombre()
                + " recolecta " + datosGenerados
                + " MB y consume " + energiaConsumida
                + " kWh.";
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Vuelo"
                + " | Instrumento: " + instrumento
                + " | Datos: " + datosGenerados + " MB"
                + " | Consumo: " + energiaConsumida + " kWh";
    }
}