package LogicaProgamacion;
/*
 * EJERCICIO:
 * Explora el concepto de clase y crea un ejemplo que implemente un inicializador,
 * atributos y una función que los imprima (teniendo en cuenta las posibilidades
 * de tu lenguaje).
 * Una vez implementada, créala, establece sus parámetros, modifícalos e imprímelos
 * utilizando su función.
 *
 * DIFICULTAD EXTRA (opcional):
 * Implementa dos clases que representen las estructuras de Pila y Cola (estudiadas
 * en el ejercicio número 7 de la ruta de estudio)
 * - Deben poder inicializarse y disponer de operaciones para añadir, eliminar,
 *   retornar el número de elementos e imprimir todo su contenido.
 */

import java.util.ArrayList;
import java.util.List;

public class Reto09 {
    public static void main(String [] args){
        // Ahora sí, las instancias funcionarán porque las clases están fuera
       /* Perro miPerro = new Perro("Kobi", 3, "Golden Retriever");
        Gato miGato = new Gato("Michi", 2, "Blanco");

        System.out.println("--- PRUEBA DE ANIMALES ---");

        System.out.print(miPerro.nombre + " dice: ");
        miPerro.emitirSonido();

        System.out.print(miGato.nombre + " dice: ");
        miGato.emitirSonido();*/

        //IMPLEMENTACIÓN DE LA DIFICULTAD EXTRA
        List<Empleado> plantilla = new ArrayList<>();

        // Agregamos un empleado
        plantilla.add(new Empleado("Yisus", 6524));

        // Agregamos una lista de programador
        plantilla.add(new Programador("Kobi", 3105, "Java"));

        // Agregamos una lista de lider del proyecto
        plantilla.add(new liderProyecto("Bobi",1234,"Java", 2));

        System.out.println("--- INFORME DE ACTIVIDADES ---");

        // Recorremos la lista con un bucle for-each
        for (Empleado e : plantilla){
            // Aquí ocurre la magia: Java sabe qué método 'realizarTarea' llamar
            e.realizarTarea();
        }
    }

}

// 1. CLASE PADRE
/*class Animal{
    String nombre;
    int edad;

    //Constructores
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void emitirSonido(){
        System.out.println("Es animal hace un sonido cualquiera");
    }
}

// 2. CLASE HIJA (Herencia)
class Perro extends Animal{
    String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza=raza;
    }

    @Override // Esto es Polimorfismo: estamos cambiando el método del padre
    public void emitirSonido() {

        System.out.println("¡Guau! El perro ladra");
    }
}

// --- Mi RETO: Completar la clase Gato ---
class Gato extends Animal{
    String color;

    public Gato(String nombre,int edad, String color){
        super(nombre, edad);
        this.color=color;

    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Miau! El gato maulla");
    }*/

    // DIFICULTAD EXTRA

    // NIVEL 1
    class Empleado{
        String nombres;
        int id;

        public Empleado(String nombres, int id){
            this.nombres=nombres;
            this.id=id;
        }

        public void realizarTarea(){
            System.out.println(nombres + " está cumpliendo su horario");
        }
    }

    // NIVEL 2
    class Programador extends Empleado{
        String lenguaje;

        public Programador(String nombres, int id, String lenguaje){
            super(nombres,id);// Lo hereda de empleado
            this.lenguaje=lenguaje;
        }

        @Override
        public void realizarTarea() {
            System.out.println( nombres+ " está escribiendo código en lenguaje " + lenguaje);
        }
    }

    // NIVEL 3
    class liderProyecto extends Programador{
        int equipos;

        public liderProyecto(String nombres,int id,String lenguaje, int equipos){
            super(nombres,id,lenguaje);
            this.equipos=equipos;
        }

        @Override
        public void realizarTarea() {
            System.out.println(nombres + " cordina "+equipos+" equipos y revisa código  "+lenguaje);
        }
    }

