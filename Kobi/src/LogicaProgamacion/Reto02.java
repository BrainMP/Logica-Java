package LogicaProgamacion;
/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */
public class Reto02 {

    public static void main(String[] args) {

        // Caso para saludo
        saludo("Kobi");

        // Caso para sumas
        int resultado = sumas(5, 5);
        System.out.println("El resultado es " + resultado);

        // Caso para alcance GLOBAL Y LOCAL
        System.out.println("SOY GLOBAL");
        alcance();

        // Funciones propias de Java osea librerias
        double raiz = Math.sqrt(50); // Funcion con la libreria Math
        int longitud = "Hola".length(); // Funcion de la clase String " <---ME QUEDE EN DUDA"
        System.out.println("La longitud del texto es " + longitud);
        System.out.println("La la raiz cuadrada de 50 es " + raiz);

        // Ejercicio extra del reto 2
        int resultados = dificultadExtra("Fizz", "Buzz");
        System.out.println("El número de veces que se imprimio un número es: " + resultados);


    }

    public static void saludo(String nombre) {
        //Función para imprimir
        System.out.println("Hola, " + nombre);
    }

    public static int sumas(int a, int b) {
        return a + b;
    }

    public static void alcance() {
        String mensajeLocal = "SOY LOCAL";
        System.out.println(mensajeLocal);
    }

    // Intento de escribir un metodo dentro de un metodo
    /*

    // En Java no se puede crear o utilzar un metodo dentro de otro metodo
    a menos que utlices la expresion o metodo lambda. Tambien crear una
    clase dentro del metodo o eso es lo que conozco hasta ahora 23/01/26

    public static void metodoPadre(){

        public static void metodoHijo(){
            System.out.println("Esto no es posible en JAVA");
        }
        }

     */

    //Reto  de la dificultad extra
    public static int dificultadExtra(String texto1,
                                       String texto2) {
        int contador = 0;// Creamos la libreta

        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(texto1 + texto2);
            } else if (i % 3 == 0) {

                System.out.println(texto1);

            } else if (i % 5 == 0) {

                System.out.println(texto2);

            }else {
                // Se imprime si el numero no es multiplo de 3 o 5
                System.out.println(i);
                contador ++; // Aca el contador hace la suma al conteo o libreta
            }
        }

        return contador;

    }


    }