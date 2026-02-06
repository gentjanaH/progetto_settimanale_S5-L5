package gentjanahani.progettoSettimanale_s5l5.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id) {
        super("Spiacenti, non abbiamo trovati quello che cercavi. Controlla se l'ID: " + id + " sia corretto e riprova.");
    }
}
