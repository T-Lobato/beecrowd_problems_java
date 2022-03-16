import java.util.Scanner;

public class Ex1177 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[1000];

        // Variáveis & Entrada
        int t = sc.nextInt();
        sc.close();
        int index = 0;
        
        // Processamento & Saída
            while(index < 1000) {
            for(int x = 0; x < t && index < 1000; x++, index++) {
                vetor[index] = x;
                System.out.printf("N[%d] = %d\n", index, vetor[index]);
            }
        }
    }
}