package defensaqtz2.view;

import java.util.ArrayList;
import java.util.Scanner;

import defensaqtz2.model.Modulo;

public class ConsolaView {

    private Scanner scanner;

    public ConsolaView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n----- Defensa quetzal 2 -----");
        System.out.println("1. Listar modulos");
        System.out.println("2. Buscar por ID");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Ordenar por costo");
        System.out.println("5. Procesar ciclo");
        System.out.println("0. Salir");
    }

    public int leerOpcion() {

        while (true) {

            try {
                System.out.print("seleccione una opcion ");
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Ingtrese un numero valido");
            }
        }
    }

    public int leerId() {
        while (true) {

            try {
                System.out.print("ingrese el ID: ");
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("el ID debe ser un número");
            }
        }
    }

    public String leerNombre() {
        System.out.print("ingrese el nombre: ");
        return scanner.nextLine();
    }

    public void mostrarModulo(Modulo modulo) {
        System.out.println(modulo);
    }

    public void mostrarModulos(ArrayList<Modulo> modulos) {

        if (modulos.isEmpty()) {
            System.out.println("no se encontraron los modulos");
        } else {

            for (Modulo modulo : modulos) {
                System.out.println(modulo);
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}