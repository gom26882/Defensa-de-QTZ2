package defensaqtz2.model;

public class CargaInicial {

    public static CatalogoModulos crearMisionEnProgreso() {

        CatalogoModulos catalogo = new CatalogoModulos();

        catalogo.agregarModulo(
                new ModuloEnergia(101, "Panel Solar Aurora",
                        92, 125000, "Panel Solar", 24));

        catalogo.agregarModulo(
                new ModuloEnergia(102, "Bateria Maya",
                        87, 98000, "Bateria", 12));

        catalogo.agregarModulo(
                new ModuloEnergia(103, "Panel Solar Quetzal",
                        100, 150000, "Panel Solar", 30));

        catalogo.agregarModulo(
                new ModuloEnergia(104, "Bateria Eclipse",
                        76, 110000, "Bateria", 15));


        catalogo.agregarModulo(
                new ModuloVuelo(201, "Camara Ixchel",
                        95, 230000,
                        "Camara multiespectral", 18, 8));

        catalogo.agregarModulo(
                new ModuloVuelo(202, "Magnetometro Tikal",
                        88, 175000,
                        "Magnetometro", 12, 5));

        catalogo.agregarModulo(
                new ModuloVuelo(203, "Sensor Balam",
                        78, 195000,
                        "Dosimetro", 14, 6));

        catalogo.agregarModulo(
                new ModuloVuelo(204, "Camara Ceiba",
                        100, 250000,
                        "Camara atmosferica", 22, 10));


        catalogo.agregarModulo(
                new ModuloTierra(301, "Antena UVG Norte",
                        91, 320000,
                        "Campus Central UVG", "X", 40, 12));

        catalogo.agregarModulo(
                new ModuloTierra(302, "Antena Altiplano",
                        84, 285000,
                        "Quetzaltenango", "S", 32, 10));

        catalogo.agregarModulo(
                new ModuloTierra(303, "Estacion Peten",
                        73, 260000,
                        "Flores, Peten", "UHF", 28, 9));

        catalogo.agregarModulo(
                new ModuloTierra(304, "Antena Reserva Central",
                        96, 350000,
                        "Campus Central UVG", "X", 45, 14));

        return catalogo;
    }
}