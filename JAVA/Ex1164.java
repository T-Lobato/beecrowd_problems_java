import java.util.Scanner;

public class Ex1164 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int numTestes = sc.nextInt();
        int somaTeste = 0;

        // Processamento & Saída
        for(int i = 0; i < numTestes; i++) {
            int n = sc.nextInt();

            for(int x = 1; x < n; x++) {
                if(n % x == 0) somaTeste += x;
            }

            if(somaTeste == n) System.out.printf("%d eh perfeito\n", n);

            else System.out.printf("%d nao eh perfeito\n", n);

            somaTeste = 0;

        }
        sc.close();
    }
}