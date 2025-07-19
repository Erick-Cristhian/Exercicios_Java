import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {

        /*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0
        e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o
        programa deve informar se o número digitado pelo usuário é maior ou menor do que o número
        gerado.
         */

        System.out.println("Voce tera que adivinhar um numero entre 1 e X\nEscolha o valor de X para delimitar o limite do numero aleatorio: ");
        Scanner leitura = new Scanner(System.in);
        int limite = leitura.nextInt();
        int numero = new Random().nextInt(limite);
        int chute;
        int tentativas;


        for (tentativas = 5; tentativas > 0 ; tentativas-- ){
            System.out.println(String.format("Adivinhe o numero(entre 1 e %d): ",limite ));
            chute = leitura.nextInt();
            if (chute == numero){
                System.out.println("Parabens voce acertou!");
                break;
            }

            if (chute < numero){
                System.out.println(String.format("O numero Chave eh maior que %d",chute));
            }else{
                System.out.println(String.format("O numero Chave eh menor que %d",chute));
            }
        }

        if (tentativas == 0 ){
            System.out.println(String.format("Voce perdeu, o numero chave era %d", numero));
        }
    }
}
