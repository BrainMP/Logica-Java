package listaDeMatrices;

import java.util.ArrayList;

public class accEnElemen {
    public static void main(String[] args){
        ArrayList<Integer> numImpares = new ArrayList<>();
        numImpares.add(1);
        numImpares.add(3);
        numImpares.add(5);
        numImpares.add(7);
        numImpares.add(9);

        numImpares.forEach(numero ->{
            numero = numero * 2;
                    System.out.printf("%d ",numero);
        });

        System.out.println(numImpares.toString());
    }
}
