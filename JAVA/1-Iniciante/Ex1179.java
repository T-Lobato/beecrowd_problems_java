import java.util.Scanner;

public class Ex1179 { // Alterar o nome da classe para Main para funcionar no beecrowd
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
        while (cont < 15) {
            n = sc.nextInt();

            if (n % 2 == 0) {
                vetorPares[indexPar] = n;
                indexPar++;
                if (indexPar > 4) {
                    printVet(vetorPares, "par", 5);
                    indexPar = 0; 
                }
            } else {
                vetorImpares[indexImpar] = n;
                indexImpar++;
                if (indexImpar > 4) {
                    printVet(vetorImpares, "impar", 5);
                    indexImpar = 0; 
                }
            }
            cont++;
        }
        sc.close();
        printVet(vetorImpares, "impar", indexImpar);
        printVet(vetorPares, "par", indexPar);
    }

    public static void printVet(int[] vet, String parOuImpar, int n){
        for(int i = 0; i < n; i++)
            System.out.printf("%s[%d] = %d\n", parOuImpar, i, vet[i]);
    }
}