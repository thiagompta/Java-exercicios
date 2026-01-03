import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = """
                Digite 1 numero
                """;
        System.out.print(texto);
        int numero = leitor.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + " é: " + fatorial);

    }
    }