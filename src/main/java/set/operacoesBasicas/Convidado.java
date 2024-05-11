package main.java.set.operacoesBasicas;

public class Convidado {


    private String nome;
    private int codigo;

    public Convidado(){};

    public Convidado(String nome, int codigo){
        this.setNome(nome);
        this.setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Convidado{" +
                "Nome -> " + this.getNome() +
                '\'' + ", Código Convite -> " + this.getCodigo() +
                "}";
    }


}
