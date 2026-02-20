package LogicaProgamacion;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */
public class Reto04 {
    public static void main(String[] args) {

        // Longitud, Acceso y Concatenacion
        String text0 = ("Twenty One Pilots");
        String text1 = ("Kobi ");
        int textoLargo = text0.length(); // Longitud
        char letra = text0.charAt(0); // Acceso
        String unido = text0 + " BREACH"; // Concatenacion con el signo "+"
        String concat = text1.concat(text0); // Concatenacion con la funcion .concat();
        // Imprimir
        System.out.println(textoLargo);
        System.out.println(letra);
        System.out.println(unido);
        System.out.println(concat);

        // Subcadenas y Verificacion
        String frase = "Empieza de nuevo el próximo semestre";

        // Indice extraer toda la frase
        String tamañoFrase = frase.substring(0, 36); // 0 a 34 es el indice que abarca

        // Verificacion boolean
        boolean contiene = frase.contains("nuevo"); // true
        boolean empieza = frase.startsWith("Empieza");
        boolean termina = frase.endsWith("8");

        // Indice: Buscar posición
        int posicion = frase.indexOf("de"); // "d" empieza desde 9
        int noExiste = frase.indexOf("Kobi"); // Va a devolver -1 si no lo encuentra

        // Imprimir
        System.out.println(frase);
        System.out.println(tamañoFrase);
        System.out.println(contiene);
        System.out.println(empieza);
        System.out.println(termina);
        System.out.println(posicion);
        System.out.println(noExiste);

        // Conversion y Reemplazo
        String vessel = " Guns For Hands ";

        //Limpiar y cambiar
        String limpio = vessel.trim(); // Elimina espacios a la derecha e izquierda del texto
        String minus = vessel.toLowerCase(); // Convierte el texto en minisculas
        String mayus = vessel.toUpperCase(); // Convierte el texto en mayusculas

        // Reemplazo
        String sinEspacios = limpio.replace(" ", "_");
        String censura = "Imbecil".replace("Imbecil", "*******");

        // Imprimir
        System.out.println(vessel);
        System.out.println(limpio);
        System.out.println(minus);
        System.out.println(mayus);
        System.out.println(sinEspacios);
        System.out.println(censura);

        // Division y union
        String data = "TOP; Vessel; Blurryface; Trench; SAI; Clancy; Breach";

        // Split: cortar por el punto y coma
        String[] albumes = data.split(";");  // Resultado: ["Vessel", "Blurryface", "Trench", "SAI"] ^|


        // Join: Unir los elementos del array con una flecha
        String camino = String.join("->", albumes); //TOP->Vessel->Blurryface->Trench->SAI->Clancy->Breach

        // imprimir
        System.out.println(data);
        System.out.println(albumes);
        System.out.println(camino);

        // Recorrido, Interpolación y Repetición
        String cancion = "Center Mass";

        // Recorrido (Convertir a Char Array para usar en un bucle)
        for (char letras : cancion.toCharArray()) {
            System.out.println(letras + ("-"));

        }

        // Repeticion
        String coro = "The part the aim for ".repeat(2); // Repite la frase el numero de veces que le indiques

        // Interpolación (Formateo avanzado)
        double precio = 19.99;
        String ticket = String.format("Disco %s | precio %.2f$", cancion, precio);

        // Imprimir
        System.out.println(cancion);
        System.out.println(coro);
        System.out.println(ticket);


        // Verificacion especial
        String vacio = "";
        String espacios = "   ";

        // Diferencia entre VACIO "empty" y en BLANCO (blank)
        System.out.println(vacio.isEmpty()); // true porque esta vacio
        System.out.println(espacios.isEmpty());// false porque tiene caracteres en blanco, creo que marcara true porque esta en blanco
        System.out.println(vacio.isBlank()); // Nos se que pasa aqui
        System.out.println(espacios.isBlank()); // true no tiene letras o numeros

        // RETO 04 DIFICULTAD EXTRA

        System.out.println("\n--- INICIO DEL ANÁLISIS ---");

        // Prueba de Anagramas
        comprobarPalabras("amor", "roma");

        // Prueba de Palíndromos
        comprobarPalabras("radar", "java");

        // Prueba de Isogramas
        comprobarPalabras("murcielago", "casa");


    }

    public static void comprobarPalabras(String p1, String p2) {
        System.out.println("\nAnalizando '" + p1 + "' y '" + p2 + "':");
        System.out.println("- ¿Es '" + p1 + "' palíndromo?: " + esPalindromo(p1));
        System.out.println("- ¿Es '" + p2 + "' palíndromo?: " + esPalindromo(p2));
        System.out.println("- ¿Son anagramas?: " + esAnagrama(p1, p2));
        System.out.println("- ¿Es '" + p1 + "' isograma?: " + esIsograma(p1));
    }

    public static boolean esAnagrama(String p1, String p2) {

        // Si son la misma palabra, técnicamente no es un anagrama
        if (p1.equalsIgnoreCase(p2)) return false;

        // Convertimos a array de caracteres y ordenamos
        char[] array1 = p1.toLowerCase().toCharArray();
        char[] array2 = p2.toLowerCase().toCharArray();

        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);

        // Comparamos si los arrays ordenados son idénticos
        return   java.util.Arrays.equals(array1, array2);


    }


    public static boolean esPalindromo(String palabra){
        String invertida = new StringBuilder(palabra.toLowerCase()).reverse().toString();
        return palabra.toLowerCase().equals(invertida);
    }

    public static boolean esIsograma(String palabra){

        Set<Character> letrasUnidas = new HashSet<>();
        for (char c : palabra.toLowerCase().toCharArray()){
            if (!letrasUnidas.add(c)){
                return false; // Si se  detuvo aqui es que hubo un duplicado
            }
        }
        return true; // Si termina aqui es que ninguna letra se repitio
    }

}