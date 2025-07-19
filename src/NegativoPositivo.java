import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        /*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
        "Número positivo", caso contrário, exiba "Número negativo".
         */
        System.out.println("Digite um Numero e o programa ira verifica c eh negativo ou positivo: ");
        Scanner leitura = new Scanner(System.in);

        int numero = leitura.nextInt();
        if (numero < 0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Número positivo");
        }

    }
}
