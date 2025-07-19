import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        System.out.println("Insira um valor e a tabuada dele sera exibida logo em seguida: ");

        Scanner leitura = new Scanner(System.in);

        int num = leitura.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num * i);
        }
    }
}
