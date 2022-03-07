import java.util.Scanner;

public class Ex1182 { // Alterar o nome da classe para Main para funcionar no Beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        float[][] mat = new float[12][12];

        // Variáveis & Entradas
        int indiceColuna = sc.nextInt();
        sc.nextLine();
        String somaOuMedia = sc.nextLine();
        float soma = 0f;

        // Processamento & Saída
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextFloat();
            }
        }
        sc.close();

        for (int i = 0; i < 12; i++) {
            soma += mat[i][indiceColuna];
        }

        switch (somaOuMedia) {
            case "S":
                System.out.printf("%.1f\n", soma);
                break;
            case "M":
                System.out.printf("%.1f\n", soma / 12);
                break;
        }
    }
}