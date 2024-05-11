package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosDescendentes);
        return numerosDescendentes;
    }


}
