import br.com.exercicios.main.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercicio 1 ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
        //Exercicio 2 IdadePessoa
        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Jorge");
        idade.setIdade(21);
        System.out.println("Idade de " + idade.getNome() + " é " + idade.getIdade());
        idade.maiorIdade();
        //Exercicio 3 Produto
        Produto meuproduto = new Produto();
        meuproduto.setNome("Arroz");
        meuproduto.setPreco(18.99);
        System.out.println(meuproduto.getNome());
        System.out.println(meuproduto.getPreco());
        meuproduto.aplicarDesconto(15);
        System.out.println("produto com o desconto é " + meuproduto.getPreco());
        //Exercicio 4 Aluno
        Aluno2 meuAluno2 = new Aluno2();
        meuAluno2.setNome("Patrick");
        meuAluno2.mediaNota(10.0);
        meuAluno2.mediaNota(8.0);
        meuAluno2.mediaNota(6.0);
        System.out.println(meuAluno2.getNome() + " ficou com a média: " + meuAluno2.pegaMedia());
        //Exercicio 5 Livro
        Livro meuLivro = new Livro();
        meuLivro.setTitulo("A 5 passos de você");
        meuLivro.setAutor("Stephen King");
        meuLivro.exibirDetalhes();




        
    }
    }