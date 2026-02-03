package LogicaProgamacion;

/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */
public class Reto01 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;

        // OPERADORES ARITMETICOS

        // Operador de suma +
        System.out.println(num1 + num2);

        // Operador de resta -
        System.out.println(num2 - num1);

        // Operador de multiplicacion *
        System.out.println(num1 * num2);

        // Operador de division /
        System.out.println(num2 / num1);

        // Operador de residuo o modulo %
        System.out.println(num2 % num1);

        //OPERADORES DE COMPARACION O RELACIONALES

        // Operadores de mayor o menor <>
        System.out.println(num1 < num2);
        System.out.println(num2 > num1);

        // Operadores de mayor o igual y de menor o igual =<, =>
        System.out.println(num1 >= 20);
        System.out.println(num1 <= 15);

        // Operador de comparacion igual ==
        System.out.println(num2 == 30);

        // Operador de diferencia
        System.out.println(num2 != 25);

        // OPERADORES LOGICOS

        // Declarando para poder ocupar booleanos
        boolean b = true ; boolean m = false;

        // Operadores logicos And $$, Or || y Not !
        System.out.println( b && m); // And
        System.out.println(m || b); // Or
        System.out.println(!m); // Not

        // OPERDORES DE ASIGNACION
        int k = 10;
        k+= 5; // k = k + 5 (suma y asigna)
        k -=4; // k = k - 4 (resta y asigna)
        k *=2; // k = k * 2 (multiplica y asigna)
        k /=2; // k = k / 2 (divide y asigna)
        k %=3; // k = k % 2 (modulo y asigna)


        // OPERADORES DE INCREMENTO Y DECREMENTO

        int c = 20;

        // Los operadores ++ y --
        c++; // Suma o aumenta una unidad osea POST INCREMENTO
        c--; // Resta o decrementa una unidad osea POST DECREMENTO
        ++c; // Suma o aumneta una unidad solo que aqui lo hace antes osea PRE INCREMENTO

        System.out.println(c << 2);

        /// OPERADORES CONDICIONALES IF ELSE
        int hora = 10;
        String estado;

        if (hora >= 9 && hora <= 18) {
            estado = "Abierto";
        } else {
            estado = "Cerrado";
        }

        //OPERADORES TERNIARIOS
        String Estado = (hora >=9 && hora <=18) ? "Abierto" : "Cerrado";

        int num4 = 10;
        int num5 = 20;
        if (num5 % num4 == 0) {
            System.out.println(num5 + " es divisible exactamente por " + num4);
        } else {
            System.out.println("Existe un residuo de: " + (num4 % num5));
        }

        // De IDENTIDAD O PERTENENCIA
        String cancion = "RAWFEAR";
        System.out.println("¿Es una canción de TOP? " + (cancion instanceof String));


        // Para identidad de objetos (misma direccion de memoria) se usa "==" o ".equals()"
        String p1= new String("BANDITO");
        String p2= new String("BANDITO");
        System.out.println("¿Es la misma identidad de objeto? " + (p1 == p2));
        System.out.println("¿Tiene el mismo contenido? " +(p1.equals(p2)));

        //Bucle While
        int j = 0;
        System.out.print("Bucle While: ");
        while (j < 2) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Manejo de EXCEPCIONES (try-catch-finally)
        try {
            double divisionPorCero = 10/0;
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }finally {
            System.out.println("Este codigo siempre se ejecuta");
        }

        // El reto 01 el programa con dificultas extra
        System.out.println("EJERCICIO EXTRA");
        for(int i = 10; i <= 55; i++){

            if ((i % 2 == 0) && (i != 16) && (i % 3 != 0)) {

                System.out.println(i);
            }
        }

    }
}
