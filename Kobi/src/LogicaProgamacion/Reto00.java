package LogicaProgamacion;

public  class Reto00{

public static void main(String[] args){
// https://www.oracle.com/latam/java/technologies/downloads/#java17-windows


/*Tipos de comentarios:
1. doble barra diagonal para comentarios cortos  //
2. Barra y asterisco para comentarios mas largos /* /
*/
    // Declaracion de una variable
String reto= "RETO 00"; // String es una clase y no un dato primitivo

    // Declaracion de una constante
    final int EDAD= 22;


// Tipos de datos primitivos y sus declaraciones: byte, short, int, long, float, double, char, boolean

    byte miByte = 100;
    short miShort = 10000;
    int miInt = 1000000;
    long miLong = 9223372036854775807L;
    float miFloat = 3.14f;
    double miDouble = 2.71828;
    char miChar = 'B';
    boolean miBoolean = true;

    boolean tengoSueño = true;
    String lenguaje = "JAVA";

    System.out.println("¿En verdad tengo sueño?" + tengoSueño);

    //Imprime en pantalla lo que contiene
    System.out.println("Hola mundo desde " + lenguaje);

    //Impresion de todos los datos primitivos
    System.out.println( miByte + " esto es Byte");
    System.out.println( miShort + " esto es Short");
    System.out.println( miInt + " esto es Int");
    System.out.println( miLong + " esto es Long");
    System.out.println( miFloat + " esto es Float");
    System.out.println( miDouble + " esto es Double");
    System.out.println( miChar + " esto es Char");
    System.out.println( miBoolean + " esto es Boolean");
}

}