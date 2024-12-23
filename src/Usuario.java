import java.util.ArrayList;

public class Usuario {

    public String nome;
    public int id;
    public ArrayList<Livro> livrosEmprestados;

    public Usuario (String nome, int id, ArrayList livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void exibirDetalhes () {
        System.out.println(Usuario.this);
    }

    public void adicionarLivro () {
        livrosEmprestados.add();
    }

    public void removerLivro () {
        livrosEmprestados.remove();
    }
}