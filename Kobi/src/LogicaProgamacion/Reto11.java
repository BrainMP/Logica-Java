package LogicaProgamacion;

import java.io.*;
import java.util.Scanner;

/*
 * IMPORTANTE: Sólo debes subir el fichero de código como parte del ejercicio.
 *
 * EJERCICIO:
 * Desarrolla un programa capaz de crear un archivo que se llame como
 * tu usuario de GitHub y tenga la extensión .txt.
 * Añade varias líneas en ese fichero:
 * - Tu nombre.
 * - Edad.
 * - Lenguaje de programación favorito.
 * Imprime el contenido.
 * Borra el fichero.
 *
 * DIFICULTAD EXTRA (opcional):
 * Desarrolla un programa de gestión de ventas que almacena sus datos en un
 * archivo .txt.
 * - Cada producto se guarda en una línea del archivo de la siguiente manera:
 *   [nombre_producto], [cantidad_vendida], [precio].
 * - Siguiendo ese formato, y mediante terminal, debe permitir añadir, consultar,
 *   actualizar, eliminar productos y salir.
 * - También debe poseer opciones para calcular la venta total y por producto.
 * - La opción salir borra el .txt.
 */
public class Reto11 {
    public static void main(String [] args){
        String fileName= "Kobi07.txt";
        File file = new File(fileName);
        try {
            // 1. CREAR Y ESCRIBIR
            FileWriter escribir = new FileWriter(file);
            escribir.write("Nombre: Kobi\n");
            escribir.write("Edad: 25\n");
            escribir.write("Lenguaje favorito: Java\n");
            escribir.close(); // ¡VITAL! Si no cierras, no se guarda nada.
            System.out.println("Archivo creado con éxito.");

            // LEER
            System.out.println("--- Contenido del archivo ---");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

            // BORRAR
            if (file.delete()) {
                System.out.println("\nArchivo borrado correctamente.");
            }

        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }

        // RETO DE DIFUCULTAD EXTRA
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        String nombreArchivo= "ventas.txt";

        do {
            System.out.println("\n SISTEMAS DE VENTAS");
            System.out.println("1. Añadir producto ");
            System.out.println("2. Consultar productos");
            System.out.println("3. Actualizar productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Calcular totales");
            System.out.println("6. Salir y borrar archivo");
            System.out.println("Elegir una opción: ");

            opcion= scanner.nextInt();
            scanner.nextLine(); //Limpia el buffer

            switch (opcion){
                case 1: añadir(scanner,nombreArchivo);break;
                case 2: consultar(nombreArchivo);break;
                //Los demas numeros se iran agregando poco a poco
                case 6: salir(nombreArchivo);break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion !=6);
    }

    // Segun las instrucciones aqui iran los métodos estaticos para manejar el archivo
    //Método de añadir
    public static void añadir(Scanner scanner, String nombreArchivo) {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cant = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(nombre + ", " + cant + ", " + precio);
            System.out.println("Producto guardado.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    //METODO CONSULTAR
    public static void consultar(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()){
            System.out.println("El archivo de ventas aún no existe");
            return;
        }

        try (Scanner lector = new Scanner(archivo)){

            System.out.println("\n LISTA DE PRODUCTOS");
            while (lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo "+ e.getMessage());
        }

    }

    //METODO PARA CALCULAR TOTALES
    public static void calcularTotales(String nombreArchivo){
        double totalGeneral=0;

        try (Scanner lector = new Scanner(new File(nombreArchivo))){
            while (lector.hasNextLine()){
                String linea =lector.nextLine();

                // Separamos por la coma y el espacio que definiste en 'añadir'
                String[] partes =linea.split(", ");

                if (partes.length==3){
                    String nombre= partes[0];
                    int cantidad =Integer.parseInt(partes[1]);
                    double precio = Double.parseDouble(partes[2]);

                    double totalProductos= cantidad * precio;
                    totalGeneral += totalProductos;

                    System.out.println("Producto: " + nombre + " | Total: $" + totalProductos);
                }
            }
            System.out.println("----------------------------");
            System.out.println("VENTA TOTAL GENERAL: $" + totalGeneral);
        }catch (IOException e){
            System.out.println("Error al capturar  totales "+ e.getMessage());
        }
    }

    // METODO PARA SALIR
    public static void salir(String nombreArchivo){
        File archivo= new File(nombreArchivo);

        if (archivo.exists()){
            archivo.delete();
            System.out.println("Archivos de ventas eliminado");
        }
        System.out.println("Saliendo del sistema");
    }
}

// CLASE PRODUCTO
class Producto{
    String nombre;
    int cantidad;
    double precio;

    public Producto(String nombre, int cantidad, double precio){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;

    }
    // Este método nos ayuda a escribir en el archivo con el formato pedido
    @Override
    public String toString(){
        return nombre + ", "+ cantidad+", "+ precio;
    }
}
