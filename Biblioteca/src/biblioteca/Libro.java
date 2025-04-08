public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isPrestado() { return prestado; }

    public void prestar() {
        if (prestado) {
            throw new IllegalStateException("El libro ya está prestado.");
        }
        prestado = true;
    }

    public void devolver() {
        if (!prestado) {
            throw new IllegalStateException("El libro no está prestado.");
        }
        prestado = false;
    }

    @Override
    public String toString() {
        return titulo + " de " + autor + (prestado ? " (Prestado)" : " (Disponible)");
    }
}

