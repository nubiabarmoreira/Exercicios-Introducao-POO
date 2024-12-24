import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("--------------------------------");
        System.out.println("Bem-vindo à Biblioteca da Núbia!");
        System.out.println("--------------------------------");
        System.out.println(" ");

        for (menuDeOpcoes menu : menuDeOpcoes.values()) {
            System.out.println(menu.getDescricao());
        }

        System.out.println(" ");
        System.out.print("O que você deseja fazer: ");
        String opcaoDoUsuario = input.next();

        switch (opcaoDoUsuario) {
            case 1:
                cadastrarLivro(input, biblioteca);
                break;
            case 2:
                cadastrarUsuario(input, biblioteca);
                break;

            case 3:
                realizarEmprestimo(input, biblioteca);
                break;

            case 4:
                realizarDevolucao(input, biblioteca);
                break;

            case 5:
                exibirLivrosDisponiveis(biblioteca);
                break;

            case 6:
                System.out.println("Saindo do sistema.");
                input.close();
                return;

            default:
                System.out.println("Opção inválida. Selecione uma opção disponível.");
        }
    }

    private static void cadastrarLivro(Scanner input, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro: ");
        String titulo = input.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = input.nextLine();

        System.out.println("Digite o  ISBN do livro: ");
        String isbn = input.nextLine();

        Livro livro = new Livro(titulo, autor, isbn);
        biblioteca.cadastrarLivro(livro);
    }

    private static void cadastrarUsuario(Scanner input, Biblioteca biblioteca) {
        System.out.println("Digite o nome do usuário: ");
        String nomeDoUsuario = input.nextLine();

        System.out.println("Digite o ID do usuário: ");
        int id = input.nextInt();

        Usuario usuario = new Usuario(nomeDoUsuario, id);
        biblioteca.cadastrarUsuario(usuario);
    }

    private static void exibirLivrosDisponiveis(Biblioteca biblioteca) {
        biblioteca.exibirLivrosDisponiveis();
    }
}