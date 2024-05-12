package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, Double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }


    public static void main(String[] args){

        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("produto 1", 12, 10.0, 23);
        cadastroProduto.adicionarProduto("produto 2", 13, 112.0, 45);
        cadastroProduto.adicionarProduto("produto 3", 14, 20.0, 29);
        cadastroProduto.adicionarProduto("produto 4", 15, 450.0, 20);

        System.out.println(cadastroProduto.produtoSet);
        //System.out.println(cadastroProduto.exibirProdutosPorNome());
        //System.out.println(cadastroProduto.exibirProdutosPorPreco());


    }




}
