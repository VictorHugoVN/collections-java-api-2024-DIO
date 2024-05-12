package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numeroTelefone){
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args){
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("João", "11111");
        agendaContato.adicionarContato("Maria", "12122");
        agendaContato.adicionarContato("Fernanda", "33332");

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Maria"));
        System.out.println(agendaContato.atualizarNumeroContato("Fernanda", "12345"));



    }



}
