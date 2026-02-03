package POO;

import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    String titulo;
    ArrayList<String> autores = new ArrayList<String>();

    // Constructor que te falta agregar
   public Libro(String titulo, String[] autores) {
        this.titulo = titulo;
        for (String autor : autores) {
            this.autores.add(autor);
        }
    }
    //Constructor mas eficiente
    /*Libro(String titulo,String[] autores){
        this.titulo=titulo;
        this.autores= new ArrayList<String>(Arrays.asList(autores));
    }*/

    public String toString(){
        return String.format("%s por %s ", this.titulo, this.autores.toString());
    }


}
