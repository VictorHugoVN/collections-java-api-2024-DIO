package main.java.set.pesquisa;

public class Tarefa {

    private String descricao;
    private boolean statusConclusao;

    public Tarefa(String descricao){
        this.setDescricao(descricao);
    }

    public Tarefa(String descricao, boolean statusConclusao){
        this.setDescricao(descricao);
        this.setStatusConclusao(statusConclusao);
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setStatusConclusao(boolean statusConclusao){
        this.statusConclusao = statusConclusao;
    }

    public boolean getStatusConclusao(){
        return this.statusConclusao;
    }

    public String toString(){
        return "Tarefa{" +
                "Descrição -> " + this.getDescricao() +
                '\'' + ", Concluída -> " + this.getStatusConclusao() +
                "}";
    }


}
