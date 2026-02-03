package LogicaProgamacion;

/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa. */


import java.util.*;

public class Reto03 {
    public static void main(String [] args){

        // Array tradicional
        int[] edades= {10,12,16,18,20};
        edades[0]= 14; // Actualizacion, se cambia el 10 por el 14
        java.util.Arrays.sort(edades); //Ordena de menor a mayor

        // ArrayList
        List<String> lenguajes= new ArrayList<>();
        //Creacion o INSERCION
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        lenguajes.add("PHP");

        // ACTUALIZACIÓN
        lenguajes.set(1,"Kotlin"); //Cambia Python por Kotlin

        // REMOVER O ELIMINAR
        lenguajes.remove("C++"); // Eliminacion por nombre o valor del lenguaje
        lenguajes.remove(1); // Eliminacion por numero  de indice de la matriz

        // ORDENACION
        Collections.sort(lenguajes);

        // Imprimir
        for (String favorito : lenguajes){
            System.out.println("Mis lenguajes favoritos son " + favorito);
        }

        // HashSet
        Set<String>  usuarios = new HashSet<>();

        // INSERCION
        usuarios.add("Kobi");
        usuarios.add("Bobi");
        usuarios.add("Ato");
        usuarios.add("Yuji");

        // ACTUALIZAR
        if (usuarios.contains("Ato")){
            usuarios.remove("Ato");
            usuarios.add("Yisus");
        }

        // REMOVER O Eliminar
        usuarios.remove("Yuji");

        // ORDENACION EN HASHSET SE TIENE QUE COVERTIR A ARRAYLIST
        List<String> ordenarUsuarios= new ArrayList<>(usuarios);
        Collections.sort(ordenarUsuarios);
        System.out.println(ordenarUsuarios);

        //HashMap
        Map<String, String> rolasPilotos= new HashMap<>();

        // INSERCION
        rolasPilotos.put("Center Mass","08");
        rolasPilotos.put("RAWFEAR","02");
        rolasPilotos.put("Ride","03");

        // ACTUALIZACION
        rolasPilotos.put("Center Mass", "09");

        // ELIMINACION
        rolasPilotos.remove("Ride");

        // Busqueda
        System.out.println(rolasPilotos.get("Center Mass"));

        // Aqui estoy practicando con un Array de mis canciones favoritas

        List<String> cancionesFavoritas = new ArrayList<>();

        // Aca agrego las canciones
        cancionesFavoritas.add("Chlorine");
        cancionesFavoritas.add("Legend");
        cancionesFavoritas.add("Jumpsuit");
        cancionesFavoritas.add("City Walls");
        cancionesFavoritas.add("Snap Back");
        cancionesFavoritas.add("Formidable");

        // Borro la que menos me guste
        // cancionesFavoritas.remove("Formidable");// La voy a eliminar por el nombre de la cancion aunque se pueda por el valor que tenga en su indice
        cancionesFavoritas.remove(5); // Borrar por indice ya que es la mas directa si tuviera dos canciones con el mismo nombre borraria la primera que encuentre

        // Lo ordeno alfabeticamente
        Collections.sort(cancionesFavoritas);
        System.out.println(cancionesFavoritas);

        //Intento de imprimirlas con el bucle for
        for (String cancion : cancionesFavoritas){
            System.out.println("Estoy escuchando " + cancion);

        }

        // Reto 03 con la dificultad
        Scanner scanner = new Scanner(System.in); // Scanner scanner = new Scanner(System.in)
        Map<String, String> agenda = new HashMap<>();
        boolean salir = false;

        while(!salir){
            System.out.println("\n--- AGENDA DE CONTACTOS ---");
            System.out.println("1. Buscar");
            System.out.println("2. Insertar/Actualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    // Lógica de búsqueda con agenda.get(nombre)
                    System.out.print("Introduce el nombre que quieres buscar ");
                    String buscar = scanner.nextLine();
                    // get() devuelve el teléfono si existe, o null si no existe
                    if (agenda.containsKey(buscar)){
                        System.out.println("Telefono " + agenda.get(buscar));
                    }else {
                        System.out.println("Contacto no encontrado");
                    }

                    break;
                case "2":
                    // Lógica de inserción con validación de teléfono
                    System.out.print("Nombre del contacto: ");
                    String nuevoContacto = scanner.nextLine();
                    System.out.print("Telefono: ");
                    String numeroTel = scanner.nextLine();
                    if (numeroTel.matches("\\d{1,10}")){
                        agenda.put(nuevoContacto, numeroTel);
                        System.out.println("Contacto guardado correctamente ");
                    }
                    else {
                        System.out.println("Error: El teléfono debe ser numérico y tener 10 digitos ");
                    }

                    break;
                case "3":
                    // Lógica de borrado con agenda.remove(nombre)
                    System.out.print("Nombre del contacto a eliminar ");
                    String borrarTel = scanner.nextLine();
                    if(agenda.containsKey(borrarTel)){
                        agenda.remove(borrarTel);
                        System.out.println("Contacto eliminado");
                    }else {
                        System.out.println("El contacto no existe");
                    }
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }





    }
}
