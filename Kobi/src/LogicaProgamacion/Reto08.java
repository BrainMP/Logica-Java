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

public class Reto08 {
    public static void main(String[] args) {

        //Crear, imprimir y modificar usuario
        Usuario usuario1 = new Usuario("Kobi", 1);
        usuario1.mostrarEstado();
        //Modificamos al usuario 1
        usuario1.nombre = "Kobi 07";
        usuario1.nivel = 99;

        usuario1.mostrarEstado();

        //IMPRESION DEL RETO DIFICULTAD EXTRA
        // --- PRUEBA DE LA PILA (LIFO) ---
        System.out.println("\n=== TRABAJANDO CON LA PILA (LIFO) ===");
        Pila miPila = new Pila();

        // USAMOS EL OBJETO 'miPila', NO LA CLASE 'Pila'
        miPila.push("Libro 1");
        miPila.push("Libro 2");
        miPila.push("Libro 3");

        miPila.imprimir();
        System.out.println("Elementos totales: " + miPila.contar());
        System.out.println("Sacando de la pila: " + miPila.pop());
        miPila.imprimir();

        System.out.println("\n=== TRABAJANDO CON LA COLA (FIFO) ===");
        // Corregido: Tipo Cola, objeto miCola
        Cola miCola = new Cola();

        miCola.enqueue("Persona 1");
        miCola.enqueue("Persona 2");
        miCola.enqueue("Persona 3");

        miCola.imprimir();
        System.out.println("Atendiendo en la cola: " + miCola.dequeue());
        miCola.imprimir();

    }
}

// CLASE USAURIO
class Usuario {

    //Atributos
    String nombre;
    int nivel;

    // Inicializador o Constructor
    public Usuario(String nombre, int nivel) {

        this.nombre = nombre;
        this.nivel = nivel;
    }

    //Funcion para imprimir
    public void mostrarEstado() {
        System.out.println("Usuario: " + nombre + " | Nivel: " + nivel);
    }
}

//RETO DIFICULTAD EXTRA
class Pila {
    private List<String> contenido = new ArrayList<>();

    public void push(String item) {
        contenido.add(item);
    }

    public String pop() {
        if (contenido.isEmpty()) return "Pila vacía";
        return contenido.remove(contenido.size() - 1);//Quita el ultimo
    }

    public int contar() {
        return contenido.size();
    }

    public void imprimir() {
        System.out.println("Pila actual " + contenido);
    }
}

class Cola {
    private List<String> contenido = new ArrayList<>();

    public void enqueue(String item) {
        contenido.add(item);
    }

    public String dequeue() {
        if (contenido.isEmpty()) return "Cola vacía";
        return contenido.remove(0);//Quita el primero
    }

    public int contar() {
        return contenido.size();
    }

    public void imprimir() {
        System.out.println("Cola actual " + contenido);
    }
}

