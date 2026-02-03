package Matrices;

import java.util.Arrays;

public class busqBinaria {
    public static void main(String[] args){

       /* char vocales[] = {'a','e','i','o','u'};

        char llave = 'i';
        int elemEncontrado = Arrays.binarySearch(vocales, llave);

        System.out.println("La vocal 'i' esta en el indice " + elemEncontrado);*/

        //Busqueda ascendente
        /*char vocales[] = {'a','e','i','o','u'};
        char llave = 'i';
        int inIndice = 2;
        int finIndice = 4;

        int elemIndEncontrado = Arrays.binarySearch(vocales, inIndice, finIndice, llave);
        System.out.println("La vocal 'i' esta en el indice " + elemIndEncontrado);*/

        //Como llenar una matriz
        /*char vocales[] = {'a','e','i','o','u'};
        Arrays.fill(vocales, 'x');
        System.out.println("La matriz llena " + Arrays.toString(vocales));*/

        //Lo mismo que lo anterior | de arriba
        /*char vocales[] = {'a','e','i','o','u'};
        int  inIndice = 1;
        int finIndice = 4;
        Arrays.fill(vocales,inIndice,finIndice, 'x');
        System.out.println("La matriz llena 2 " + Arrays.toString(vocales));*/

        //Como duplicar/copiar matrices
        /*
        int copNumImpars[] = numImpars;

        Arrays.fill(numImpars, 0);
        System.out.println("Le copie el array " + Arrays.toString(copNumImpars));*/

        //Copiar correctamente una matriz
        /*int numImpars [] = {1,3,5,7,9};
        int copNumImpars[] = Arrays.copyOf(numImpars, numImpars.length);
        Arrays.fill(numImpars, 0);

        System.out.println("Copie el ARRAY " + Arrays.toString(copNumImpars));*/

        //Método Arrays.copyOfRange()que puede copiar una parte de una matriz a una nueva
        int numImpars[] = {1,3,5,7,9,11,13,15};
        int inIndice = 0;
        int finIndice = 8;

        int copDeNumeros[] = Arrays.copyOfRange(numImpars,inIndice,finIndice);
        System.out.println("Voliv a copiar el ARRAY " + Arrays.toString(copDeNumeros));

    }
}
