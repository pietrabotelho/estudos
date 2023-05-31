import java.util.Scanner;

public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entradaDeDados.nextLine();
        System.out.println("Digite o tipo de conta: Corrente ou Poupança");
        String tipoDeConta = entradaDeDados.nextLine();
        double saldo = 500.0;
        int opcao = 0;
        System.out.println(String.format("****************************************\nDados iniciais do cliente:\n\nNome:                    %s\nTipo de conta:           %s\nSaldo:                   R$ %.2f\n****************************************\n", nome, tipoDeConta, saldo));
        String menuDeOpcoes = "** Operações **\n1- Verificar Saldo\n2- Receber Valor\n3- Transferir Valor\n4- Sair\n\nDigite a opção desejada:\n";

        while(opcao != 4) {
            System.out.println(menuDeOpcoes);
            opcao = entradaDeDados.nextInt();
            if (opcao == 1) {
                System.out.println(String.format("Seu saldo atual é: R$ %.2f", saldo));
            } else {
                double transferencia;
                if (opcao == 2) {
                    System.out.println("Informe o valor a receber:");
                    transferencia = entradaDeDados.nextDouble();
                    saldo += transferencia;
                    System.out.println(String.format("Seu saldo atual é R$ %.2f", saldo));
                } else if (opcao == 3) {
                    System.out.println("Digite o valor da transferência:");
                    transferencia = entradaDeDados.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Não é possível realizar essa tranferência");
                    } else {
                        saldo -= transferencia;
                        System.out.println("Seu saldo atual é R$" + saldo);
                    }
                } else {
                    if (opcao == 4) {
                        System.out.println("Aplicação fechada");
                        break;
                    }

                    System.out.println("Essão opção não existe");
                }
            }
        }

    }
}
