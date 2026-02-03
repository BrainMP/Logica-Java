package Bucles;

public class bucleDoWhile {
    public static void main(String[] args){
        int numero=5;
        int multiplicador=1;

        do {
            System.out.println(String.format("%d x %d = %d",numero,multiplicador,numero*multiplicador));
            multiplicador++;
        }while (multiplicador<=10);

    }
}
