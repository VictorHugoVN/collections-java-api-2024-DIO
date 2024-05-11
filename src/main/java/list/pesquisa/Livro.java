package main.java.list.pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {}

    public Livro(String livro, String autor, int anoPublicacao){

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return this.getTitulo() + ", Autor -> " +
                this.getAutor() + ", Ano de publicação -> " +
                this.getAnoPublicacao();
    }
}
