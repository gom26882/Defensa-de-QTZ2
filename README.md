# Defensa de QTZ2 

Programa desarrollado en *Java* que simula la administración de diferentes módulos utilizados en la misión del satélite Quetzal-2.

El proyecto utiliza *herencia, polimorfismo, encapsulación, overloading, Comparable y el patrón MVC*.

## Módulos

El programa cuenta con una clase padre llamada Modulo, de la cual heredan tres tipos de módulos:

- ModuloEnergia: representa paneles solares y baterías.
- ModuloVuelo: representa cámaras y sensores utilizados en órbita.
- ModuloTierra: representa antenas y estaciones terrestres.

Cada tipo de módulo sobrescribe el método procesarCiclo(), permitiendo que cada uno realice una acción diferente mediante *polimorfismo por herencia*.

## Funcionalidades

Desde el menú principal el usuario puede:

1. Listar todos los módulos.
2. Buscar un módulo por ID.
3. Buscar módulos por nombre.
4. Ordenar los módulos por costo de construcción.
5. Procesar un ciclo de todos los módulos.
6. Salir del programa.

## Organización del proyecto

El programa utiliza el patrón *MVC (Modelo-Vista-Controlador)*:

text
defensaqtz2/
│
├── Main.java
│
├── model/
│   ├── Modulo.java
│   ├── ModuloEnergia.java
│   ├── ModuloVuelo.java
│   ├── ModuloTierra.java
│   ├── CatalogoModulos.java
│   └── CargaInicial.java
│
├── view/
│   └── ConsolaView.java
│
└── controller/
    └── SimuladorController.java


- *Modelo:* contiene los módulos y la lógica principal del programa.
- *Vista:* muestra el menú y recibe los datos ingresados por el usuario.
- *Controlador:* comunica la vista con el modelo y controla las opciones del menú.
- *Main:* crea los componentes principales e inicia el programa.

## Polimorfismo

Los diferentes módulos heredan de la clase Modulo.

java
public class ModuloEnergia extends Modulo
public class ModuloVuelo extends Modulo
public class ModuloTierra extends Modulo


Todos pueden almacenarse en una misma colección:

java
ArrayList<Modulo> modulos;


Cada clase hija sobrescribe procesarCiclo(). Por esto, al recorrer la lista:

java
for (Modulo modulo : modulos) {
    modulo.procesarCiclo();
}


se ejecuta el comportamiento correspondiente al tipo de módulo.

## Ordenamiento

La clase Modulo implementa Comparable<Modulo> para poder ordenar los módulos según su costo de construcción.

java
public class Modulo implements Comparable<Modulo>


La comparación se realiza mediante compareTo() y posteriormente se utiliza:

java
Collections.sort(modulos);


## Ejecución

Para iniciar el programa se debe ejecutar:

text
Main.java


Al comenzar, el programa carga automáticamente los módulos iniciales y muestra el menú principal en consola.