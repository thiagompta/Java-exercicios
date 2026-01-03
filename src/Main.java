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
        if (numero % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }

    }
    }