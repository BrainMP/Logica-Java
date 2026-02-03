package OperadoresDeAsignacion;

public class opLogicos {
    public static void main(String[] args){

        //Operador AND &&
        /**int edad = 22;
        System.out.println(edad >= 18 && edad <=40);*/

        //Operador OR
        /**boolean escuelaEstudiante = false;
        boolean miembroBiblioteca = true;
        System.out.println(escuelaEstudiante || miembroBiblioteca);*/

        //Operador NOT ! 
        boolean esMiembroBiblioteca = true;
        boolean esEstudiante = false;
        int edad = 22;

        System.out.println(esEstudiante || esMiembroBiblioteca && edad > 21);
    }
}
