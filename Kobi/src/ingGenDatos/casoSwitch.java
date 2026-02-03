package ingGenDatos;

import java.util.Arrays;
import java.util.Scanner;

public class casoSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es el primer operando? ");
        int a = scanner.nextInt();
        // Consume el  salto de linea
        scanner.nextLine();

        System.out.print("¿Cuál es el segundo operando? ");
        int b = scanner.nextInt();
        // Consume el  salto de linea
        scanner.nextLine();

        System.out.print("¿Qué operacion le desea realizar? ");
        String operacion = scanner.nextLine();

        switch (operacion){
            case "suma":
                System.out.printf("%d + %d = %d",a,b,a+b);
                //Correccion con break en todos las operaciones
                break;

            case "resta":
                System.out.printf("%d - %d = %d",a,b,a-b);
                //Correccion con break en todos las operaciones
                break;


            case "multiplicacion":
                System.out.printf("%d * %d = %d",a,b,a*b);
                //Correccion con break en todos las operaciones
                break;

            case "division":
                if (b ==0){
                    System.out.println("No se puede dividir por cero");
                }else{
                    System.out.printf("%d / %d = %d",a,b, a/b);
                }
                break;
            default:
                System.out.printf("Operación invalida use: suma, resta,multiplicacion, division");

        }
        scanner.close();

    }
}
