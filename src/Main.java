//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Essa aqui e o ScreenMatch");
        System.out.println("Filme: Rio");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lancamento é" + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double nota = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Rio
                Filme infantil com passaros do RJ
                Muito Bom!
                Ano de Lancamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(String.format("O filme tem: %d estrelas.", classificacao));
    }
}