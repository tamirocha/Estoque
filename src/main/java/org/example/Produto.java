package org.example;

public class Produto {

    public String descricao;
    public int quantidade;

    public void descrever() {
        System.out.println(descricao + " - " + quantidade + " itens");
    }

    /*public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }*/

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
