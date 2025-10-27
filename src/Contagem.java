import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número positivo (N): ");
        int n = Integer.parseInt(scanner.nextLine());


        System.out.println("\n--- Contagem Crescente (0 a " + n + ") ---");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }


        System.out.println("\n--- Contagem Decrescente (" + n + " a 0) ---");
        int contador = n;
        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("\n--- Repetição do Nome ---");


        if (nome.length() > 6) {
            System.out.println("Seu nome tem mais de 6 letras. Vamos repeti-lo " + n + " vezes:");

            for (int i = 1; i <= n; i++) {
                System.out.println(i + ": " + nome);
            }
        } else {
            System.out.println("Seu nome tem 6 letras ou menos. Exibindo apenas uma vez:");
            System.out.println(nome);
        }

        scanner.close();
    }
}