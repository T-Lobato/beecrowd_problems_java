import java.util.Scanner;

public class Ex1189 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis e Entrada
        String somaOuMedia = sc.nextLine();
        int cont = 0;
        double soma = 0d;

        // Processamento
        double[][] mat = new double[12][12];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextDouble();
                if (i > j && i + j < 11) {
                    soma += mat[i][j];
                    cont++;
                }
            }
        }
        sc.close();
        // Saída
        if(somaOuMedia.equals("S")) System.out.printf("%.1f\n", soma);
        else System.out.printf("%.1f\n", soma / cont);
    }
}