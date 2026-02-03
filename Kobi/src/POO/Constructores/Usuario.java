package POO.Constructores;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public LocalDate cumple;
    public ArrayList<Libro> libPresta= new ArrayList<Libro>();
    //Constructor
    Usuario(String nombre, String cumple){
        this.nombre=nombre;
        this.cumple=LocalDate.parse(cumple);
    }

    int edad(){
        return Period.between(this.cumple, LocalDate.now()).getYears();
    }
   void pedirPrestado(Libro libro){
        this.libPresta.add(libro);
    }
}
