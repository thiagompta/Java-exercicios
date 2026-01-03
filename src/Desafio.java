import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valorAtual = 2500.00;

        String dadosIniciais = """
                ***********************
                Dados iniciais do cliente:
                Nome: Jacqueline Oliveira
                Tipo conta: Corrente
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(valorAtual);

        String operacoes = """
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println(dadosIniciais);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(operacoes);//sempre repete após escolher uma opção
            opcao = leitor.nextInt();//lê as opções
            if (opcao == 1) {
                System.out.println("Saldo atual: R$ " + String.format("%.2f", valorAtual));
                //Só mostra o saldo atual e volta para o menu
            } else if (opcao == 2) {
                double recebeTransferencia = leitor.nextDouble(); //recebe o valor que vai querer receber
                while(true){        //repetição para o cliente digitar valor valido
                    System.out.println("Informe o valor que deseja receber:");
                    recebeTransferencia = leitor.nextDouble();
                    if(recebeTransferencia <=0){ //se o cliente digitar um valor invalido retorna ao inicio do while
                        System.out.println("Valor inválido! Digite um valor maior que zero.");
                        } else {
                        valorAtual += recebeTransferencia;
                        System.out.println("Transferencia recebida com Sucesso!");
                        System.out.println("Saldo atualizado: R$ "+ String.format("%.2f", valorAtual));
                        break;  //Após transferir encera a repetição e retorna ao menu com o saldo atual
                    }
                    }

                } else if (opcao == 3) {
                double valorTransferencia;
                while (true){   //Repetição para validar informações caso o cliente digite um valor nulo ou acima do saldo atual
                    System.out.println("Informe o valor que deseja transferir:");
                    valorTransferencia = leitor.nextDouble();
                    if (valorTransferencia <= 0){
                        System.out.println("Valor inválido! Digite um valor maior que zero.");
                    }else if(valorTransferencia > valorAtual){
                        System.out.println("Saldo insuficiente! Seu saldo é R$ "+ String.format("%.2f", valorAtual));
                    }else{
                        valorAtual -= valorTransferencia;
                        System.out.println("Transferencia Realizada com Sucesso!");
                        System.out.println("Saldo atualizado: R$ "+ String.format("%.2f", valorAtual));
                        break; //Finalizar após concluir a transferencia
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar o sistema!");
                break;

            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}

