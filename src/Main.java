import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            //Exercicio 1 Pessoa
            Scanner scanner = new Scanner(System.in);
            Pessoa minhaPessoa = new Pessoa();
            Calculadora minhaCalculadora = new Calculadora();
            minhaPessoa.texto = "ola mundo!";
            System.out.println(minhaPessoa.texto);
            //Exercicio 2 calculadora
            minhaCalculadora.numero = scanner.nextInt();
            System.out.println(minhaCalculadora.numero *2);
            //Exercicio 3 Musica
            Musica artistasMusica = new Musica();
            artistasMusica.titulo = "Boate azul";
            artistasMusica.artista= "Bruno & Marrone";
            artistasMusica.anoDelacamento= 2001;
            artistasMusica.exibeFichaTecnica();
            artistasMusica.avalia(10);
            artistasMusica.avalia(9);
            artistasMusica.avalia(7);
            System.out.println("A média de avaliação dessa musica é: " + artistasMusica.pegaMedia());
            //Exercicio 4 Carro
            carro meuCarro = new carro();
            meuCarro.modelo = "VW Voyage";
            meuCarro.ano = 2014;
            meuCarro.cor = "Branco";
            meuCarro.exibeFichaTecnica();
            //Exercicio 5 Aluno
            Aluno escolaAluno = new Aluno();
            escolaAluno.nome = "Pedro";
            escolaAluno.idade = 12;
            escolaAluno.exibirInformações();


    }
    }