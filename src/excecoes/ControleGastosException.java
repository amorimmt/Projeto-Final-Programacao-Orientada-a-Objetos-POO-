package excecoes;

public class ControleGastosException extends Exception {
    public ControleGastosException(String mensagem) {
        super(mensagem);
    }

    public ControleGastosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
