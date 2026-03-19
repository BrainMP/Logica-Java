package LogicaProgamacion;


import java.util.*;

public class Colecciones {
    public static void main(String[] args) {

        // 1. EL PODER DEL HASHSET (Adiós a los repetidos)
        // Imagina que tienes una lista de invitados donde alguien escribió nombres de más.
        List<String> listaConRepetidos = Arrays.asList("Kobi", "Bobi", "Ato", "Kobi", "Yuji", "Ato");

        // Al pasar la lista a un HashSet, Java borra los duplicados automáticamente
        Set<String> invitadosUnicos = new HashSet<>(listaConRepetidos);

        System.out.println("--- PRUEBA HASHSET ---");
        System.out.println("Lista original: " + listaConRepetidos);
        System.out.println("Lista sin repetidos: " + invitadosUnicos);
        // Nota: ¡El orden puede cambiar! El HashSet no garantiza orden.



        // 2. EL DEQUE (La "Navaja Suiza" de las filas)
        // Usamos ArrayDeque porque es más eficiente que Stack y LinkedList
        Deque<String> filaFlexible = new ArrayDeque<>();

        // Podemos usarlo como COLA (FIFO)
        filaFlexible.addLast("Primero en llegar");
        filaFlexible.addLast("Segundo en llegar");

        // O podemos usarlo como PILA (LIFO) metiendo cosas al principio
        filaFlexible.addFirst("Urgente: Me colé al inicio");

        System.out.println("\n--- PRUEBA DEQUE ---");
        System.out.println("Fila actual: " + filaFlexible);

        System.out.println("Atendiendo (sacando del frente): " + filaFlexible.removeFirst());
        System.out.println("Fila después de atender: " + filaFlexible);



        // 3. LINKEDLIST (Insertar en medio es su especialidad)
        LinkedList<String> cadenaDeNodos = new LinkedList<>(Arrays.asList("Eslabón 1", "Eslabón 2", "Eslabón 4"));

        // Queremos meter el 3 en medio. En un ArrayList sería lento mover a todos.
        // En una LinkedList es solo "soltar manos" y enganchar.
        cadenaDeNodos.add(2, "Eslabón 3");

        System.out.println("\n--- PRUEBA LINKEDLIST ---");
        System.out.println("Cadena completa: " + cadenaDeNodos);


    }
}