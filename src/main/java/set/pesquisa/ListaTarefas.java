package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa: tarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(tarefa);
                }
            }
            tarefaSet.removeAll(tarefasParaRemover);
        }else{
            System.out.println("Conjunto de tarefas vazio!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Total de tarefas, neste momento -> " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa: tarefaSet) {
                if (tarefa.getStatusConclusao()) {
                    tarefasConcluidas.add(tarefa);
                }
            }
        }else{
            System.out.println("Conjunto de tarefas vazio!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa: tarefaSet){
                if(!tarefa.getStatusConclusao()){
                    tarefasPendentes.add(tarefa);
                }
            }
        }else{
            System.out.println("Conjunto de tarefas vazio!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setStatusConclusao(true);
            }
        }
    }

    public void marcarTarefaComoPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = tarefa;
                break;
            }
        }

        if(tarefaPendente != null){
            if(tarefaPendente.getStatusConclusao()){
                tarefaPendente.setStatusConclusao(false);
            }
        }else{
            System.out.println("Tarefa não encontrada na lista!");
        }
    }

    public void removerTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("O conjunto de tarefas já está vazio!");
        }else{
            tarefaSet.clear();
        }
    }


    public static void main(String[] args){

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("abc");
        listaTarefas.adicionarTarefa("def");
        listaTarefas.adicionarTarefa("ghi");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        System.out.println("Tarefas concluídas -> " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes -> " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("def");
        listaTarefas.marcarTarefaConcluida("ghi");
        System.out.println("Tarefas concluídas -> " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaComoPendente("def");
        System.out.println("Tarefas pendentes -> " + listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefas();
        listaTarefas.exibirTarefas();


    }



}
