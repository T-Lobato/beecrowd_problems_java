import java.util.Scanner;

public class Ex1012 { //Alterar o nome da classe para Main para funcionar no beecrowd

    public static void main(String[] args) {
        
        //variaveis & objetos
        final Double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        //variaveis & entradas
        String[] valores = sc.nextLine().split(" ");
        Double a = Double.parseDouble(valores[0]);
        Double b = Double.parseDouble(valores[1]);
        Double c = Double.parseDouble(valores[2]);

        //processamento
        Double triangulo = a * c /2;
        Double circulo = PI * Math.pow(c, 2);
        Double trapezio = ((a+b)*c)/2;
        Double quadrado = b*b;
        Double retangulo = a*b;

        //saida
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        sc.close();           
    }
}
