package Matrices;

import java.util.Arrays;

public class simpleMatriz {
    public static void main(String[] args){

        // <type> <name>[] = new <type>[<length>]
        // Cadenas, matriz de la forma larga
           /* char vocales[] = new char[5];

            vocales[0] = 'a';
            vocales[1] = 'e';
            vocales[2] = 'i';
            vocales[3] = 'o';
            vocales[4] = 'u';

        System.out.println("Estas son las vocales:" + Arrays.toString(vocales));*/

        // Array mas usado y el preferido para las matrices
        /*char vocales [] = {'a','e','i','o','u'};
        System.out.println("Este es el orden corecto de las vocales: " + Arrays.toString(vocales));*/

        //Matriz de medicina de la semana
        int mediRutina[][]= {
                {1,2,3,4,5,6,7},
                {0,1,1,0,1,1,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,0},
        };
        System.out.println(Arrays.deepToString(mediRutina).replace("],","]\n"));

    }
}
