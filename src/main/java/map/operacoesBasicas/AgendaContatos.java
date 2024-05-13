package main.java.map.operacoesBasicas;

import main.java.set.pesquisa.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }else{
            System.out.println("Coleção vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Victor", 1111);
        agendaContatos.adicionarContato("Daniele", 2222);
        agendaContatos.adicionarContato("Laysa", 3333);
        agendaContatos.adicionarContato("Rafael", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rafael");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Laysa"));


    }


}
