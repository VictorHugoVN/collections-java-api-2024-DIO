package main.java.list.operacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao){
        this.setDescricao(descricao);
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;

    }
}
