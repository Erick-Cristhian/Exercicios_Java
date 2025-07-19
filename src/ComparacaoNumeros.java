import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma
        //mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        System.out.println("Insira dois valores inteiros, eles serão comparados pelo programa.");

        Scanner leitura = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int valor1 = leitura.nextInt();
        System.out.print("Insira o segundo valor: ");
        int valor2 = leitura.nextInt();

        if (valor1 == valor2){
            System.out.println("Os valores são IGUAIS");
        }else{
            System.out.println("Os valores são DIFERENTES");
            if (valor1 > valor2){
                System.out.println("O primeiro valor e MAIOR");
            }else{
                System.out.println("O segundo valor e MAIOR");
            }
        }
    }
}
