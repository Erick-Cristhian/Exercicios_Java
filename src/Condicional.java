public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2020) {
            System.out.println("Lançamentos que os clientes curtem!");
        } else {
            System.out.println("Filmes retrô que talvez voce goste!!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado! Pode assistir!!");
        } else {
            System.out.println("Deve pagar a fatura!");
        }

    }
}
