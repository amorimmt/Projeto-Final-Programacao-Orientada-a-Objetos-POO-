package excecoes;

public class NomeInvalidoException extends ControleGastosException {
    public NomeInvalidoException() {
        super("O nome não pode ser nulo e nem vazio.");
    }
    
}
