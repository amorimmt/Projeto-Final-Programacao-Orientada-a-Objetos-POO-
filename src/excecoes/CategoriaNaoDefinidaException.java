package excecoes;

public class CategoriaNaoDefinidaException extends ControleGastosException {
    
    public CategoriaNaoDefinidaException() {
        super("A categoria não foi definida.");
    }

    public CategoriaNaoDefinidaException(String mensagem) {
        super(mensagem);
    }
}
