import java.util.Scanner;

public class Ex1175 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        int[] vetor = new int[20];
        Scanner sc = new Scanner(System.in);

        //Processamento e Saída
         for(int i = 0; i < 20; i++) {
             vetor[i] = sc.nextInt(); 
         }
         sc.close();

         int[] vetorInvertido = new int[20];

         for(int i = 19, j = 0; i >= 0; i--, j++){
            vetorInvertido[j] = vetor[i];

            System.out.printf("N[%d] = %d\n", j, vetorInvertido[j]);
        }
    } 
}