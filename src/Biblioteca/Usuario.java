package Biblioteca;
import java.util.List;
import java.util.ArrayList;

import Biblioteca.Libro;

public class Usuario {
	
	protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;
    protected int años;
    protected List<Libro> librosPrestados;

    public Usuario(String nombre, String apellido1, String apellido2, String dni, int años) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.años = años;
        this.librosPrestados = new ArrayList<>();
    }

    // Getters y Setters

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido1() {
        return apellido1;
    }

    public void setapellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public void setapellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getaños() {
        return años;
    }
    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void removerLibroPrestado(Libro libro) {
        librosPrestados.remove(libro);
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", años='" + años + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

