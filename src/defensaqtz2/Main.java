package defensaqtz2;

import defensaqtz2.controller.SimuladorController;
import defensaqtz2.model.CargaInicial;
import defensaqtz2.model.CatalogoModulos;
import defensaqtz2.view.ConsolaView;

public class Main {

    public static void main(String[] args) {

        try {

            CatalogoModulos modelo =
                    CargaInicial.crearMisionEnProgreso();

            ConsolaView vista =
                    new ConsolaView();

            SimuladorController controlador =
                    new SimuladorController(modelo, vista);

            controlador.iniciar();

        } catch (Exception e) {

            System.out.println(
                    "Ocurrio un error: " + e.getMessage()
            );
        }
    }
}