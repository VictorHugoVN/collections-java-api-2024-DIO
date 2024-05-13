package main.java.map.pesquisa;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco){
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString(){
        return "\nProduto{ " +
                "Nome=" + this.getNome() +
                ", Preço=R$" + this.getPreco() +
                ", Quantidade=" + this.getQuantidade() +
                " }";
    }

}
