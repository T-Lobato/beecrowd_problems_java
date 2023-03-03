import java.util.Scanner;

public class Ex1184 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        float[][] mat = new float[12][12];

        // Variáveis & Entrada
        String somaOuMedia = sc.nextLine();
        float soma = 0;
        int cont = 0;

        // Processamento
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextFloat();

                if (j < i) {
                    soma += mat[i][j];
                    cont++;
                }
            }
        }
        sc.close();
        // Processamento & Saída
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