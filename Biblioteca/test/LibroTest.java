import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    public void testPrestamoYDevolucion() {
        Libro libro = new Libro("1984", "George Orwell");

        assertFalse(libro.isPrestado());
        libro.prestar();
        assertTrue(libro.isPrestado());

        libro.devolver();
        assertFalse(libro.isPrestado());
    }

    @Test
    public void testPrestamoDobleLanzaExcepcion() {
        Libro libro = new Libro("1984", "George Orwell");
        libro.prestar();

        Exception exception = assertThrows(IllegalStateException.class, libro::prestar);
        assertEquals("El libro ya está prestado.", exception.getMessage());
    }

    @Test
    public void testDevolucionSinPrestamoLanzaExcepcion() {
        Libro libro = new Libro("1984", "George Orwell");

        Exception exception = assertThrows(IllegalStateException.class, libro::devolver);
        assertEquals("El libro no está prestado.", exception.getMessage());
    }
}

