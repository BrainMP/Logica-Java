package listaDeMatrices;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
       /* ArrayList<Integer> numerosImpares = new ArrayList<>();
        numerosImpares.add(1);
        numerosImpares.add(3);
        numerosImpares.add(5);
        numerosImpares.add(7);
        numerosImpares.add(9);
        System.out.println(numerosImpares.toString());*/

        // Para obtener datos de la matriz forzosamente usa el metodo get();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        numerosImpares.add(1);
        numerosImpares.add(3);
        numerosImpares.add(5);
        numerosImpares.add(7);
        numerosImpares.add(9);

        //Metodo para cmabiar de valor un elemento de la matriz
      /*  numerosImpares.set(2,33);

        //Metodo para obtener el valor a la que apuntas .get()
        System.out.println(numerosImpares.get(2));*/

        //Metodo para saber el tamaño de la matriz .size()
        //System.out.println(numerosImpares.size());

        //Metodo para eliminar elementos de la matriz .remove()
        numerosImpares.remove(Integer.valueOf(7));
        numerosImpares.remove(Integer.valueOf(9));
        System.out.println(numerosImpares.toString());

    }
}
