import java.util.Scanner;

public class Ex1179{ // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);
        int[] vetorPares = new int[5];
        int[] vetorImpares = new int[5];

        // Variáveis & Entrada
        int cont = 0;
        int n = 0;
        int indexPar = 0;
        int indexImpar = 0;
        
        // Processamento & Saída
        while(cont < 15) {
            n = sc.nextInt();
            
            if(n % 2 == 0) {
                     vetorPares[indexPar] = n;
                     indexPar++;
                     if(indexPar > 4) {
                         for (int i = 0; i < 5; i++) {
                             System.out.printf("par[%d] = %d\n", i, vetorPares[i]);
                             indexPar = 0;    
                    }
                }
                cont++;
            }
            else if (Math.abs(n % 2) == 1) {
                vetorImpares[indexImpar] = n;
                indexImpar++;
                if(indexImpar > 4) {
                    for (int i = 0; i < 5; i++) {
                        System.out.printf("impar[%d] = %d\n", i, vetorImpares[i]);
                        indexImpar = 0; 
                    }
                } 
                cont++;
            }
        }
        sc.close();
        for (int i = 0; i < indexImpar; i++) {
            System.out.printf("impar[%d] = %d\n", i, vetorImpares[i]);
        }
        for (int i = 0; i < indexPar; i++) {
            System.out.printf("par[%d] = %d\n", i, vetorPares[i]);
        }
    }
}