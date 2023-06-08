package Biblioteca;

import Biblioteca.Libro;
import Biblioteca.Usuario;
import Biblioteca.Biblioteca;

public class Main {

	public static void main(String[] args) {
		 Biblioteca biblioteca = new Biblioteca();

	        // Ejemplo de uso
	        Libro libro1 = new Libro("El señor de los anillos","J.R.R. Tolkien", "123456", "Aventuras", 12);
	        Libro libro2 = new Libro("1984","George Orwell", "789012", "Ciencia Ficción", 16);
	        Usuario usuario1 = new Usuario("Juan","Perez","luis ","12345678",19);
	        Usuario usuario2 = new Usuario("Maria", "Lopez","rofriguex", "87654321",19);

	        biblioteca.darDeAltaLibro(libro1);
	        biblioteca.darDeAltaLibro(libro2);
	        biblioteca.darDeAltaUsuario(usuario1);
	        biblioteca.darDeAltaUsuario(usuario2);

	        biblioteca.listarLibrosDisponibles();
	        biblioteca.prestarLibro(libro1, usuario1);
	        biblioteca.listarLibrosDisponibles();
	        biblioteca.listarLibrosPrestados();
	        biblioteca.devolverLibro(libro1);
	        biblioteca.listarLibrosPrestados();

	        biblioteca.almacenarEstado("estado_biblioteca.txt");

	}

}
