package com.example.fazenda;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private String descricao;
    private int imagemResId; // ID da imagem para o produto

    public Produto(String nome, double preco, int estoque, String descricao, int imagemResId) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.descricao = descricao;
        this.imagemResId = imagemResId;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImagemResId() {
        return imagemResId;
    }
}
