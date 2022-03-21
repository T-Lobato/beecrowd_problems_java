import java.util.Scanner;

public class Ex1188 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        String somaOuMedia = sc.nextLine();
        double soma = 0d;
        int cont = 0;

        // Processamento
        double[][] mat = new double[12][12];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextDouble();

                if (i > j && i + j > 11) {
                    soma += mat[i][j];
                    cont++;
                }
            }
        }
        sc.close();
        // Saída
        switch (somaOuMedia) {
            case "S":
                System.out.printf("%.1f\n", soma);
                break;

            case "M":
                System.out.printf("%.1f\n", soma / cont);
                break;
        }
    }
}