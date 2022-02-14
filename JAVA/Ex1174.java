import java.util.Scanner;

public class Ex1174 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];

        // Processamento e Saída
        for(int i = 0; i < vetor.length; i++) {
            double entrada = sc.nextDouble();
            if(entrada <= 10){
                vetor[i] = entrada;
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }     
        sc.close();   
    }
}