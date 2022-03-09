import java.util.Scanner;

public class Ex1151 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis & Entrada
        int entrada = sc.nextInt();
        sc.close();
        int[] vetor = new int[entrada];

        // Processamento
        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 1;
        for(int i = 3; i < entrada; i++ ) {
            vetor[i] = vetor[i-1] + vetor[i-2];
        }

       for(int i = 0; i < entrada; i++){
           System.out.printf("%d", vetor[i]);
           if(i < entrada - 1) System.out.printf(" ");
       }
       System.out.println();
    }
}