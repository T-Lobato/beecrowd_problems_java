import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1176 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) throws IOException{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variáveis & Entrada
        int numTestes = Integer.parseInt(br.readLine());
    
        // Processamento
        for(int i = 0; i < numTestes; i++) criaFibonacci(Integer.parseInt(br.readLine()));
    }

    // Método que cria um vetor com os números 
    // da Sequência de Fibonacci com 61 posições.
    public static void criaFibonacci(int index) {

        long[] vetor = new long[61];

        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 1;
        for(int i = 3; i <= index; i++) vetor[i] = vetor[i-1] + vetor[i-2];

        System.out.printf("Fib(%d) = %d\n", index, vetor[index]);
    }
}