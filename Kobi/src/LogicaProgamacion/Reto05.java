package LogicaProgamacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */
public class Reto05 {

    public static void main(String [] args){

        // 1. ASIGNACIÓN POR VALOR (Tipos Primitivos)
        // Imagina que esto es una fotocopia.
        int b= 10;
        int c= b; // C recibe el valor de b
         c= 20; // Se cambia, modifica el valor de c
        //Imprimir
        System.out.println("Se imprimen los resultados");
        System.out.println("Este es el valor orignal de b  " + b); // Valor original de b que es de 10
        System.out.println("Este es el valor de c osea la copia " + c); // Valor modificado de la copia osea c imprime el valor de 20

        // 2. ASIGNACIÓN POR REFERENCIA (Objetos)
        // Imagina que esto es dar la llave de tu casa.
        List<String> listaK = new ArrayList<>();
        listaK.add("Original");

        List<String> listT = listaK;
        listT.add("Modificado");

        // Imprimir
        System.out.println("\nAsignación por Referencia:");
        System.out.println(listaK); // Se va a mostrar la modificacion
        System.out.println(listT); // Esta es la modifcacion

        // --- PRUEBA DE FUNCIONES ---
        System.out.println("\n--- Funciones ---");



        // DIFICULTAD EXTRA
        System.out.println("\n DIFICULTAD EXTRA");

        int x = 100 , y =200;
        int[] resultadoValor = swapValor(x,y);
        int nuevoX = resultadoValor[0];
        int nuevoy = resultadoValor[1];
        System.out.println("Originales: x " +x +" , y "+y);
        System.out.println("Nuevos: nuevosX "+nuevoX +" , nuevosY "+ nuevoy);

        List<Integer> listaX = new ArrayList<>(Arrays.asList(1));
        List<Integer> listaY = new ArrayList<>(Arrays.asList(2));

        // Para intercambiar objetos y que se vea el efecto, devolvemos una lista de listas
        List<List<Integer>> resultadoRef = swapReferencia(listaX,listaY);
        List<Integer> nuevaListaX = resultadoRef.get(0);
        List<Integer> nuevaListaY = resultadoRef.get(1);

        System.out.println("\n Originales RefLista: listaX "+listaX +" listaY "+ listaY);
        System.out.println("Nuevas Ref: nuevaListaX " +nuevaListaX+ ", nuevalistaY "+nuevaListaY);


    }

// --- MÉTODOS AUXILIARES ---

    // Esta función recibe una copia (Valor)
    public static void modificarValor(int n){
        n = 1000; //Solo cambia la copia dentro de la funcion
    }

    // Esta función recibe la dirección de memoria (Referencia)
    public static void modificarReferencia(List<Integer> lista){

        lista.add(98);// Accede a la lista original y le añade un dato.
    }

    // Dificultad Extra: Intercambio por Valor
    public static int[] swapValor(int a , int b){

        int temp = a;
         a =b;
        b= temp;
        return new int[]{a,b};//Devolvemos los nuevos valores en un array
    }
    // Dificultad Extra: Intercambio por Referencia
    public static List<List<Integer>> swapReferencia(List<Integer> a, List<Integer> b){
        // En Java, los parámetros se pasan por valor de la referencia.
        // Para el "intercambio" según el ejercicio, creamos nuevas variables.
        List<Integer>temp = a;
        a =b;
        b= temp;

        List<List<Integer>> resultado = new ArrayList<>();
        resultado.add(a);
        resultado.add(b);
        return resultado;

    }
}
