package OperadoresDeAsignacion;

public class opUnarios {
    public static void main(String[] args){
        int puntos = 45;
        int turnos = 20;
        //Posicion tipica
        /*puntos ++;
          turnos --;*/

        //Como prefijos
        ++puntos;
        --turnos;

        System.out.println(puntos);
        System.out.println(turnos);
    }
}
