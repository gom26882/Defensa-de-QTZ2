package defensaqtz2.model;

import java.util.ArrayList;
import java.util.Collections;

public class CatalogoModulos {

    private ArrayList<Modulo> modulos;

    public CatalogoModulos() {
        modulos = new ArrayList<Modulo>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public Modulo buscarModulo(int id) {
        for (Modulo modulo : modulos) {
            if (modulo.getId() == id) {
                return modulo;
            }
        }

        return null;
    }

    public ArrayList<Modulo> buscarModulo(String nombre) {

        ArrayList<Modulo> encontrados = new ArrayList<Modulo>();
        
        for (Modulo modulo : modulos) {
            if (modulo.getNombre().toLowerCase().contains(nombre.toLowerCase())) {

                encontrados.add(modulo);
            }
        }

        return encontrados;
    }

    public void ordenarPorCosto() {
        Collections.sort(modulos);
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public ArrayList<String> procesarCiclo() {

        ArrayList<String> resultados = new ArrayList<String>();

        for (Modulo modulo : modulos) {
            resultados.add(modulo.procesarCiclo());
        }

        return resultados;
    }
}