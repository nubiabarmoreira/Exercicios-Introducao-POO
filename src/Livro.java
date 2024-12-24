public class Livro {

    public String titulo;
    public String autor;
    public String isbn;
    public boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public void exibirDetalhes () {
        System.out.println("Seguem informações sobre o livro: ");
        System.out.println("Título: " + titulo + ". Autor: " + autor + ". ISBN: " + isbn + ". Disponível para empréstimo: " + disponivel);
    }

    public void emprestar () {
        if(disponivel = true){
            disponivel = false;
            System.out.println("O livro " + titulo + " foi emprestado com sucesso!");
        } else {
            System.out.println("O livro " + titulo + " já se encontra emprestado a outro usuário.");
        }
    }

    public void devolver() {
        if (disponivel = false){
            disponivel = true;
            System.out.println("O livro " + titulo + " foi devolvido com sucesso!");
        } else {
            System.out.println("O livro " + titulo + " já se encontrava disponível.");
        }
    }

    public String getTitulo () {
        return titulo;
    }

    public String getAutor () {
        return autor;
    }

    public String getIsbn () {
        return isbn;
    }
}
