package POO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
       /*User user = new User("Farhan", "1996-07-15");
        Book book1 = new Book("Carmilla", new String[]{"Sheridan Le Fanu"});
        Book book2 = new Book("Frankenstein", new String[]{"Mary Shelley"});*/

        Usuario usuario = new Usuario("Kobi", "2003-05-03");
        Libro libro1 = new Libro("Poder sin limites", new String[]{"Tony Robbins"});

        usuario.pedirPrestado(libro1);
        System.out.printf("%s ha tomado prestado estos libros %s",usuario.obtnrNombre(),usuario.ObtLibPrestados());
    }

}
