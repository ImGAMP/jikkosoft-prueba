import java.util.*;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Miembro> miembros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        throw new NoSuchElementException("Libro no encontrado: " + titulo);
    }

    public void prestarLibro(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        libro.prestar();
        System.out.println("Libro prestado: " + libro.getTitulo());
    }

    public void devolverLibro(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        libro.devolver();
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }
}

