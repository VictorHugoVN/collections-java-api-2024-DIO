package main.java.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private String nome;
    private int cod;
    private Double preco;
    private int quantidade;

    public Produto(String nome, int cod, Double preco, int quantidade){
        this.setNome(nome);
        this.setCod(cod);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    @Override
    public int compareTo(Produto p) {
        return this.getNome().compareToIgnoreCase(p.getNome());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    public int getCod(){
        return this.cod;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return this.preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    public String toString(){
        return "\nProduto{ Nome -> " + this.getNome() +
                ", Código -> " + this.getCod() +
                ", Preço -> " + this.getPreco() +
                ", Quantidade -> " + this.getQuantidade() +
                "}";
     }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
