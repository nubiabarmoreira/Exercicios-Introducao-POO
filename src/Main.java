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
}