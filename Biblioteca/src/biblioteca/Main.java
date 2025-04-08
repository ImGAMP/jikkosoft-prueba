public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry"));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez"));

        biblioteca.registrarMiembro(new Miembro("Laura Gómez", "U001"));
        biblioteca.registrarMiembro(new Miembro("Carlos Ruiz", "U002"));

        System.out.println("=== Libros disponibles ===");
        biblioteca.listarLibros();

        System.out.println("\n=== Prestando libros ===");
        biblioteca.prestarLibro("1984");

        System.out.println("\n=== Estado de los libros ===");
        biblioteca.listarLibros();

        System.out.println("\n=== Devolviendo libro ===");
        biblioteca.devolverLibro("1984");

        System.out.println("\n=== Estado final ===");
        biblioteca.listarLibros();
    }
}

