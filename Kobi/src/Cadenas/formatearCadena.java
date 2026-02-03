package Cadenas;

public class formatearCadena {
    public static void main(String[] args){
       /* String nombre = "Kobi";
        int edad = 22;
        String formatoString = String.format("Mi nombre es %s y tengo %d " +
                "años de años de edad ", nombre.length(), edad);
        System.out.println(formatoString);*/

        //isEmpty() o length()
       /*String nombre = "Aira";
        if (nombre.isEmpty()){
            System.out.println("Este nombre no se menciona  aqui");
        } else{
            System.out.println(String.format("Esta bien, su nombre esta aqui %s",nombre));
        }*/

        // Convertir cadenas a Minusciulas o Mayusculas
        String nombre = "Kobi Morales Perez ";

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
    }
}
