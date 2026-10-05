package defensaqtz2.controller;

import java.util.ArrayList;

import defensaqtz2.model.CatalogoModulos;
import defensaqtz2.model.Modulo;
import defensaqtz2.view.ConsolaView;

public class SimuladorController {

    private CatalogoModulos modelo;
    private ConsolaView vista;

    public SimuladorController(CatalogoModulos modelo, ConsolaView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        int opcion;

        do {

            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    vista.mostrarModulos(modelo.getModulos());
                    break;
                case 2:
                    buscarPorId();
                    break;
                case 3:
                    buscarPorNombre();
                    break;
                case 4:
                    modelo.ordenarPorCosto();
                    vista.mostrarMensaje("Modulos ordenados por costo.");
                    vista.mostrarModulos(modelo.getModulos());
                    break;
                case 5:
                    procesarCiclo();
                    break;
                case 0:
                    vista.mostrarMensaje("Programa finalizado.");
                    break;
                default:
                    vista.mostrarMensaje("Opcion invalida.");
            }

        } while (opcion != 0);
    }

    private void buscarPorId() {

        int id = vista.leerId();

        Modulo modulo = modelo.buscarModulo(id);

        if (modulo != null) {
            vista.mostrarModulo(modulo);
        } else {
            vista.mostrarMensaje("No hay modulos con ese ID");
        }
    }

    private void buscarPorNombre() {

        String nombre = vista.leerNombre();
        ArrayList<Modulo> encontrados = modelo.buscarModulo(nombre);

        vista.mostrarModulos(encontrados);
    }

    private void procesarCiclo() {

        ArrayList<String> resultados = modelo.procesarCiclo();

        for (String resultado : resultados) {
            vista.mostrarMensaje(resultado);
        }
    }
}