package LogicaProgamacion;

/*
 * EJERCICIO:
 * Explora el concepto de manejo de excepciones según tu lenguaje.
 * Fuerza un error en tu código, captura el error, imprime dicho error
 * y evita que el programa se detenga de manera inesperada.
 * Prueba a dividir "10/0" o acceder a un índice no existente
 * de un listado para intentar provocar un error.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que sea capaz de procesar parámetros, pero que también
 * pueda lanzar 3 tipos diferentes de excepciones (una de ellas tiene que
 * corresponderse con un tipo de excepción creada por nosotros de manera
 * personalizada, y debe ser lanzada de manera manual) en caso de error.
 * - Captura todas las excepciones desde el lugar donde llamas a la función.
 * - Imprime el tipo de error.
 * - Imprime si no se ha producido ningún error.
 * - Imprime que la ejecución ha finalizado.
 */
public class Reto10 {
    public static void main(String[] args) {

        //EJEMPLO CON TRY E INTENTAR DIVIDIR POR CERO
        try {
            int numero = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error detectado. No se puede dividir por cero");
            System.out.println("Tipo de error " + e.getClass().getSimpleName());
        }

        //EJEMPLO CON TRY CON INDICE FUERA DE RANGO
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);//Este indice no existe
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error detectado. Intentas acceder a un índice inexistente");
        } finally {
            System.out.println("El programa no se detuvo y continuó ejecutándose.");
        }

        //RETO DIFICULTAD EXTRA
        try {
            // Cambia estos valores para probar los diferentes errores:
            // 1. (-5, "Kobi") -> Lanza MiPropioError
            // 2. (0, "Kobi")  -> Lanza ArithmeticException
            // 3. (25, null)   -> Lanza NullPointerException
            procesarParametros(-22, "Kobi");

            System.out.println("No se ha producido ningún error.");

        } catch (MiPropioError e) {
            System.out.println("Error Personalizado: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error Matemático: " + e.getMessage());
        } catch (Exception e) { // Catch genérico para cualquier otro error
            System.out.println("Se produjo un error inesperado: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("La ejecución ha finalizado.");
        }


    }

    //RETO DIFICULTAD EXTRA
//usaremos throw para lanzar los errores manualmente si no se cumplen nuestras condiciones.
    public static void procesarParametros(int edad, String nombre) throws MiPropioError, ArithmeticException, NullPointerException {
        if (nombre == null) {
            throw new NullPointerException("EL nombre no puede ser nulo");
        }
        if (edad < 0) {
            throw new MiPropioError("La edad no puede ser negativa");
        }
        if (edad == 0) {
            //Forzamos un error solompara el reto
            int error = 10 / 0;
        }
        System.out.println("Procesamiento exitoso para " + nombre);
    }

}

// Creo mi propia clase que va a causar una EXCEPCION
class MiPropioError extends Exception {
    public MiPropioError(String mensaje) {
        super(mensaje);
    }
}


