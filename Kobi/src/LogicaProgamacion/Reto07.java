package LogicaProgamacion;

import java.util.*;

/*
 * EJERCICIO:
 * Implementa los mecanismos de introducción y recuperación de elementos propios de las
 * pilas (stacks - LIFO) y las colas (queue - FIFO) utilizando una estructura de array
 * o lista (dependiendo de las posibilidades de tu lenguaje).
 *
 * DIFICULTAD EXTRA (opcional):
 * - Utilizando la implementación de pila y cadenas de texto, simula el mecanismo adelante/atrás
 *   de un navegador web. Crea un programa en el que puedas navegar a una página o indicarle
 *   que te quieres desplazar adelante o atrás, mostrando en cada caso el nombre de la web.
 *   Las palabras "adelante", "atrás" desencadenan esta acción, el resto se interpreta como
 *   el nombre de una nueva web.
 * - Utilizando la implementación de cola y cadenas de texto, simula el mecanismo de una
 *   impresora compartida que recibe documentos y los imprime cuando así se le indica.
 *   La palabra "imprimir" imprime un elemento de la cola, el resto de palabras se
 *   interpretan como nombres de documentos.
 */
public class Reto07 {
    public static void main(String[] args) {

        //Scanner es la clase que con System.in lee todo lo que se escribe
        Scanner scanner = new Scanner(System.in);

        //PILA O LIFO
        List<String> pila = new ArrayList<>();
        pila.add("Número 1");
        pila.add("Número 2");
        //Lógica para recuperar (LIFO)
        String ultimo = pila.remove(pila.size() - 1);
        // Hago un print haber que sale
        System.out.println(ultimo);

        //FILA-COLA O FIFO
        List<String> fila = new ArrayList<>();
        fila.add("Paciente 1");
        fila.add("Pacinete 2");
        //Lógica para recuperar (FIFO)
        String primero = fila.remove(0);
        //Hago un  print para ver el resultado, esto es un poco diferente al de LIFO
        System.out.println(fila);

        // RESULTADOS DEL RETO 07 DE DIFICULTAD EXTRA

        // Simulación de Pila (Navegador)
        //navegador(scanner);

        // Simulación de Cola (Impresora)
        //impresora(scanner);

        // CASO DE COLA Y FILA DIRECTAMENTE SIN EL MENU INTERACTIVO
        // Ejemplo simple de Pila
        Stack<Integer> miPila = new Stack<>();
        miPila.push(10); // Introducir
        miPila.push(20);
        System.out.println("Saco de la pila (LIFO): " + miPila.pop()); // Recupera el 20

// Ejemplo simple de Cola
        Queue<Integer> miCola = new LinkedList<>();
        miCola.add(10); // Introducir
        miCola.add(20);
        System.out.println("Saco de la cola (FIFO): " + miCola.poll()); // Recupera el 10
    }

    public static void navegador(Scanner scanner) {
        Stack<String> historial = new Stack<>();
        String paginaActual = "Inicio";

        while (true) {
            System.out.println("\n Estas en la pagina " + paginaActual);
            System.out.println("Nueva web / 'atras' / 'salir': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            if (input.equalsIgnoreCase("atras")) {
                if (!historial.isEmpty()) {
                    paginaActual = historial.pop(); // Saca el ultimo LIFO
                } else {
                    System.out.println("No hay historial. ");
                }
            } else {
                historial.push(paginaActual); // Guarda la actual antes de ir a la nueva
                paginaActual = input;
            }
        }
    }

    public static void impresora(Scanner scanner) {
        Queue<String> colaImpresora = new LinkedList<>();

        while (true) {
            System.out.println("\n Doc / 'imprimir' / 'salir': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            if (input.equalsIgnoreCase("imprimir")) {
                if (!colaImpresora.isEmpty()) {
                    //Saca el primero que entro FIFO
                    System.out.println("Imprimiendo " + colaImpresora.poll());
                } else {
                    System.out.println("Cola vacía");
                }
            } else {
                colaImpresora.add(input);
            }
        }
    }


}
