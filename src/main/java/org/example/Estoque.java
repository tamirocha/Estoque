package org.example;

public class Estoque {

    public Produto[] produto;

    public void listarProdutos() {
        System.out.println("Produtos em Estoque");
        System.out.println("---------------------------------");
        for (int i = 0; i < produto.length; i ++) {
            produto[i].descrever();
        }
    }
}
