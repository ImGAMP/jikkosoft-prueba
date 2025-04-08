public class Miembro {
    private String nombre;
    private String id;

    public Miembro(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }
}

