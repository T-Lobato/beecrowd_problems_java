import java.util.Scanner;

public class Ex1180 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int[] vetor = new int[sc.nextInt()];
        int minValue = 0;
        int position = 0;

        // Processamento
        vetor[0] = sc.nextInt();
        minValue = vetor[0];
        for(int i = 1; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();

            if(vetor[i] < minValue) {
            minValue = vetor[i];
            position = i;
            }  
        }
        sc.close();
        // Saida
        System.out.printf("Menor valor: %d\n", minValue);
        System.out.printf("Posicao: %d\n", position);
    }
} 