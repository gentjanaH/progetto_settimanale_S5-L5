package gentjanahani.progettoSettimanale_s5l5.exceptions;

public class NessunRisultatoException extends RuntimeException {
    public NessunRisultatoException() {
        super("La ricerca non ha prodotto risultati.");
    }
}
