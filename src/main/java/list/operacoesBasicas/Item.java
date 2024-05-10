package main.java.list.operacoesBasicas;

public class Item {

    private String name;
    private Double price;
    private Integer quantity;

    public Item(){}

    public Item(String name, Double price, Integer quantity){
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public String toString(){
        return this.getName() + ", R$" +
                this.getPrice() + ", Quantidade -> " +
                this.getQuantity();
    }


}
