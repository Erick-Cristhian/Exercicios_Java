import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        //Usar Scanner e loop pra fazer um sistema
        //de Media de notas de filmes, com condicional -1*

        double nota = 0;
        int vezesloop = 0;
        double media = 0;
        Scanner leitura = new Scanner(System.in);

        while (nota != -1) {
            System.out.println("Diga sua nota para um filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                media += nota;
                vezesloop++;
            }

        }

        if (media == 0){
            System.out.println("A media das notas é: 0");
        } else {
            System.out.println("A media das notas é: " + media / vezesloop);
        }

    }
}
