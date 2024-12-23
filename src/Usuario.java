import java.util.ArrayList;

public class Usuario {

    public String nomeDoUsuario;
    public int id;
    public ArrayList<Livro> livrosEmprestados;

    public Usuario (String nome, int id, ArrayList livrosEmprestados) {
        this.nomeDoUsuario = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void exibirDetalhes () {
        System.out.println("Usuário: " + nomeDoUsuario + ". ID: " + id + ". Livros que estão emprestados para o usuário: " + livrosEmprestados);
    }

    public boolean adicionarLivro (Livro livro) {
        if(livrosEmprestados.size() < 3){
            livrosEmprestados.add(livro);
            System.out.println("O livro foi emprestado ao usuário!");
            return true;
        } else {
            System.out.println("O usuário já possui o limite permitido de livros emprestados de uma única vez.");
            return false;
        }
    }

    public boolean removerLivro (Livro livro) {
        if(livrosEmprestados.size() <= 0){
            System.out.println("O livro não está emprestado para o usuário.");
            return false;
        } else {
            livrosEmprestados.remove(livro);
            System.out.println("O livro foi devolvido pelo usuário!");
            return true;
        }
    }
}