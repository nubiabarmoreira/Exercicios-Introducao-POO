import java.util.ArrayList;

public class Biblioteca {

    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    public Biblioteca (ArrayList<Livro> livros, ArrayList<Usuario> usuarios) {
        this.livros = livros;
        this.usuarios = usuarios;
    }

    public void cadastrarLivro (Livro livro) {

    }

    public void cadastrarUsuario (Usuario usuario){

    }

    public void realizarEmprestimo (String isbn, int idUsuario) {

    }

    public void realizarDevolucao (String isbn, int idUsuario) {

    }

    public void exibirLivrosDisponiveis () {

    }
}