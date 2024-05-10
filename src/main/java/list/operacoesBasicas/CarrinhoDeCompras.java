package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listItens;

    public CarrinhoDeCompras(){
        this.listItens = new ArrayList<>();
    }

    public void adicionarItem(String name, Double price, Integer quantity){
        Item item = new Item(name, price, quantity);
        listItens.add(item);
    }

    public void removerItem(String name){
        List<Item> listItensRemover = new ArrayList<>();
        for(Item item: listItens){
            if(item.getName().equalsIgnoreCase(name)){
                listItensRemover.add(item);
            }
        }
        listItens.removeAll(listItensRemover);
    }

    public Double calcularValorTotal(){
        Double total = 0.0;
        for(Item item: listItens){
            total += (item.getPrice() * item.getQuantity());
        }
        return total;
    }

    public void exibirItens(){
        for(Item item: listItens){
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("TV", 2000.0, 3);
        carrinhoDeCompras.adicionarItem("Smartphone", 2500.0, 2);
        carrinhoDeCompras.adicionarItem("Computador", 4000.0, 1);

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("TV");

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());


    }


}
