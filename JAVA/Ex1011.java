import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        
        //variaveis & objetos
        Scanner sc = new Scanner(System.in);
        Double volume;
        final Double PI = 3.14159;

        //entrada
        Double raio = sc.nextDouble();

        //processamento 
        volume = (4.0/3) * PI * Math.pow(raio, 3);

        //saida
        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }  
}
