package modelo;

import java.time.LocalDate;

public class Despesa extends Transacao {
    public Despesa(String nome, String descricao, double valor, Categoria categoria) {
        super(nome, descricao, valor, categoria);
    }
    public Despesa(int id, String nome, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, nome, descricao, valor, data, categoria);
    }

    @Override
    public double efeitoNoSaldo() {
        return -valor;
    }

    @Override
    public String linhaExtrato() {
        return "[DESPESA] " + super.linhaExtrato();
    }

    @Override
    public String toString() {
        return linhaExtrato();
    }
    
}
