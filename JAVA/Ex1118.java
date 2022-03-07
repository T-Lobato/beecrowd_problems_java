import java.util.Scanner;

public class Ex1118 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        int x = 1;
        // Processamento & Saída
        while(true) {

            float nota1 = sc.nextFloat();
            while(nota1 < 0.0 || nota1 > 10.0) {
            System.out.printf("nota invalida\n");
                nota1 = sc.nextFloat();
            }
            
            float nota2 = sc.nextFloat();
            while(nota2 < 0.0 || nota2 > 10.0) {
            System.out.printf("nota invalida\n");
            nota2 = sc.nextFloat();
            }
            
            System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
            
            System.out.printf("novo calculo (1-sim 2-nao)\n");
            x = sc.nextInt();

            while(x < 1 || x > 2) {
            System.out.printf("novo calculo (1-sim 2-nao)\n");
            x = sc.nextInt();
            }
            if(x == 2) break;         
        }
        sc.close();
    }
}