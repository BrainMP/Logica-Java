package Cadenas;

public class compCadenas {
    public static void main(String[] args){
        //Comparar cadenas
       /* String nombre = "Brayan Morales Perez";
        String nombreMayuscula = nombre.toUpperCase();
        System.out.println(nombre.equals(nombreMayuscula));
        System.out.println(nombre.equalsIgnoreCase(nombreMayuscula));*/

        // Sustituir cadenas
      /*  String tieneHambre = "Si tengo hambre, traes algo de comer";
        System.out.println(String.format("¿Tienes hambre? %s ",tieneHambre));
        String quieroPreguntar = tieneHambre.replace("Si tengo hambre, traes algo de comer",
                "No, yo no tengo hambre ");

        System.out.printf("¿Y tu? %s",quieroPreguntar);*/

        //Metodo verificador de cadenas
        String letra = "Los rosas son rojas, las violetas son rojas, las hojas moradas";

        if (letra.contains("azules") || letra.contains("verdes")){
            System.out.println("La letra contiene la palabra azul o verdes");
        } else {
            System.out.println("La letra no contiene la palabra azul o verde ");
        }
    }
}
