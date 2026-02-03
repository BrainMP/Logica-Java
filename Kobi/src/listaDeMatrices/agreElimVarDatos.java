package listaDeMatrices;

import java.util.ArrayList;

public class agreElimVarDatos {
    public static void main(String[] args){
      /*  ArrayList<Integer> numerosImpares = new ArrayList<>();

        numerosImpares.add(1);
        numerosImpares.add(3);
        numerosImpares.add(5);

        ArrayList<Integer> masNumImpares = new ArrayList<>();

        masNumImpares.add(7);
        masNumImpares.add(9);
        masNumImpares.add(11);

        numerosImpares.addAll(masNumImpares);
        System.out.println(numerosImpares.toString());

        numerosImpares.removeAll(masNumImpares);
        System.out.println(numerosImpares.toString());

        //Metodo para eliminar todos los elementos de una lista de matrices, metodo clear()
        numerosImpares.clear();
        System.out.println(numerosImpares.toString());

        // Como eliminar elementos segun una condicion
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int k =1; k <=10;k++){
            numeros.add(k);
        }
        System.out.println(numeros.toString());

        numeros.removeIf(numero -> numero % 2 ==1);
        System.out.println(numeros.toString());*/

        //Como clonar y comparar listas de matrices
       /* ArrayList<Integer> numeros = new ArrayList<>();
        for (int k =0; k <= 10;k++){
            numeros.add(k);
        }
        ArrayList<Integer> numerosClones = (ArrayList<Integer>)numeros.clone();
        System.out.println(numerosClones.equals(numeros));*/

        //Cómo comprobar si un elemento está presente o si la lista de la matriz está vacía
        ArrayList<Integer> numImpares = new ArrayList<>();
        numImpares.add(1);
        numImpares.add(3);
        numImpares.add(5);
        numImpares.add(7);
        numImpares.add(9);
        System.out.println(numImpares.isEmpty());
        System.out.println(numImpares.contains(5));
    }
}
