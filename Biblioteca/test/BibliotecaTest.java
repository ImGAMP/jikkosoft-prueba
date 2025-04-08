import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
    }

    @Test
    public void testBuscarLibroPorTitulo() {
        Libro libro = biblioteca.buscarLibroPorTitulo("1984");
        assertEquals("1984", libro.getTitulo());
    }

    @Test
    public void testBuscarLibroNoExistenteLanzaExcepcion() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            biblioteca.buscarLibroPorTitulo("Inexistente");
        });
        assertTrue(exception.getMessage().contains("Libro no encontrado"));
    }

    @Test
    public void testPrestamoYDevolucionDesdeBiblioteca() {
        biblioteca.prestarLibro("1984");
        Libro libro = biblioteca.buscarLibroPorTitulo("1984");
        assertTrue(libro.isPrestado());

        biblioteca.devolverLibro("1984");
        assertFalse(libro.isPrestado());
    }
}

