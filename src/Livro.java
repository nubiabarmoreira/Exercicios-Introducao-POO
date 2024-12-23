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
        System.out.println("Título: " + titulo + ". Autor: " + autor + ". ISBN: " + isbn + ". Disponível para empréstimo: " + disponivel);
    }

    public void emprestar () {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
