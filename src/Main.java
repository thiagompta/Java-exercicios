import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = """
                Digite 1 numero para ver a tabuada do mesmo
                """;
        System.out.print(texto);
        int contador = 1;
        int numero = leitor.nextInt();
        while (contador >= 0 && contador <= 10){;
            int resultado = numero * contador;
            System.out.println( numero + "x" + contador + "=" + resultado);
            contador++;
        }
    }
    }