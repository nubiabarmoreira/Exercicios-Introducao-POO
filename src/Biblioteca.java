import java.util.ArrayList;

public class Biblioteca {

    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    public Biblioteca (ArrayList<Livro> livros, ArrayList<Usuario> usuarios) {
        this.livros = new ArrayList<>(Livro);
        this.usuarios = new ArrayList<>(Usuario);
    }

    public void cadastrarLivro (Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " cadastrado com sucesso!");
    }

    public void cadastrarUsuario (Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNomeDoUsuario() + " cadastrado com sucesso!");
    }

    public void realizarEmprestimo (String isbn, int idUsuario) {

    }

    public void realizarDevolucao (String isbn, int idUsuario) {

    }

    public void exibirLivrosDisponiveis () {

    }
}