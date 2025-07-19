import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        //Usar Scanner e loop pra fazer um sistema
        //de Media de notas de filmes*

        double media = 0;
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota de um filme: ");
            double nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("A media das notas é: " + media / 3);


    }
}
