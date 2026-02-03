package Bucles;

public class bucleWhile {
    public static void main(String[] args){
        int numero =5;
        int multiplicador =1;
        while (multiplicador <=10){
            System.out.println(String.format("%d x %d = %d ",numero,multiplicador,numero*multiplicador));
            multiplicador++;
        }
    }
}
