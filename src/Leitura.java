import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o nome do filme?");
        String nomeDoFilme = leitura.nextLine();
        System.out.println("Qual a nota do filme?");
        float notaDoFilme = leitura.nextFloat();
        System.out.println("Qual o ano de lancamento do filme?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println(String.format("\nFilme: %s\nNota: %f\nLancamento: %d", (String) (nomeDoFilme),(float) (notaDoFilme),(int) (anoDeLancamento)));
    }
}
