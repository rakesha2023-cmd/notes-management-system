import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotesServiceTest {

    NotesService service;

    @BeforeEach
    void setup() {
        service = new NotesService();
    }

    @Test
    void testCreateNote() {
        assertNotNull(service.createNote("Test"));
    }

    @Test
    void testGetNote() {
        service.createNote("Hello");
        assertEquals("Hello", service.getNote(1).content);
    }

    @Test
    void testUpdateNote() {
        service.createNote("Old");
        service.updateNote(1, "New");
        assertEquals("New", service.getNote(1).content);
    }

    @Test
    void testDeleteNote() {
        service.createNote("Delete");
        assertTrue(service.deleteNote(1));
    }
}