package listaDeMatrices;

import java.util.ArrayList;
import java.util.Comparator;

public class ordListMatrices {
    public static void main(String[] args){
        ArrayList<Integer> numImpares = new ArrayList<>();
        numImpares.add(9);
        numImpares.add(7);
        numImpares.add(5);
        numImpares.add(3);
        numImpares.add(1);

        //System.out.println(numImpares.toString());

        //sort es el metodo que ordena la lista de la matriz con naturalOrder()
        /*numImpares.sort(Comparator.naturalOrder());
        System.out.println(numImpares.toString());

        //Ordenar la lista de forma inversa con .reverseOrder()
        numImpares.sort(Comparator.reverseOrder());
        System.out.println(numImpares.toString());*/

        //Cómo conservar elementos comunes de dos listas de matrices
        ArrayList<Integer> masNumImpares = new ArrayList<>();
        masNumImpares.add(11);
        masNumImpares.add(15);
        masNumImpares.add(13);
        masNumImpares.add(17);
        masNumImpares.add(19);

        numImpares.retainAll(masNumImpares);
        System.out.println(numImpares.toString());
    }
}
