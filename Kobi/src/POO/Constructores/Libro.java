package POO.Constructores;

import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    public String titulo;
    public ArrayList<String> autores= new ArrayList<String>();

    //Constructor Libro
    Libro(String titulo, String[] autores){
        this.titulo=titulo;
        this.autores=new ArrayList<String>(Arrays.asList(autores));
    }

    public String letra() {
    return String.format("%s por %s ",this.titulo,this.autores.toString());
    }

}
