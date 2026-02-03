package Cadenas;

public class esCadena {
    public static void main(String[] args){
        String stringLiteral1 = "abc";
        String stringLiteral2 = "abc";

        String objetoString1 = new String("abc");
        String objetoString2 = new String("abc");

        System.out.println(stringLiteral1 == stringLiteral2);
        System.out.println(objetoString1 == objetoString2);
    }
}
