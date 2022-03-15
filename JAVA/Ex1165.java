import java.util.Scanner;

public class Ex1165 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int numTestes = sc.nextInt();
        int testePrimo = 2;

        // Processamento & Saída
        for(int i = 0; i < numTestes; i++) {
            int n = sc.nextInt();

            for(int x = 2; x < n; x++) if(n % x != 0) testePrimo++; 
            
            if(n == testePrimo) System.out.printf("%d eh primo\n", n);
            
            else System.out.printf("%d nao eh primo\n", n);

            testePrimo = 2;
        }
        sc.close();
    }
}