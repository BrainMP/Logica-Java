package ingGenDatos;

public class sentCondicionales {
    public static void main(String[] args){
    //int edad = 50;

    //Sentencia
    /*if (edad >=18 && edad <=40){
        System.out.println("Tu puedes usar el programa");
    } else  {
        System.out.println("No puedes usar este programa");
    }*/

        // Sentencias if-else if-else
      /*  int edad = 24;
        boolean esEstudainte = false;
        boolean esMiemBiblio = false;

        if (edad >= 18 && edad <= 40){
            System.out.println("Usted puede usar el programa");
        } else if (esEstudainte || esMiemBiblio ){
            System.out.println("Usted puede usar el programa por un tiempo");
        }else{
            System.out.println("Usted no puede usar el programa");
        }*/

        // Sentencias IF anidadas
        int edad = 30;
        if (edad >= 18 && edad <=40){
            boolean esEstudiante = false;
            boolean esMiemBiblio = false;

            if (esEstudiante || esMiemBiblio){
                System.out.println("Puede usar el programa");
            }else {
                System.out.println("No puede usar el programa");
            }
        }

    }
}
