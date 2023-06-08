package Biblioteca;
import java.util.List;
import java.util.ArrayList;

import Biblioteca.Libro;
import Biblioteca.Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Biblioteca {
	private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Método para dar de alta un libro
    public void darDeAltaLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para dar de baja un libro
    public void darDeBajaLibro(Libro libro) {
        libros.remove(libro);
    }

    // Método para dar de alta un usuario
    public void darDeAltaUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para dar de baja un usuario
    public void darDeBajaUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // Método para prestar un libro a un usuario
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (!libro.estaPrestado() && usuario.años >= libro.getedadRecomendada()) {
            libro.setPrestado(true);
            libro.setUsuarioPrestamo(usuario);
            usuario.agregarLibroPrestado(libro);
            System.out.println("El libro '" + libro.getitulo() + "' ha sido prestado a " + usuario.getnombre());
        } else {
            System.out.println("No es posible prestar el libro");
        }
    }

    // Método para devolver un libro prestado
    public void devolverLibro(Libro libro) {
        if (libro.estaPrestado()) {
            Usuario usuario = libro.getUsuarioPrestamo();
            libro.setPrestado(false);
            libro.setUsuarioPrestamo(null);
            usuario.removerLibroPrestado(libro);
            System.out.println("El libro '" + libro.getitulo() + "' ha sido devuelto por " + usuario.getnombre());
        } else {
            System.out.println("El libro no está prestado");
        }
    }

    // Método para listar libros disponibles
    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (!libro.estaPrestado()) {
                System.out.println(libro);
            }
        }
    }

    // Método para listar libros prestados
    public void listarLibrosPrestados() {
        System.out.println("Libros prestados:");
        for (Libro libro : libros) {
            if (libro.estaPrestado()) {
                System.out.println(libro);
            }
        }
    }

    // Método para almacenar el estado de la biblioteca en un fichero
    public void almacenarEstado(String nombreFichero) {
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Libro libro : libros) {
                bw.write(libro.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Estado de la biblioteca almacenado en el fichero '" + nombreFichero + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
