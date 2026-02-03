package ingGenDatos;

import java.util.Scanner;

public class genIngDatos {
    public static void main(String[] args){
        //Se utiliza la funcion Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Como te llamas? ");
        String nombre = scanner.nextLine();

        System.out.printf("Entonces %s ¿Cuantos años tienes? ", nombre);
        int edad =  Integer.parseInt(scanner.nextLine());
        // SOLUCION CLASICA --> scanner.nextLine();

        System.out.printf("¡Cool! %d es muy buena edad para empezar a programar.\n ¿Que lenguaje de programacion prefieres? ", edad);
        String lenguaje = scanner.nextLine();

        System.out.printf("¡Que bien1 %s es un lenguaje de programacion formidable",lenguaje);

        scanner.close();

    }
}
