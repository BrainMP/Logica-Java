package POO.Constructores;

public class Main {
    public static void main(String[] args){
        Usuario usuario= new Usuario("Kobi","2003-05-03");

        Libro libro= new Libro("Biblia", new String[]{"DIOS TODO PODEROSO"});

        usuario.pedirPrestado(libro);

        System.out.printf("%s ha tomado prestado este libro: %s",usuario.nombre,usuario.libPresta);

    }
}
