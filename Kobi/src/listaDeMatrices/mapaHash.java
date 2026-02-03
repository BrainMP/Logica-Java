package listaDeMatrices;

import java.util.HashMap;

public class mapaHash {
    public static void main(String[] args){
        HashMap<String,Double> precios = new HashMap<>();
        precios.put("Mandarina",3.0);
        precios.put("Mango", 5.2);
        precios.put("Rambutan",1.0);
        precios.put("Coco", 9.9);

      /*  System.out.println(precios.getOrDefault("Calabaza", 0.0));

        //Remover o borrar
        precios.remove("Mandarina");

        //Obtener valores en este caso el precio
        System.out.println(precios.get("Mango"));

        //Mostrar la matriz de las frutas y precios
        System.out.printf(precios.toString());

        //Evalua el tamaño de la matriz
        System.out.println("\nEste es el tamaño de la matriz "+ precios.size());*/

        //Cómo realizar una acción en todos los elementos de un mapa hash
        System.out.println("Precios despues del descuento ");

        precios.forEach((fruta, precio) -> {
            System.out.println(fruta + "-" + (precio - 0.5));
        });
    }
}
