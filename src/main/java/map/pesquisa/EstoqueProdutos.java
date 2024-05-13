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
                }
            }
        }
        return produtoMaisCaro;
    }






}
