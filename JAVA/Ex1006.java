import java.util.Scanner;

public class Ex1006 {//Alterar o nome da classe para Main para funcionar no beecrowd

        public static void main(String[] args) {
            
            //variaveis
            double a, b, c, media, peso1 = 2, peso2 = 3, peso3 = 5;

            Scanner sc = new Scanner(System.in);

            //entrada
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            //processamento
            media = (a * peso1 + b * peso2 + c * peso3) / (peso1 + peso2 + peso3);

            //saida
            System.out.printf("MEDIA = %.1f\n", media);
            sc.close();         
    }
}