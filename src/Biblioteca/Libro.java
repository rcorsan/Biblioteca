package Biblioteca;

import java.util.Arrays;
import java.util.List;
import Biblioteca.Usuario;

public class Libro {
	
	protected String titulo;
    protected String autor;
    protected String id;
    protected String categoria;
    protected int edadRecomendada;
    protected static final List<String> CATEGORIAS_PERMITIDAS = Arrays.asList("Aventuras", "Ciencia Ficción", "Romántica", "Historia", "Arte");
    protected boolean prestado;
    protected Usuario usuarioPrestamo;

    public Libro(String titulo, String autor, String id, String categoria, int edadRecomendada) {
    	if (!CATEGORIAS_PERMITIDAS.contains(categoria)) {
             throw new IllegalArgumentException("Categoría no válida");
        }
    	this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.categoria = categoria;
        this.edadRecomendada = edadRecomendada;
        this.prestado = false;
        this.usuarioPrestamo = null;
    }

    // Getters y Setters

    public String getitulo() {
        return titulo;
    }

    public void setTitulo(String title) {
        this.titulo = titulo;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getedadRecomendada() {
        return edadRecomendada;
    }

    public void setedadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public Usuario getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    public void setUsuarioPrestamo(Usuario usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autores=" + autor +
                ", identificador='" + id + '\'' +
                ", categoria='" + categoria + '\'' +
                ", edadRecomendada=" + edadRecomendada +
                ", prestado=" + prestado +
                ", usuarioPrestamo=" + (usuarioPrestamo != null ? usuarioPrestamo.getnombre() : "N/A") +
                '}';
    }
}

