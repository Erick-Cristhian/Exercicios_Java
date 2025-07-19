import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        Scanner leitura = new Scanner (System.in);
        System.out.print("Escolha o nome de Usuario da sua Conta: ");
        String nome = leitura.nextLine();
        System.out.print("Escolha o saldo Inicial de sua Conta: ");
        int saldoAtual = leitura.nextInt();
        int escolha = 0;
        System.out.printf("\n******************************\nNome: %s\nTipo de conta: Corrente\nSaldo Inicial: %d\n******************************\n",nome,saldoAtual);
        while (escolha != 4) {

            System.out.println("\nOperações\n\n1- Consultar Dados\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a Opção Desejada: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {

                System.out.printf("O seu Saldo atual é: %d\n",saldoAtual);

            } else if (escolha == 2 ) {

                System.out.print("Insira a quantia a ser recebida: ");
                int quantia = leitura.nextInt();
                if (quantia > 0) {
                    saldoAtual += quantia;
                    System.out.printf("Saldo atualizado para %d", saldoAtual);
                }else {
                    System.out.println("A quantia inseria é invalida");
                }

            } else if (escolha == 3) {

                System.out.print("Insira a quantia de transferencia: ");
                int quantia = leitura.nextInt();
                if (quantia > 0 && quantia <= saldoAtual) {
                    saldoAtual -= quantia;
                    System.out.printf("Saldo atualizado para %d", saldoAtual);
                }else {
                    System.out.println("A quantia inseria é invalida");
                }

            } else if (escolha == 4) {
                System.out.println("Operação finalizada.");

            } else {
                System.out.println("Operação Invalida!");
            }

        }
    }
}
