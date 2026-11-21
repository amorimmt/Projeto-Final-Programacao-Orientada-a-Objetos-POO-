package servico;
import excecoes.ControleGastosException;
import modelo.Transacao;

public interface Registravel {

    void inserir(Transacao transacao) throws ControleGastosException;

    void atualizar(int id, Transacao nova) throws ControleGastosException;

    void remover(int id) throws ControleGastosException;

    double consultarSaldo();

    String emitirExtrato();
    
}
