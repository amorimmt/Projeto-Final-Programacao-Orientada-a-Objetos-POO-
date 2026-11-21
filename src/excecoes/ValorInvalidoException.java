package excecoes;

public class ValorInvalidoException extends ControleGastosException {
    public ValorInvalidoException(double valor){
        super("Valor inválido: " + valor + ". O valor deve ser maior que zero.");
    }
    
}
