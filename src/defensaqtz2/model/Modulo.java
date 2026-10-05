package defensaqtz2.model;

public class Modulo implements Comparable<Modulo> {

    private int id;
    private String nombre;
    private int salud;
    private double costoConstruccion;

    public Modulo(int id, String nombre, int salud, double costoConstruccion) {
        if (id <= 0) {
            throw new IllegalArgumentException("el ID debe ser positivo");
        }

        if (salud < 0 || salud > 100) {
            throw new IllegalArgumentException("la salud debe estar entre 0 y 100");
        }

        if (costoConstruccion < 0) {
            throw new IllegalArgumentException("el costo no puede ser negativo");
        }

        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
        this.costoConstruccion = costoConstruccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public double getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        if (salud < 0 || salud > 100) {
            throw new IllegalArgumentException("la salud debe estar entre 0 y 100");
        }

        this.salud = salud;
    }

    public void setCostoConstruccion(double costoConstruccion) {
        if (costoConstruccion < 0) {
            throw new IllegalArgumentException("el costo no puede ser negativo");
        }

        this.costoConstruccion = costoConstruccion;
    }

    public String procesarCiclo() {
        return "el modulo procesa un ciclo";
    }

    @Override
    public int compareTo(Modulo otro) {
        return Double.compare(this.costoConstruccion, otro.costoConstruccion);
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Modulo) {
            Modulo otro = (Modulo) objeto;
            return this.id == otro.id;
        }

        return false;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Salud: " + salud + "%"
                + " | Costo: Q" + costoConstruccion;
    }
}