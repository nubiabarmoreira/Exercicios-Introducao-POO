import java.util.ArrayList;

public class Biblioteca {

    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    public Biblioteca () {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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
        System.out.println("Segue listagem de livros disponiveis: ");
        for(Livro livro : livros){
            if(livro.disponivel){
                System.out.println("Título: " + livro.getTitulo() + ". Autor: " + livro.getAutor() + ". ISBN: " + livro.getIsbn());
            }
        }
    }
}