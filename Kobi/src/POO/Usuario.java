package POO;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class Usuario {
   private String nombre;
   private LocalDate cumple;
   private ArrayList<Libro> prestarLibros = new ArrayList<Libro>();

    public String obtnrNombre(){
        return this.nombre;
    }

    public void establcrNombre(String nombre){
        this.nombre=nombre;
    }

    public String ObtLibPrestados(){
        return this.prestarLibros.toString();
    }

    Usuario(String nombre, String cumple){
        this.nombre=nombre;
        this.cumple=LocalDate.parse(cumple);
    }

    int edad(){
        return Period.between(this.cumple, LocalDate.now()).getYears();
    }

    void pedirPrestado(Libro libro){
        this.prestarLibros.add(libro);

    }

    void pedirPrestado(Libro[] libros){
        prestarLibros.addAll(Arrays.asList(libros));
    }
}