package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorEstoqueTotal = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                valorEstoqueTotal += (produto.getPreco() * produto.getQuantidade());
            }
        }
        return valorEstoqueTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }



    public static void main(String[] args){
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(12, "Tv", 3, 3000.0);
        estoqueProdutos.adicionarProduto(13, "Notebook", 1, 3500.0);
        estoqueProdutos.adicionarProduto(14, "Livro", 2, 100.0);
        estoqueProdutos.adicionarProduto(15, "Smartphone", 2, 3400.0);


        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque -> R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro -> " + estoqueProdutos.obterProdutoMaisCaro());


    }


}
