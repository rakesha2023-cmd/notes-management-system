import java.util.*;

public class NotesService {

    private Map<Integer, Note> notes = new HashMap<>();
    private int idCounter = 1;

    public Note createNote(String content) {
        Note note = new Note(idCounter++, content);
        notes.put(note.id, note);
        return note;
    }

    public Note getNote(int id) {
        return notes.get(id);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }

    public Note updateNote(int id, String content) {
        if (notes.containsKey(id)) {
            notes.get(id).content = content;
            return notes.get(id);
        }
        return null;
    }

    public boolean deleteNote(int id) {
        return notes.remove(id) != null;
    }
}