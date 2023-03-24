package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos produtos?");
        int quantidadeProdutos = entrada.nextInt();
        entrada.nextInt();

        Estoque estoque = new Estoque();
        estoque.produto = new Produto[quantidadeProdutos];

        for(int i = 0; i < estoque.produto.length; i++) {
            estoque.produto[i]=new Produto();

            System.out.println("Produto" + i);
            System.out.println("------------------------");
            System.out.println("Descrição:");
            estoque.produto[i].descricao = entrada.nextLine();
            System.out.println("Quantidade de itens:");
            estoque.produto[i].quantidade=entrada.nextInt();
            entrada.nextLine();
        }
        estoque.listarProdutos();
    }
}


        /*Produto[] p = new Produto[5];
        p[0] = new Produto("caneta azul", 10);
        p[1] = new Produto("caneta preta", 25);
        p[2] = new Produto("caneta vermelha", 12);
        p[3] = new Produto("lápis 0.9", 50);
        p[4] = new Produto("borracha", 16);

        System.out.println("Itens e Quantidades:");
        System.out.println("--------------------------------");
        p[0].descrever();
        p[1].descrever();
        p[2].descrever();
        p[3].descrever();
        p[4].descrever();*/



