import java.util.Scanner;

public class Ex1178 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[101];

        // Variaveis & Entrada
        vetor[0] = sc.nextDouble();
        sc.close();

        // Processamento & Saída
        for(int i = 1, index = 0; i < 101; i++, index++) {
                vetor[i] = vetor[index] / 2;
                System.out.printf("N[%d] = %.4f\n", index, vetor[index]);
        }
    }
}