package defensaqtz2.model;

public class ModuloTierra extends Modulo {

    private String ubicacion;
    private String banda;
    private double capacidadDescarga;
    private double energiaConsumida;

    public ModuloTierra(int id, String nombre, int salud, double costoConstruccion, 
        String ubicacion, String banda, double capacidadDescarga, 
        double energiaConsumida){

        super(id, nombre, salud, costoConstruccion);

        this.ubicacion = ubicacion;
        this.banda = banda;
        this.capacidadDescarga = capacidadDescarga;
        this.energiaConsumida = energiaConsumida;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getBanda() {
        return banda;
    }

    public double getCapacidadDescarga() {
        return capacidadDescarga;
    }

    public double getEnergiaConsumida() {
        return energiaConsumida;
    }

    @Override
    public String procesarCiclo() {
        return getNombre()
                + " descarga " + capacidadDescarga
                + " MB y consume " + energiaConsumida
                + " kWh.";
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Tierra"
                + " | Ubicacion: " + ubicacion
                + " | Banda: " + banda
                + " | Descarga: " + capacidadDescarga + " MB";
    }
}