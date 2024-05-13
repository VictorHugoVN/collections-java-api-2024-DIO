package main.java.map.operacoesBasicas;

public class Contato {

    private String nome;
    private Integer telefone;

    public Contato(String nome, Integer telefone){
        this.setNome(nome);
        this.setTelefone(telefone);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTelefone(Integer telefone){
        this.telefone = telefone;
    }

    public Integer getTelefone(){
        return this.telefone;
    }



}
