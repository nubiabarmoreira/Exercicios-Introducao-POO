import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

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


    }

    public String instanciaUsuarios () {
        Usuario usuario1 = new Usuario("Maria", 123, "Livro AAA");
        Usuario usuario2 = new Usuario("Nubia", 456, "Livro BBB");
        Usuario usuario3 = new Usuario("Laura", 789, "Livro CCC");
        Usuario usuario4 = new Usuario("Vini", 901, "Livro DDD");
    }

    public String instanciaLivros () {
        Livro livro1 = new Livro("Livro AAA", "Autor AAA", "12", true);
        livro1.titulo = "Livro AAA";
        livro1.autor = "Autor AAA";
        livro1.isbn = "12";
        livro1.disponivel = true;


        /*Livro livro2 = new Livro("Livro BBB", "Autor BBB", "12", true);
        Livro livro3 = new Livro("Livro CCC", "Autor CCC", "12", true);
        Livro livro4 = new Livro("Livro DDD", "Autor DDD", "12", true);
        Livro livro5 = new Livro("Livro EEE", "Autor EEE", "12", true);
        Livro livro6 = new Livro("Livro FFF", "Autor FFF", "12", true);*/
    }