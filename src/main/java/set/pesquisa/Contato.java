package main.java.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private String numeroTelefone;

    public Contato(String nome, String numeroTelefone){
        this.setNome(nome);
        this.setNumeroTelefone(numeroTelefone);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone(){
        return this.numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String toString(){
        return "Contato{" +
                "Nome -> " + this.getNome() +
                '\'' + ", Número de Telefone -> " + this.getNumeroTelefone() +
                "}";
    }
}
