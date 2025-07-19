public class Fahrenheit {
    public static void main(String [] args){

        double celsius, fahrenheit;

        celsius = 10;
        fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " Graus Celsius são iguais a " + fahrenheit + " Graus Fahrenheit.");
        System.out.println(String.format("Os Graus Fahrenhei convertido em inteiro fica: %d",(int) (fahrenheit) ) );
    }
}
