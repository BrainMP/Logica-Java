package Bucles;

public class bucleFor {
    public static void main(String[] args){

       /* for (int numero =1; numero <=20;numero++){
            System.out.println(numero);
        }*/

        //Bucle for con matriz Fibonacci
       /* int fibonacciNumeros[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int indice =0; indice < fibonacciNumeros.length; indice++){
            System.out.println(fibonacciNumeros[indice]);
        }*/

        // Tabla de multiplicar del 5
        /*int numero = 8;
        for (int tabla = 1; tabla <=10; tabla++){
            System.out.println(String.format("%d x %d = %d", numero,tabla, numero*tabla));
        }*/

        //Tablas de multiplkicar con bucles anidados
        for (int numero = 1; numero <=10; numero++){
            System.out.println(String.format("\nTabla de multiplicacion del %d ",numero));

            for (int multiplicar = 1; multiplicar <=10; multiplicar++){
                System.out.println(String.format("%d x %d = %d ",numero,multiplicar,numero*multiplicar));
            }
        }
    }
}
