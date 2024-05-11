package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavras(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavras(){
        if(!palavrasUnicas.isEmpty()){
            for(String palavra: palavrasUnicas){
                System.out.print(palavra + " ");
            }
        }else{
            System.out.println("Conjunto vazio!");
        }
        System.out.println();
    }

    public static void main(String[] args){
        ConjuntoPalavras conjuntoPalavrasUnicas = new ConjuntoPalavras();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("RSA");

        System.out.println("RSA in conjunto -> " + conjuntoPalavrasUnicas.verificarPalavra("RSA"));
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.exibirPalavras();


    }




}
