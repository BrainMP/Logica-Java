package Matrices;


import java.util.Arrays;

public class ordenMatriz {
    public static void main(String[]args){
        // Matriz de vocales desordenadas

       /* char vocales[] = {'e','i','a','u','o'};

        Arrays.sort(vocales);
        System.out.println("Sorteo de vocales: " + Arrays.toString(vocales).toUpperCase(Locale.ROOT));*/

        //Matris ordenada del indioce 1 al 4
        char vocales[] = {'e','u','o','i','a'};

        int inIndice = 1;
        int finIndice = 4;
        Arrays.sort(vocales, inIndice,finIndice);
        System.out.println("Este es el sorteo de Arrays: " + Arrays.toString(vocales));





    }
}
