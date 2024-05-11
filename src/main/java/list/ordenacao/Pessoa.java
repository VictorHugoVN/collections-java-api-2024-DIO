package main.java.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(){}

    public Pessoa(String nome, int idade, Double altura){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.getIdade(), p.getIdade());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(Double altura){
        this.altura = altura;
    }

    public Double getAltura(){
        return this.altura;
    }

    public String toString(){
        return this.getNome() + ", Idade -> " +
                this.getIdade() + ", Altura -> " +
                this.getAltura();
    }


}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
