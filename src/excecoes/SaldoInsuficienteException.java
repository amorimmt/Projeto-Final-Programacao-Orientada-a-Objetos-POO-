package excecoes;

public class SaldoInsuficienteException extends ControleGastosException {

    private final double saldoAtual;
    private final double valorNecessario;

    public SaldoInsuficienteException(double saldoAtual, double valorNecessario) {
        super("Saldo insuficiente. Saldo atual: R$ " +saldoAtual + ", valor necessário: R$ " + valorNecessario);
        this.saldoAtual = saldoAtual;
        this.valorNecessario = valorNecessario;

    }
    
    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getValorNecessario() {
        return valorNecessario;
    }
}
