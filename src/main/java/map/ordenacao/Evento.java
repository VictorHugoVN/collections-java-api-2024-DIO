package main.java.map.ordenacao;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao){
        this.setNome(nome);
        this.setNomeAtracao(atracao);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNomeAtracao(String atracao){
        this.atracao = atracao;
    }

    public String getAtracao(){
        return this.atracao;
    }

    public String toString(){
        return "Evento{ Nome=" + this.getNome() +
                ", Atração=" + this.getAtracao() +
                " }\n";
    }
}
