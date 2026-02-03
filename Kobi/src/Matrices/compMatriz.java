package Matrices;

import java.util.Arrays;

public class compMatriz {
    public static void main(String[] args){

       /* int numImpars1[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int numImpars2[] = {1, 3, 5, 7, 9, 11, 13, 15};

        // Sin el .equals el resultado es FALSE
        System.out.println(Arrays.equals(numImpars1,numImpars2));*/

        //Metodo Array.deepEquals() para comparar matrices multidimencionales
        int medicinaRutina[][] = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
        };

        int medicinaRutina2[][] = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
        };
        System.out.println(Arrays.deepEquals(medicinaRutina,medicinaRutina2));
    }
}
