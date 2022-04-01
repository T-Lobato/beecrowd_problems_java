import java.util.Scanner;

public class Ex1478 { // ALterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        
        // Variáveis
        int valor = 0;

        // Processamento / Entrada / Saída
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[][] mat = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j >= i) valor = (j - i) + 1;
                    else valor = (i - j) + 1;
                    mat[i][j] = valor;
                    if (j == 0) System.out.printf("%3d", mat[i][j]);
                    else System.out.printf("%4d", mat[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}