package modelo;

import java.time.LocalDate;

public abstract class Transacao {
    private static int proximoId = 1;

    protected int id;
    protected String nome;
    protected String descricao;
    protected double valor;
    protected LocalDate data;
    protected Categoria categoria;
    
    public Transacao(String nome, String descricao, double valor, Categoria categoria) {
        this(nome, descricao, valor, LocalDate.now(), categoria);
    }

    public Transacao(String nome, String descricao, double valor, LocalDate data, Categoria categoria) {
        this(proximoId++, nome, descricao, valor, data, categoria);
    }

    public Transacao(int id, String nome, String descricao, double valor, LocalDate data, Categoria categoria) {
        this.id = id;
        if (id >= proximoId) {
            proximoId = id + 1;
        }
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public abstract double efeitoNoSaldo();

    public String linhaExtrato() {
        String linha = "[" + id + "] ";
        linha = linha + data + " | ";
        linha = linha + nome + " | ";
        linha = linha + categoria + " | ";
        linha = linha + "R$ " + valor;
        return linha;
    }

    @Override
    public String toString() {
        return linhaExtrato();
    }

    public int getId() { 
        return id; }

    public String getNome() {
        return nome; }

    public String getDescricao() {
        return descricao; }

    public double getValor() {
        return valor; }

    public LocalDate getData() {
        return data; }

    public Categoria getCategoria() {
        return categoria; }

    public void setId(int id) {
        this.id = id; }

    public void setNome(String nome) {
        this.nome = nome; }

    public void setDescricao(String descricao) {
        this.descricao = descricao; }

    public void setValor(double valor) {
        this.valor = valor; }

    public void setData(LocalDate data) {
        this.data = data; }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria; }
}


