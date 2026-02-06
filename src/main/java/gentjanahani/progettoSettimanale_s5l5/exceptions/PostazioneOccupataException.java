package gentjanahani.progettoSettimanale_s5l5.exceptions;

public class PostazioneOccupataException extends RuntimeException {
    public PostazioneOccupataException() {
        super("La postazione è gia prenotata nella data seleziona. Oppure l'utente ha gia una prenotazione nello stesso giorno");
    }
}
