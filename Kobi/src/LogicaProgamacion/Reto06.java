package LogicaProgamacion;

import javax.xml.transform.sax.SAXSource;

/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la
 *   sucesión de Fibonacci (la función recibe la posición).
 */
public class Reto06 {

    public static void main(String[] args) {

        //IMPRESION DEL 100 AL 0
        System.out.println("Imprimos los números del 100 al 0");
        imprimirNumeros(100);

        //IMPRESION DEL RESULTADO FACTORIAL
        int numFactorial = 5;
        System.out.println("\n FACTORIAL RECURSIVO");
        System.out.println("El factorial del numero "+ numFactorial + " es: "+factorial(numFactorial));

        //IMPRESION DEL RESULTADO FACTORIAL
        int numFibonacci = 7;
        System.out.println("\n FIBONACCI RECURSIVO");
        System.out.println("El fibonacci del numero"+numFibonacci+ " es: "+ fibonacci(numFibonacci));

    }


    public static void imprimirNumeros(int n) {
        // 1. CASO BASE: Si n es menor a 0, nos salimos.
        // Sin esto, el programa intentaría imprimir números negativos infinitamente.
        if (n < 0) {
            return;
        }
        //ACCION: Imprimimos el numero actual
        System.out.println(n);

        // 3. LLAMADA RECURSIVA: La función se llama a sí misma con (n - 1)
        imprimirNumeros(n - 1);

    }


    public static int factorial(int numero) {
        // CASO BASE: El factorial de 0 o 1 es 1.
        if (numero == 0 || numero == 1){
            return 1;
        }

        return numero * factorial(numero -1);
    }

    // METODO FUERA DEL MAIN RETO O6 DIFICULTA EXTRA FACTORIAL
    public static int fibonacci(int posicion){
        // CASO BASE: El factorial de 0 o 1 es 1
        if (posicion <= 1){
            return posicion;
        }
        // CASO RECURSIVO: Suma de los dos anteriores
        return fibonacci(posicion -1) + fibonacci(posicion -2);
    }


}
