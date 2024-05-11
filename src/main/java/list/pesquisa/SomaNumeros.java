package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaInt;

    public SomaNumeros(){
        listaInt = new ArrayList<>();
    }

    public void adicionarNumero(Integer num){
        listaInt.add(num);
    }

    public Integer calcularSoma(){
        Integer soma = 0;
        if(!listaInt.isEmpty()){
            for(Integer num: listaInt){
                soma += num;
            }
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero = 0;
        if(!listaInt.isEmpty()){
            maiorNumero = listaInt.get(0);
            for(Integer num: listaInt){
                if(num > maiorNumero){
                    maiorNumero = num;
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = 0;
        if(!listaInt.isEmpty()){
            menorNumero = listaInt.get(0);
            for(Integer num: listaInt){
                if(num < menorNumero){
                    menorNumero = num;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return this.listaInt;
    }

    public static void main(String[] args){

        //Testes da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(19);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(12);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());



    }

}
