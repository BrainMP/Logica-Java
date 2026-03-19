package LogicaProgamacion;

public class prueba {
    static int numero = 10;

    public static void main(String[] args) {

        System.out.println(numero);

        // Asi se usa el metodo vacio en el main
        prueba miStock = new prueba();
        miStock.reponerStock();

        //Asi se usa el metodo static en el main
        registrarVenta();


    }

    int stockProducto = 10;          // No estático (de cada objeto)
    static int totalVentas = 0;      // Estático (global de la tienda)

    public static void registrarVenta() {
        totalVentas++;               // OK: Estático usa Estático
        // stockProducto--;          // ERROR: "Non-static field cannot be referenced..."
        System.out.println("Este es el total de ventas" + totalVentas);
    }

    public void reponerStock() {
        stockProducto += 20;         // OK: No-estático usa No-estático
        totalVentas = 0;
        // OK: No-estático usa Estático (tiene permiso)
        System.out.println("Es productos son los que hay " + stockProducto);
    }
}
